(ns demo.app
  (:require
   [webly.user.app.app :refer [webly-run!]]
   ; side-effects
   [demo.routes :refer [routes-api routes-app]]
   [demo.events]
   [demo.page.main]
   [demo.page.ipsum]))

(defn ^:export start []
  (webly-run! routes-api routes-app))

