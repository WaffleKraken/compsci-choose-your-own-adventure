# Choose Your Own Adventure (AP Computer Science A)

A text-based choose-your-own-adventure game. You play a broke, Claude-addicted tax evader who owes the IRS money and has to decide between getting a job or walking 50 miles to the Hard Rock Casino to gamble their way out of debt.

The story is still being written. The working draft lives in the [Google Doc outline](https://docs.google.com/document/d/1hlTt3nQx5bQafacS68avEdTTKy2xBd-jFJq7MvOpKLQ/edit), and a snapshot of it is kept in [`docs/story/`](docs/story/).

## Folder layout

```
.
├── README.md            You are here
├── .gitignore           Keeps compiled .class files and OS junk out of GitHub
├── docs/
│   ├── open-questions.md    Gaps and decisions still to make in the story
│   └── story/               The story outline, one file per chapter
│       ├── README.md            Chapter list and flow chart
│       ├── 00-details.md
│       ├── 01-crippling-debt.md
│       ├── 02-job.md
│       ├── 03-road-to-casino.md
│       ├── 04-bosses.md
│       └── 05-casino.md
└── src/                 Java source files go here (empty for now)
```

## Working on this from more than one computer

Every time you sit down at a computer:

1. Open the folder in VS Code.
2. Pull first. Click the **Source Control** icon on the left (or press `Ctrl+Shift+G`), then the `...` menu, then **Pull**. This grabs whatever you pushed from the other computer.

When you're done for the session:

1. In Source Control, type a short message describing what you changed (e.g. "Add snake boss details").
2. Click **Commit**, then **Sync Changes** (or **Push**).

If you forget to pull before editing, VS Code may say the branches have diverged. Pulling usually fixes it; if it reports a merge conflict, VS Code will highlight the conflicting lines and let you pick which version to keep.

First time on a new computer: **Source Control → Clone Repository**, then paste `https://github.com/wafflekraken/compsci-choose-your-own-adventure`.
