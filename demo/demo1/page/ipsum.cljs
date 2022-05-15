


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


;(add-page ipsum-page :ipsum)

(add-page-menu ipsum-page :ipsum)

(add-page-menu-footer ipsum-page :ipsum-footer)






