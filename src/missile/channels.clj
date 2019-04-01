(ns missile.channels
  (:require [clj-http.client :as client])
  (:require [missile.config :as config]))

  ;; move this to channel namespace
  (defn list! []
    (let [server-api-endpoint (reduce str [config/server "/api/v1/channels.list"]) ]
    (client/get server-api-endpoint { :headers {"X-Auth-Token" config/token "X-User-Id" config/user} :debug true :debug-body true} )))
