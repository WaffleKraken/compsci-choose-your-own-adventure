# Details

**Theme:** Gambling

**Goal:** get $6,700 to pay the IRS before the deadline.

## Tracking variables

These are the values the game remembers from one chapter to the next. The [story map](../story-map.pdf) marks every spot where each one changes (green boxes) and every spot where the game checks it (orange diamonds).

| Variable | Type | Starts at | Changes in | Checked in |
|----------|------|-----------|------------|------------|
| `money` | int | 0 | Job (+$1 per correct order), Road (+$65 found), every boss, every casino bet, Cashing Out | Beggar (need $10), Hunger (need $8), Snake (need $15), after every boss (broke?), every casino bet (bet ≤ money, $0? $6,700?) |
| `irsDebt` | int | 6700 | Beggar miracle (set to 0), paying the IRS (set to 0) | Casino (is `money` ≥ `irsDebt`?) |
| `ordersServed` | int | 0 | +1 after every McDonald's order | Every 10 orders (break choice), 30 orders (shift over) |
| `strikes` | int | 0 | +1 for every order typed back wrong | 3 strikes = fired |
| `bossesLeft` | int | 3 | −1 after each boss, set to 0 by the Samaritan's ride | Road loop (any bosses left?) |
| `playerHP` / `muggerHP` | int | 100 / 100 | Every fight turn | After every fight turn (anyone at 0?) |
| `defendCooldown` / `deflectCooldown` | int | 0 / 0 | Set to 1 / 2 when used, −1 each turn | Before each fight turn (is the move allowed?) |
| `helpedBeggar` | boolean | false | Set to true if you give the Beggar $10 | Casino door (doorman gives a $50 chip) |
| `roundsLeft` | int | 20 | −1 after every casino game | After every casino game (sunrise?) |

## Endings

There are 13 endings. See [Endings](07-endings.md) for all of them.
