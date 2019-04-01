(ns missile.channels
  (:require [clj-http.client :as client])
  (:require [missile.config :as config]))

  (defn list! []
    "list rocket-chat channels"
    (let [server-api-endpoint (reduce str [config/server "/api/v1/channels.list"]) ]
    (client/get server-api-endpoint { :headers {"X-Auth-Token" config/token "X-User-Id" config/user}} )))
