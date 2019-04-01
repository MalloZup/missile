(ns missile.core
  (:require [clj-http.client :as client]))


  (defn init-client [server user pwd]
    (let [server-api-endpoint (reduce str [server "/api/v1/login"]) ]
    (println server-api-endpoint)
    (client/post server-api-endpoint {:basic-auth [user pwd] :insecure? true} )))
  
  (defn read-config [config-file]
    (slurp config-file))
  
  ;; make .missile.edn configurable for the path


  (def config-map
     (clojure.edn/read-string (read-config ".missile.edn")))
  
  (def get-rocket-user
    (-> config-map :credentials :username))
  
  (def get-rocket-token
    (-> config-map :credentials :token))
  
  (def get-rocket-server
    (-> config-map :credentials :server-url))
  
  (defn -main
    [& args]
    (let [response (init-client get-rocket-server get-rocket-user get-rocket-token)] 
      println (:status response)))
