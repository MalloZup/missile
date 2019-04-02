(ns missile.channels
  (:require [clj-http.client :as client])
  (:require [missile.config :as config])
  (:require [clojure.data.json :as json]))

  ;; internal/private
  (defn get-list-channels []
    "return raw list rocket-chat channels, as defined by clj-http schema"
    (let [server-api-endpoint (reduce str [(config/server) "/api/v1/channels.list"]) ]
    (client/get server-api-endpoint { :headers {"X-Auth-Token" (config/token) "X-User-Id" (config/user)}} )))

  ;; public api
  (defn list! []
  "return a  json object, list of maps containining channel list"
    (json/read-str (:body (get-list-channels))))