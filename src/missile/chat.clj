(ns missile.chat
  (:require [clj-http.client :as client])
  (:require [missile.config :as config])
  (:require [clojure.data.json :as json]))

  (defn sendMessage [channel-id message]
    "send a test msg given a channel-id"
    (let [server-api-endpoint (str (config/server) "/api/v1/chat.sendMessage") ]
    ( json/read-str (:body ( client/post server-api-endpoint 
                                         {:form-params {:message {:rid channel-id :msg message }}
                                          :content-type :json 
                                          :headers {"X-Auth-Token" (config/token) "X-User-Id" (config/user)}})))))
