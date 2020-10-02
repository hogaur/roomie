(ns roomie.main
  (:require [ziggurat.init :as init]
            [ziggurat.middleware.default :as mw])
  (:import (com.gojek.esb.booking BookingLogMessage))
  (:gen-class))

(defn start []
  ;; Write your startup logic here
  )

(defn stop []
  ;; Write your shutdown logic here
  )

(defn mapper-fn
  "This is your message processing function."
  [message]
  ;; Return :success if the message was successfully processed.
  ;; Return :skip to skip the message and move to the next.
  ;; Return :retry to queue the message for retrying.
  :success)

(def handler-fn
  (-> mapper-fn
      (mw/protobuf->hash BookingLogMessage :booking)))


(defn -main [& args]
   (init/main {:start-fn start :stop-fn stop :modes [:api-server]}))
