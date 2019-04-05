(ns missile.channels
  (:require [clj-http.client :as client])
  (:require [missile.config :as config])
  (:require [clojure.data.json :as json]))

  (defn list! []
    "return a list of all rochetchat channels from server"
    (let [server-api-endpoint (str (config/server) "/api/v1/channels.list") ]
    ( json/read-str (:body ( client/get server-api-endpoint { :headers {"X-Auth-Token" (config/token) "X-User-Id" (config/user)}} )))))

  (defn info
    "Retrieves the information about a channel"
    [roomName]
    (let [server-api-endpoint (str (config/server) "/api/v1/channels.info?roomName=" roomName) ]
    ( json/read-str (:body ( client/get server-api-endpoint { :headers {"X-Auth-Token" (config/token) "X-User-Id" (config/user)}} )))))
