(defproject internet-of-thing-server "0.1.0-SNAPSHOT"
  :description "Server For InternetOfThing"
  :url "https://github.com/joshuamiller/internet-of-thing-server"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.json "0.2.6"]
                 [uswitch/lambada "0.1.2"]
                 [environ "1.0.3"]
                 [io.nervous/fink-nottle "0.4.6"]]
  :plugins [[lein-environ "1.0.3"]]
  :uberjar-name "internet-of-thing.jar")
