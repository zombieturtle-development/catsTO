# Cardgame Agnostic Tournament Software (CATS)

---

### What is CATS?

***CATS*** is a cardgame-agnostic TCG tournament management suite, geared for Tournament Organizers and Event Staff running Trading Card Game competitive events. Additionally, it has flexibility to be used for online community events as well, with Discord bot integration to help facilitate this.

It is intuitive for the general user, is platform independent, and is written in ***Java 17*** using ***Swing***.
<br><br>
### Proposed Features
At the time of writing, ***CATS*** is still in it's initial planning and prototyping phases, with eventual development starting in the next few months.

Currently, the core highlights of the planned feature-set of ***CATS*** is as follows:
* A clean and intuitive interface, familiar to TOs and Event Staff but also digestible by the general user.
* Ability to track players and events, and save to a local ***SQLite*** database for portability and backup.
* Track event rounds and manage player pairings.
* Support for various major TCG's pairing/tiebreaker systems.
* Integrated round timer, with a displayable time-clock window that can show individual table timers, for time-adjusted tables.
* Per-event deck-list entry and storage, with game-specific enforceable deck constraints.
* Integration with Discord for remote-based events, using a companion self-hostable Discord bot, written in ***Java 17*** using the ***JDA*** Discord Bot Framework.