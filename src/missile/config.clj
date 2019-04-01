(ns missile.config)

  (defn read-config [config-file]
    (slurp config-file))
  
  ;; todo  make .missile.edn configurable for the path
  (def config-map
     (clojure.edn/read-string (read-config ".missile.edn")))
  
  (def user
    (-> config-map :credentials :username))
  
  (def token
    (-> config-map :credentials :token))
  
  (def server
    (-> config-map :credentials :server-url))
