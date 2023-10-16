(ns demo1.lib.site
  (:require
   [re-frame.core :as rf]
   [site]
   [layout]))

(defn link-fn [fun text]
  [:a.bg-blue-300.cursor-pointer.hover:bg-red-700.m-1
   {:on-click fun} text])

(defn link-dispatch [rf-evt text]
  (link-fn #(rf/dispatch rf-evt) text))

(defn link-href [href text]
  [:a.bg-blue-300.cursor-pointer.hover:bg-red-700.m-1
   {:href href} text])

(defn header []
  [site/header-menu
   {:brand "ui-site"
    :brand-link "/"
    :items [{:text "main" :dispatch [:bidi/goto 'demo1.page.main/main-page-wrapped]}
            {:text "ipsum"  :dispatch [:bidi/goto 'demo1.page.ipsum/ipsum-page-wrapped]}
            {:text "ipsum-footer" :dispatch [:bidi/goto 'demo1.page.ipsum/ipsum-page-wrapped2]}
            {:text "fotos"  :dispatch [:bidi/goto 'demo1.page.fotos/fotos-page-wrapped]}
            {:text "feedback" :link "https://github.com/pink-gorilla/goldly/issues" :special? true}]}])

(defn wrap-header [page]
  (fn [route]
    [layout/header-main  ; .w-screen.h-screen
     [header]
     [:div.bg-green-400.height-full
      [page route]]]))

(defn wrap-header-footer [page]
  (fn [route]
    [layout/header-main-footer
     [header]  ;  [:div.bg-green-400.height-full
     [page route]
     [site/footer {:copyright "Open Source!"
                   :right "Served by Goldly"}]]))

; (rf/dispatch [:css/set-theme-component :tailwind-full "light"])
; (rf/dispatch [:css/set-theme-component :tailwind-girouette false])

