(ns demo.app
  (:require
   [taoensso.timbre :as timbre :refer [info warn]]
   [webly.config :refer [load-config! add-config]]
   [webly.user.app.app :refer [webly-run!]]
   [webly.profile :refer [compile? server?]]
   ; side-effects
   [demo.routes])
  (:gen-class))

(defn demo!
  [{:keys [config profile] ; a map so it can be consumed by tools deps -X
    :or {profile "jetty"
         config {}}}]
    (webly-run! profile config))

