


(defn main-page []
  [:div
   [splash]
   [site/cols-three {:title ["Use-cases"
                             [:br]
                             "just by using clojure"]
                     :link-text "Experienced team"
                     :link-href "#"
                     :cols [{:title "Dashboard" :text "Dashboards can load data from the server. Allow your users to change what they want to see"}
                            {:title "Notebook" :text "In a notebook you can use it for data exploration."}
                            {:title "Embedded" :text "Embed it to another website"}]}]

   #_[t/message-button
      {:tile  "Lorem ipsum dolor sit amet"
       :text "Lorem ipsum dolor sit amet, consectetur adipiscing Ac aliquam ac\n                        volutpat, viverra magna risus aliquam massa."
       :link-text "Get In Touch"
       :link-href "#"}]

   #_[t/foto-bottom
      {:title ["Lorem ipsum dolor sit amet, "
               [:br] " consectetur adipiscing"]
       :text "Duis aute irure dolor in reprehenderit in voluptate velit esse\n                cillum\n                dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia\n                deserunt mollit anim id est laborum."
       :img-url "https://images.unsplash.com/photo-1600069226367-412873fb0637?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80"}]

         ;[t/people]
         ;[t/foto-right]
         ;[t/fotos-with-text]
         ;[t/bullet-points]
         ;[t/foto-left]

   [site/footer {:copyright "2019-2021 Pink Gorilla"
                 :right "Served by Goldly"}]

   #_[:div
      [:h1 "goldly demo"]

      [:p [link-dispatch [:bidi/goto :goldly/system-list] "goldly running systems"]]
      [:p [link-dispatch [:bidi/goto :ui/markdown :file "webly.md"] "webly docs"]]
      [:p [link-dispatch [:reframe10x-toggle] "tenx-toggle"]]]])



(add-page-template main-page :demo/main)

