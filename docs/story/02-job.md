# Chapter 2: J\*b

- You apply to McDonald's and get hired as a cashier.
- Your first customer orders 600 water cups. Your boss says you have to do it.

**Minigame: order memory game** (`ordersServed = 0`, `strikes = 0` at the start)

1. A customer's order shows on screen for 3 seconds, then the screen clears.
2. You type the order back.
3. Right order: you "Serve order" and earn $1 (`money += 1`).
   Wrong order: `strikes += 1`. At **3 strikes** you're fired and head to the casino anyway ([Chapter 3](03-road-to-casino.md)).
4. Either way, `ordersServed += 1`.

**Choice (every 10 orders, on your break):**

1. Keep working → back to the memory game.
2. Quit and go gamble → [Chapter 3](03-road-to-casino.md). You keep the money you earned.
3. Give up and accept your fate → **Ending 2: Lifer**. At $1 an order you need 6,700 orders. You flip patties for 22 years, get promoted to shift manager, and finally pay the IRS off. You never touch Claude again. Mostly.

The shift ends at **30 orders**. After that, "keep working" is gone and you have to pick quit or give up.

The most you can bring out of the job is $30, which makes the road a little safer than going straight to the casino.

## Open questions

- [x] What happens if the user chooses **give up**? *Ending 2: Lifer.*
- [x] Where does the memory game fit with typing "Serve order"? *You only get the $1 if you type the order back correctly.*
- [x] If the user chooses **continue** after ten orders, when does the job end? *The shift ends at 30 orders.*
- [x] Is "quit" after ten orders the same as heading to the casino, or a separate choice from "give up"? *Separate. Quit = casino, give up = Lifer ending.*
- [ ] How long should orders get? Maybe start with 2 items and add one every 10 orders.
