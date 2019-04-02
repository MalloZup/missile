(ns missile.channels
  (:require [clj-http.client :as client])
  (:require [missile.config :as config]))

  ;; internal/private
  (defn get-list-channels []
    "list rocket-chat channels"
    (let [server-api-endpoint (reduce str [(config/server) "/api/v1/channels.list"]) ]
    (client/get server-api-endpoint { :headers {"X-Auth-Token" (config/token) "X-User-Id" (config/user)}} )))

  ;; public api
   ;; TODO: convert to json object
  (defn list! []
  "return a list of maps containining channel list"
    (:body (get-list-channels)))