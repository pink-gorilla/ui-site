(ns ui.site.goldly.core
  (:require
   [goldly.sci.bindings :refer [add-cljs-namespace add-cljs-bindings]]))

(add-cljs-namespace [ui.site.goldly.core]) ; add pinkie renderer


(add-cljs-bindings {'ipsum ui.site.ipsum/ipsum

                    'sidebar-layout ui.site.layout/sidebar-layout
                    'main-with-header ui.site.layout/main-with-header

                    'foto-bottom ui.site.template/foto-bottom
                    'foto-right ui.site.template/foto-right
                    'foto-left ui.site.template/foto-left

                    'message-button ui.site.template/message-button

                    'people ui.site.template/people
                    'bullet-points ui.site.template/bullet-points
                    'fotos-with-text ui.site.template/fotos-with-text})

