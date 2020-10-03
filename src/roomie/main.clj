(ns roomie.main
  (:require [ziggurat.init :as init]
            [ziggurat.middleware.default :as mw])
  (:gen-class))

(defn eventhandler
  [{:keys [params]}]
  (println params)
  {:status 200
   :body   (:challenge params)})

(def routes [["v1/events" {:post eventhandler}]])

(defn start []
  ;; Write your startup logic here
  )

(defn stop []
  ;; Write your shutdown logic here
  )

(defn -main [& args]
   (init/main {:start-fn start :stop-fn stop :modes [:api-server] :actor-routes routes}))
