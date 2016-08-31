(ns user
  (:require [mount.core :as mount]
            try-hiccup.core))

(defn start []
  (mount/start-without #'try-hiccup.core/repl-server))

(defn stop []
  (mount/stop-except #'try-hiccup.core/repl-server))

(defn restart []
  (stop)
  (start))


