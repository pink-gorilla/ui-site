


(defn ipsum-sidebar-fake
  (fn [] (into [:div.bg-red-200]
               (map (fn [i]
                      [:p (str "xxx-" i)]) (range 20)))))



[site/main-with-header
   [:div "header"] 30
      [site/sidebar-layout
      [ipsum-sidebar-fake]
      [:div.bg-green-400.height-full
      [site/ipsum 20]]]]
   

