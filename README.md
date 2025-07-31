# 🖋️ InkRibbon — IntelliJ Plugin

> _"A lone typewriter sits quietly in the corner.  
> Its ink ribbon is intact."_  
> — *Resident Evil 2*

---

Amid the chaos of code, between unknown bugs and builds that fail without reason, there is a safe place.  
**InkRibbon** is your typewriter. Your only method of salvation.

This plugin for IntelliJ IDEA is inspired by the legendary save system from *Resident Evil 2*.  
Instead of recording your survival against zombies, **it records your progress as a developer**.  
Markdown entries. Mental checkpoints. Reflections before going back to battle.

🕯️ **Light your lamp. Sit down. Write. And save.**

---

**InkRibbon** lets you:

- Select a folder where all your journal entries will be stored.
- Create `.md` files automatically named with the current date, just like save slots.
- Write your journal in a quiet, distraction-free interface.
- Keep your progress **within the plugin**, as if you'd never left the safe room.

> Because every developer needs their own **Safe Room**.

---

## ✨ Features

- 🗂️ Choose a target folder to store your Markdown entries.
- 📅 Automatically create a daily Markdown file (`YYYY-MM-DD.md`).
- 📝 Built-in text editor inside the ToolWindow.
- 💾 One-click persistent save of your writing.
- 🧘‍♂️ Simple, clean panel: write, reflect, and return to code.

---

## 📸 Screenshot (WIP)

> _Coming soon_

---

## 🚀 Installation

### From IntelliJ IDEA Marketplace

1. Open **Settings > Plugins**
2. Search for `InkRibbon`
3. Install and restart IntelliJ

### From `.zip` file

1. Clone or download this repository
2. Run the plugin in dev mode or build it using:
   ```bash
   ./gradlew buildPlugin
   ```
3. In IntelliJ: **Settings > Plugins > Install plugin from disk**

---

## 🗃️ Usage

1. Open the ToolWindow named "InkRibbon" from the side panel.
2. Select the folder where you'd like to store your journal entries (e.g. `~/Bitacoras`)
3. Click **"New Entry"** — a `YYYY-MM-DD.md` file will be created.
4. Write your entry in the built-in editor.
5. Click **"Save"** and continue your day.

> Entries are handled inside the plugin panel. No files are opened in the editor.

---

## 🧪 Roadmap (Planned)

- [ ] Recent entries history
- [ ] Navigable list of past entries
- [ ] Keyboard shortcuts
- [ ] Tagging and categorization support
- [ ] Resident Evil themed dark UI (Safe Room mode)
- [ ] Optional sync via Git, Dropbox, etc.

---

## ❤️ Credits

> This plugin is free and open source. If you use **InkRibbon** in public or distributed projects, we kindly ask you to include a visible credit.

✨ _Created with [InkRibbon](https://github.com/SemestralIndieGames/inkribbon-intellij-plugin)  
by [Semestral Indie Games](https://github.com/SemestralIndieGames)_

---

## 📄 License

This project is licensed under the MIT License.  
See the [`LICENSE`](./LICENSE) file for details.

---
