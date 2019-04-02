<p align="center"><img src="/logo/logotype-horizontal.png"></p>

# missile
rocketchat-rest-client clojure library

# Install:

- Add this library to your project (leinigen)

`[missile "0.1.0"]`

(https://clojars.org/missile)

## Quickstart:

### Setup:
You can choose to Initialize the `missile` library with: 1) a file.edn or 2) user-paramter.

1) from a file:
`(missile.config/set-config-from-file "path-config-file.edn")`  have a look at (resource for a valid template of the file.

2) from an input parameter:

`(missile.config/set-config-from-input {:username "foo2" :server-url "myserver" :token "foo"})`


### Library:

use calls of library like
`(missile.channels/list!)` for listing all rocket-chat server channels

A namespace correspond to the corrispondent `rocketchat` namespace, e.g `clojure` channels reflect `/v1/channels` etc.

See status for a list of supported calls.

# Status:

Under active devel

Supprted calls ordered by namespace


### Channel:
https://rocket.chat/docs/developer-guides/rest-api/channels/

- [x] `/api/v1/channels.list` `(missile.channels/list!)` Return a json object spec. by rocketchat.


# High-order values:

- minimalism
- open to community but driven by quality
- patience and listen to contributors
- maintainers are free to join and go

##  Where is this library used?

- A reminder bot for Rocketchat
https://github.com/MalloZup/fullrocketmetal


# Devel usage:

create a `.missile.edn`

with `{:credentials  {:username "my-user-name" :server-url "https://server-url.com" :token "my-token"}}`

Use `lein repl`

`(missile.config/read-config-file "path-config-file.edn")` loading  credentials (user/server/token)
`(missile.channels/list!)` for listing all rocket-chat server channels

#
