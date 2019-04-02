(ns missile.config)

(def config (atom {}))

  (defn read-config-file
    "by default read config in current dir, otherwise user can specify full-path of edn file"
    ([] (read-config-file ".missile.edn")) 
    ([config-file]  (swap! config merge (clojure.edn/read-string (slurp config-file) ) )))

  (defn user []
    (get-in @config [:credentials :username]))
  
  (defn token []
    (get-in @config [:credentials :token]))
  
  (defn server []
    (get-in @config [:credentials :server-url]))
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     