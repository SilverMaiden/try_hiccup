(ns try-hiccup.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[try_hiccup started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[try_hiccup has shut down successfully]=-"))
   :middleware identity})
