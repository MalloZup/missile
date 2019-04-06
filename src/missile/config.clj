(ns missile.config)

(def config (atom {}))

  (defn set-config-from-file
    "by default read config in current dir, otherwise user can specify full-path of edn file"
    ([] (set-config-from-file ".missile.edn")) 
    ([config-file]  (swap! config merge (clojure.edn/read-string (slurp config-file) ) )))

  (defn set-config-from-input [{:keys [username server-url token]} ]
     "an user can setup config from parameter instead of file"
     (swap! config merge {:credentials  {:username username :server-url server-url :token token}})
    )

  (defn user []
    (get-in @config [:credentials :username]))
  
  (defn token []
    (get-in @config [:credentials :token]))
  
  (defn server []
    (get-in @config [:credentials :server-url]))
