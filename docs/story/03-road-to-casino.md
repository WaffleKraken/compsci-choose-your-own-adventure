# Chapter 3: On the Way to the Casino

- You find **$65** on the ground (`money += 65`). Anything you earned at McDonald's comes with you.
- The Hard Rock Casino is 50 miles away and you have to walk.
- The game shuffles the 5 [bosses](04-bosses.md) and you face **3 of them**, picked at random (`bossesLeft = 3`).

**The road loop** (repeats until `bossesLeft` is 0):

1. Walking text, then a 3-second pause.
2. You face the next boss from the shuffled list.
3. `bossesLeft -= 1`.
4. **Check `money`:** if you're at $0 → **Ending 3: Stranded**. You sit down on the side of the highway with empty pockets. The casino lights are still 30 miles away.

After the last boss, you see the Hard Rock Casino in the distance → [Chapter 5](05-casino.md).

Taking the Samaritan's ride skips straight to the casino (`bossesLeft = 0`).

## Open questions

- [x] This chapter says the user faces **3** bosses, but the Bosses page lists **5**. *3 picked at random from the 5, so each playthrough is different.*
- [x] Is the 10-second delay between bosses a real wait, or just a pause in the text? *A real 3-second pause (`Thread.sleep(3000)`). Ten seconds gets boring on a replay.*
- [x] The user starts with $65. What happens if they run out before reaching the casino? *Ending 3: Stranded.*
