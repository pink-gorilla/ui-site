(ns ui.site.layout)

(defn main-with-header [header header-height main]
  [:div
   {:style {:width "100vw"
            :height "100vh"
            :display "grid"
            :grid-template-rows (str header-height "px 1fr")}}
   [:div {:style {:grid-column "1/-1"}}
    header]
   [:div {:style {:height "100%"
                  :max-height "100%"
                  :width "100%"
                  :overflow "auto"}}
    main]])

(defn sidebar-layout [sidebar main]
  [:div {:style {:display "grid"
                 :height "100%"
                 :grid-template-columns "15vh 1fr"
                 :grid-template-rows "1fr"}}
   sidebar
   [:div.overflow-auto.m-0.p-0
    {:style {:height "100%"
             :max-height "100%"}}
    main]])

