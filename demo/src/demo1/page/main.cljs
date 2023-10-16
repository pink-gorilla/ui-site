(ns demo1.page.main
  (:require
   [site]
   [layout]
   [demo1.lib.site :refer [wrap-header]]))

(defn main-page []
  [:div

   [site/splash-message
    {:link-text "On Github"
     :link-url "https://github.com/pink-gorilla/goldly"
     :title ["Goldly lets you create "
             [:br]
             "realtime dashboards powered by clojure"]
     :title-small "open source"}]

   [site/cols-three {:title ["Use-cases"
                             [:br]
                             "just by using clojure"]
                     :link-text "Experienced team"
                     :link-href "#"
                     :cols [{:title "Dashboard" :text "Dashboards can load data from the server. Allow your users to change what they want to see"}
                            {:title "Notebook" :text "In a notebook you can use it for data exploration."}
                            {:title "Embedded" :text "Embed it to another website"}]}]

   [site/message-button
    {:tile  "message button"
     :text (site/ipsum 2)
     :link-text "Get In Touch"
     :link-href "#"}]

   ;
   ])

(def main-page-wrapped
  (wrap-header main-page))

