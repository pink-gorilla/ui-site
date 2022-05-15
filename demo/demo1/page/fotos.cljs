
(defn fotos-page [r]
  [:div
  

   [site/foto-right {:title "foto right"
                     :text (site/ipsum 1)
                     :link-url "#"
                     :link-text "experienced team"
                     :img-url  "https://images.unsplash.com/photo-1618346136472-090de27fe8b4?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=673&q=80"}]

   [site/foto-left {:title "foto left"
                    :text (site/ipsum 1)
                    :link-text "many features"
                    :link-url "#"
                    :img-url "https://images.unsplash.com/photo-1616874535244-73aea5daadb9?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80"}]

   [site/foto-bottom {:title "foto-bottom"
                      #_["Lorem ipsum dolor sit amet, "
                         [:br] " consectetur adipiscing"]
                      :text (site/ipsum 1)
                      :img-url "https://images.unsplash.com/photo-1600069226367-412873fb0637?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80"}]

   [site/people]

   [site/fotos-with-text]
   [site/bullet-points]
   
   ])




(add-page-menu fotos-page :demo/fotos)

