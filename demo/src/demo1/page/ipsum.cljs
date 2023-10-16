(ns demo1.page.ipsum
  (:require
   [site]
   [layout]
   [demo1.lib.site :refer [wrap-header wrap-header-footer]]))

(defn ipsum-sidebar-fake []
  (into [:div.bg-red-200.w-64]
        (map (fn [i]
               [:p (str "xxx-" i)])
             (range 20))))

(defn ipsum-page [{:keys [route-params query-params handler] :as route}]
  [layout/sidebar-main
   [ipsum-sidebar-fake]
   [:div.bg-green-400.height-full
    [site/ipsum 20]]])

(def ipsum-page-wrapped (wrap-header ipsum-page))

(def ipsum-page-wrapped2 (wrap-header-footer ipsum-page))






