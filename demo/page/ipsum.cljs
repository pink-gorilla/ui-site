


(defn ipsum-sidebar-fake
  [] (into [:div.bg-red-200]
           (map (fn [i]
                  [:p (str "xxx-" i)]) (range 20))))


(defn ipsum-page [{:keys [route-params query-params handler] :as route}]
   [site/sidebar-layout
    [ipsum-sidebar-fake]
    [:div.bg-green-400.height-full
     [site/ipsum 20]
     ]])

(add-page-template ipsum-page :ipsum)







