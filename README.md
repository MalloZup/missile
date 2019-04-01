<p align="center"><img src="/logo/logotype-horizontal.png"></p>

# missile
rocketchat-rest-client clojure library

# Usage:

- Add this library to your project: 

`[missile "0.1.0-SNAPSHOT"]`

(https://clojars.org/missile)

- Devel usage:

create a `.missile.edn`

with `{:credentials  {:username "my-user-name" :server-url "https://server-url.com" :token "my-token"}}`

Use `lein repl`

And `(missile.channels/list!)` for listing all rocket-chat server channels

# Status:

Under active devel


# High-order values:

- minimalism
- open to community but driven by quality
- patience and listen to contributors
- maintainers are free to join and go

##  Where is this library used?

- A reminder bot for Rocketchat
https://github.com/MalloZup/fullrocketmetal
