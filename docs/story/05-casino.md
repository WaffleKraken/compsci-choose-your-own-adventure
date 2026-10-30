# Chapter 5: Casino Pt. 1

- You arrive at the Hard Rock Casino.
- The doorman gives you a tour of the casino floor as a tutorial. You can't skip it, but you can spam Enter through it.
- **Check `helpedBeggar`:** if you gave the Beggar $10, the doorman says "My grandma told me about you" and hands you a $50 chip (`money += 50`).
- It's the last night before the IRS deadline. You have until sunrise: **20 rounds** (`roundsLeft = 20`).

**The casino loop** (play games in any order):

1. Pick a game from the menu.
2. Place a bet. **Check:** the bet has to be between $1 and `money`.
3. Play. `money` goes up or down by the result.
4. `roundsLeft -= 1`.
5. **Check, in this order:**
   - `money` ≥ `irsDebt` ($6,700) → [Chapter 6: Cashing Out](06-cashing-out.md)
   - `money` is $0 → **Ending 8: The House Always Wins.** Security walks you out. The IRS agent waiting in the parking lot already has the cuffs out.
   - `roundsLeft` is 0 → **Ending 9: Sunrise.** The sun comes up, the deadline passes, and you're still short. The IRS takes everything you've got and you go to jail anyway.
   - Otherwise → back to the menu.

## The games

| Game | How it works | Payout |
|------|--------------|--------|
| Blackjack | You vs. the dealer, get closer to 21 without going over | Win 1:1, blackjack 3:2, tie gets your bet back |
| Poker | 5-card hand vs. the dealer's, higher hand wins | Win 1:1 |
| Roulette | Bet on a color or a single number (0–36) | Color 1:1, number 35:1 |
| Slots | Three reels | 3 matching 10:1, three 7s 50:1 |
| Horse racing | Pick 1 of 5 horses | Odds from 2:1 (favorite) to 20:1 (long shot) |

Going from $65 to $6,700 in 20 rounds means you can't play it safe. Betting small on blackjack all night won't get you there; you have to take a few long shots.

## Open questions

- [x] How does the user lose at the casino? *Hitting $0 (Ending 8) or running out of rounds before sunrise (Ending 9).*
- [x] "Casino Pt. 1" suggests a Pt. 2. What happens after the user reaches $6,700? *[Chapter 6: Cashing Out](06-cashing-out.md).*
- [ ] Is 20 rounds the right length? Playtest it once the games are coded.
- [ ] Should there be a minimum bet so you can't stall with $1 bets?
