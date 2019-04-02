<p align="center"><img src="/logo/logotype-horizontal.png"></p>

# missile
rocketchat-rest-client clojure library

# Usage:

- Add this library to your project: 

`[missile "0.1.0-SNAPSHOT"]`

(https://clojars.org/missile)

In your application:

1) Initialize credential with 
`(missile.config/read-config-file "path-config-file.edn")` loading  credentials (user/server/token)

2) use calls of library like
`(missile.channels/list!)` for listing all rocket-chat server channels


# Devel usage:

create a `.missile.edn`

with `{:credentials  {:username "my-user-name" :server-url "https://server-url.com" :token "my-token"}}`

Use `lein repl`

`(missile.config/read-config-file "path-config-file.edn")` loading  credentials (user/server/token)
`(missile.channels/list!)` for listing all rocket-chat server channels

# Status:

Under active devel

Supprted calls ordered by namespace


### Channel:
https://rocket.chat/docs/developer-guides/rest-api/channels/

* `/api/v1/channels.list` -> WIP



# High-order values:

- minimalism
- open to community but driven by quality
- patience and listen to contributors
- maintainers are free to join and go

##  Where is this library used?

- A reminder bot for Rocketchat
https://github.com/MalloZup/fullrocketmetal
