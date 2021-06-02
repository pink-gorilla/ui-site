(ns ui.site.goldly.snippets
  (:require
   [systems.snippet-registry :refer [add-snippet]]))

; examples are separate,
; because we want to be able to not load editor snippets 
; in normal goldly configurations.

(add-snippet {:type :goldly
              :category :site
              :id :ipsum
              :filename "snippets/site/ipsum.clj"})

(add-snippet {:type :goldly-clj
              :category :site
              :id :ipsum-sidebar
              :filename "snippets/site/ipsum_sidebar.clj"})

(add-snippet {:type :goldly
              :category :site
              :id :template
              :filename "snippets/site/template.clj"})
