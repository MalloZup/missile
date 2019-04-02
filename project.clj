(defproject missile "0.1.0"
  :description "rocketchat rest-http library"
  :url "https://github.com/MalloZup/missile"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [clj-http "3.9.1"]
                 [org.clojure/data.json "0.2.6"]]
  :main ^:skip-aot missile.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
