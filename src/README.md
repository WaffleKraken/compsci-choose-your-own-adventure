# Code

All Java files go somewhere inside this `src/` folder.

| Folder | What goes in it | Story pages |
|--------|-----------------|-------------|
| `src/` (here) | `Main.java`, the file you run. It starts the game and moves the player from chapter to chapter. | [Story overview](../docs/story/README.md) |
| [`chapters/`](chapters/) | One class per chapter: the story text and the choices the player makes. | Chapters 1, 2, 3, 5, 6, Endings |
| [`bosses/`](bosses/) | One class per boss on the road to the casino. | [Bosses](../docs/story/04-bosses.md) |
| [`minigames/`](minigames/) | Anything the player actually plays: the McDonald's order game, the mugger fight, the casino games. | Chapters 2, 4, 5 |
| [`player/`](player/) | What the player carries between chapters: money, IRS debt, and the other [tracking variables](../docs/story/00-details.md#tracking-variables). | All |

## The one rule about folders in Java

A file inside a folder has to say which folder it's in on its **first line**. For example, a file at `src/bosses/Mugger.java` must start with:

```java
package bosses;
```

`Main.java` sits directly in `src/`, so it doesn't need a `package` line. To use a class from another folder, add an `import` line near the top, e.g. `import bosses.Mugger;`.

If you'd rather skip packages for now, you can put every `.java` file directly in `src/` instead. The folders are there to keep things tidy once the project grows.
