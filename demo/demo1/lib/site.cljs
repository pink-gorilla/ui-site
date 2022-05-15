

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
   {:brand "fotos (ui-site)"
    :brand-link "/"
    :items [{:text "main" :dispatch [:bidi/goto :demo/main] }  ; :link "/"
            {:text "ipsum"  :dispatch [:bidi/goto :ipsum] } ; :link "/ipsum"
            {:text "ipsum-footer" :dispatch [:bidi/goto :ipsum-footer]} ; :link "/ipsum-footer"
            {:text "fotos"  :dispatch [:bidi/goto :demo/fotos] } ; :link "/template"
            {:text "devtools"  :dispatch [:bidi/goto :devtools]} 
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

(defn add-page-menu [page name]
  (add-page (wrap-header page) name))

(defn add-page-menu-footer [page name]
  (add-page (wrap-header-footer page) name))


 (rf/dispatch [:css/set-theme-component :tailwind-full "light"])
 (rf/dispatch [:css/set-theme-component :tailwind-girouette false])

