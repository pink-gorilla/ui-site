(ns demo.routes)

(def routes-app
  {"" :demo/main ; so / route goes also to :goldly/about
   "ipsum" :demo/ipsum})

(def routes-api
  {})