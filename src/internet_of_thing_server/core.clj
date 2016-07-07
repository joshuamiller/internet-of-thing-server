(ns internet-of-thing-server.core
  (:require [clojure.core.async :refer [<!!]]
            [clojure.data.json :as json]
            [clojure.java.io :as io]
            [environ.core :refer [env]]
            [fink-nottle.sqs :as sqs]
            [uswitch.lambada.core :refer [deflambdafn]]))

(def creds
  {:access-key ""
   :secret-key ""})

(def queue-url "")

(defn handle-event
  [event]
  (println (pr-str event))
  (let [ch (sqs/send-message! creds queue-url {:body (pr-str event)})
        res (<!! ch)]
    (println res)
    {:status "ok"}))

(deflambdafn io.joshmiller.InternetOfThing
  [in out ctx]
  (let [event (json/read (io/reader in))
        res (handle-event event)]
    (with-open [w (io/writer out)]
      (json/write res w))))
