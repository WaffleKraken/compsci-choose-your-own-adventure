# Chapter 6: Cashing Out (Casino Pt. 2)

You hit $6,700. You walk up to the cashier window with the chips, and the guy at the High Roller table waves you over.

**Choice:**

1. Cash out and pay the IRS → `money -= 6700`, `irsDebt = 0` → **Ending 10: Debt Free.** You walk out at sunrise owing nobody anything. The game shows how much you have left over.
2. One last bet at the High Roller table: double or nothing on everything you have.
   - 48% → `money *= 2` → **Ending 11: High Roller.** You pay the IRS and walk out with $6,700+ to spare. You buy a year of Claude Max on the way home. Some habits don't die.
   - 52% → `money = 0` → **Ending 12: Greed.** You had it. You had all of it. The IRS agent is waiting in the lobby.
3. Spend it all on Claude tokens → `money = 0` → **Ending 13: Relapse.** You went 50 miles, survived the road, beat the casino, and blew it on tokens in one night. The IRS shows up at sunrise. Claude writes a very good legal defense. It doesn't help.

The High Roller bet is 48% instead of 50% because the house always keeps an edge.

## Open questions

- [ ] Should the High Roller table be a real game (one hand of blackjack) or a coin flip?
