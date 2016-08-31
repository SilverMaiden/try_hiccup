(ns try-hiccup.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [try-hiccup.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[try_hiccup started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[try_hiccup has shut down successfully]=-"))
   :middleware wrap-dev})
