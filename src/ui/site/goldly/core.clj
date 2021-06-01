(ns ui.site.goldly.core
  (:require
   [goldly.sci.bindings :refer [add-cljs-namespace add-cljs-bindings]]))

(add-cljs-namespace [ui.site.goldly.core]) ; add pinkie renderer


(add-cljs-bindings {'ipsum ui.site.ipsum/ipsum
                    'foto-bottom ui.site.template/foto-bottom})

