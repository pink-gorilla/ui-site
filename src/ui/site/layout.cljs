(ns ui.site.layout)

(defn header-main
  "A layout of a header with a main panel.
   The header has to define its height.
   The main element will get the remaining space in the screen."
  [header main]
  ; https://css-tricks.com/how-to-use-css-grid-for-sticky-headers-and-footers/
  [:div
   {:style {:width "100vw"
            :height "100vh"
            :margin 0
            :display "grid"
            :grid-template-columns "1fr"
            :grid-template-rows "auto 1fr"}}
   header
   [:div {:style {:height "100%"
                  :min-height "100%"
                  :max-height "100%"
                  :width "100%"
                  :min-width "100%"
                  :max-width "100%"
                  :overflow "auto"}}
    main]])

(defn header-main-footer
  "A layout of a header, footer and main panel.
   The header has to define its height.
   The footer is sticky and hs to define its height.
   The main element will get the remaining space in the screen."
  [header main footer]
  ; https://css-tricks.com/how-to-use-css-grid-for-sticky-headers-and-footers/
  [:div
   {:style {:width "100vw"
            :height "100vh"
            :margin 0
            :display "grid"
            :grid-template-columns "1fr"
            :grid-template-rows "auto 1fr auto"}}
   header
   [:div {:style {:height "100%"
                  :min-height "100%"
                  :max-height "100%"
                  :width "100%"
                  :min-width "100%"
                  :max-width "100%"
                  :overflow "auto"}}
    main]
   footer])

(defn sidebar-main
  "A layout of a left-sidebar and main panel.
   The sidebar has to define its width.
   The main element will get the remaining space in the screen."
  [sidebar-left main]
  [:div {:style {:display "grid"
                 :height "100%"
                 :grid-template-columns "auto 1fr"
                 :grid-template-rows "1fr"}}
   sidebar-left
   [:div.overflow-auto.m-0.p-0
    {:style {:height "100%"
             :max-height "100%"
             :min-height "100%"}}
    main]])

