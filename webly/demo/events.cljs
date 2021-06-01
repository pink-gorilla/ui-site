(ns demo.events
  (:require
   [taoensso.timbre :as timbre :refer [info]]
   [re-frame.core :as rf]))

(rf/reg-event-db
 :demo/init
 (fn [db [_]]
   (info "demo starting ..")
   (rf/dispatch [:webly/status :running])
   db))

