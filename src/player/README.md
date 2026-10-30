# Player

What the player carries from one chapter to the next. Each file starts with `package player;`.

| Suggested file | What it keeps track of |
|----------------|------------------------|
| `Player.java` | `money` (starts at $0, +$65 on the road), `irsDebt` ($6,700), `helpedBeggar` (checked at the casino door). Full list: [tracking variables](../../docs/story/00-details.md#tracking-variables) |

Variables that only matter inside one chapter, like `strikes`, `playerHP`, or `roundsLeft`, can live in that chapter's or minigame's class instead.
