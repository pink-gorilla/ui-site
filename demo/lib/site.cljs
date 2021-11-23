

(defn link-fn [fun text]
  [:a.bg-blue-300.cursor-pointer.hover:bg-red-700.m-1
   {:on-click fun} text])

(defn link-dispatch [rf-evt text]
  (link-fn #(rf/dispatch rf-evt) text))

(defn link-href [href text]
  [:a.bg-blue-300.cursor-pointer.hover:bg-red-700.m-1
   {:href href} text])



(defn splash []
  [site/splash-message
   {:link-text "On Github"
    :link-url "https://github.com/pink-gorilla/goldly"
    :title ["Goldly lets you create "
            [:br]
            "realtime dashboards powered by clojure"]
    :title-small "open source"}])

(defn header []
  [site/header-menu
   {:brand "ui-site"
    :brand-link "/"
    :items [{:text "ipsum" :link "/ipsum"}
            {:text "main" :link "/"}
            {:text "template" :link "/template"}
            {:text "feedback" :link "https://github.com/pink-gorilla/goldly/issues" :special? true}]}])


(defn add-page-template [page name]
  (let [wrapped-page (fn [route]
                       [site/main-with-header
                        [header]
                        80
                        [:div.bg-green-400.height-full
                         [page]]])]
    (add-page wrapped-page name)))