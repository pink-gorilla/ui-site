(ns demo.site
  (:require
   [ui.site.template :as template]))

(defn splash []
  [template/splash-message
   {:link-text "On Github"
    :link-url "https://github.com/pink-gorilla/goldly"
    :title ["Goldly lets you create "
            [:br]
            "realtime dashboards powered by clojure"]
    :title-small "open source"}])

(defn header []
  [template/header-menu
   {:brand "ui-site"
    :brand-link "/"
    :items [{:text "ipsum" :link "/ipsum"}
            {:text "main" :link "/"}
            {:text "feedback" :link "https://github.com/pink-gorilla/notebook/issues" :special? true}
            ]}])
