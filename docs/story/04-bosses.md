# Chapter 4: Bosses

Encounters on the road to the casino. You meet 3 of these 5, in random order. After each one, the game checks whether you're broke ([Chapter 3](03-road-to-casino.md)).

## Boss 1: Mugger

- You come across a mugger who wants your money.

**Choice:** fight or flee.

- **Flee:** 50% you get away with your money. 50% you get caught and have to fight.
- **Fight:** a turn-based battle. You and the mugger both start at 100 HP (`playerHP`, `muggerHP`).

| Move | What it does | Cooldown |
|------|--------------|----------|
| Attack | Deals 10–20 damage | none |
| Defend | Take half damage this turn | 1 turn |
| Deflect | Bounce the mugger's attack back at him | 2 turns |

The mugger picks his move at random from the moves he's allowed to use. The fight loops until someone hits 0 HP.

- **You win:** he drops his wallet. `money += 20`.
- **You lose:** he takes $50 (`money -= 50`, or everything if you have less). Not a game over by itself, but if it leaves you at $0 the road check gives you Ending 3: Stranded.

## Boss 2: Beggar

- You meet a sweet old homeless lady.

**Choice:** give her $10, or walk past. The give option only shows up if `money` ≥ 10.

If you give her $10 (`money -= 10`, `helpedBeggar = true`), she pulls a scratch-off ticket out of her coat and hands it to you:

- 1% → **Ending 7: Miracle.** She's the IRS Commissioner's mother. She makes one phone call and your debt is gone (`irsDebt = 0`). The game ends on the spot.
- 60% → it's a winner. `money += 100`.
- 39% → nothing. She thanks you anyway. (`helpedBeggar` still pays off at the casino.)

These can't both happen: the game rolls once.

## Boss 3: Kind Samaritan

- A stranger pulls over and offers you a ride to the casino.

**Choice:** take the ride, or keep walking.

- Take it, 2% → **Ending 5: Kidnapped.** The child locks click. Game over.
- Take it, 98% → they drop you at the casino door. `bossesLeft = 0`, so you skip any bosses you had left.
- Keep walking → nothing changes.

## Boss 4: Hunger

- You walk past a Popeyes and you're starving. No choice here.
- **Check `money` ≥ 8:**
  - Yes → you buy a 3-piece. `money -= 8`.
  - No → **Ending 4: Dine and Dash.** You eat it and run. The manager catches you, the cops run your name, and up pops an IRS warrant.

## Boss 5: Snake

- A rattlesnake bites you.

**Choice:** buy ointment ($15), or tough it out. The ointment option only shows up if `money` ≥ 15. If you can't afford it, you have to tough it out.

- Ointment → `money -= 15`. You're fine.
- Tough it out, 70% → you're fine.
- Tough it out, 30% → **Ending 6: Snakebite.** You die on the shoulder of the highway, 20 miles from the slots.

## Open questions

- [x] Is losing the mugger fight a game over, or does the player just lose $50? *Just $50. It only ends the game if it leaves you broke.*
- [x] What happens the other 98% of the time the user takes the Samaritan's ride? *They drive you to the casino and you skip the rest of the bosses.*
- [x] Does the 1% IRS debt forgiveness from the Beggar end the game on the spot? *Yes. It's the secret ending.*
- [ ] Does `playerHP` carry over after the fight, or reset? Right now it only matters inside the fight.
