(require '[goldly.system :as goldly])
(require '[goldly.runner :refer [system-start!]])

(system-start!
 (goldly/system
  {:id :ipsum-sidebar
   :state 42
   :html  [site/main-with-header
           [:div "header"] 30
           [site/sidebar-layout
            [?sidebar]
            [:div.bg-green-400.height-full
             [site/ipsum 20]]]]
   :fns {:incr (fn [_ s] (inc s))}
   :fns-raw {:sidebar (fn [] (into [:div.bg-red-200]
                                   (map (fn [i]
                                          [:p (str "xxx-" i)]) (range 20))))}}
  {:fns {}}))



