(require 'cemerick.pomegranate.aether)
(cemerick.pomegranate.aether/register-wagon-factory!
  "http" #(org.apache.maven.wagon.providers.http.HttpWagon.))

(defproject roomie "0.0.1"
  :description "Best roomie ever!"
  :url "http://example.com/FIXME"
  :uberjar-name "roomie.jar"
  :dependencies [[com.gojek.esb/esb-log-entities "3.32.00"]
                 [tech.gojek/ziggurat "3.4.0"]
                 [org.apache.logging.log4j/log4j-core "2.7"]
                 [org.apache.logging.log4j/log4j-slf4j-impl "2.7"]
                 [org.clojure/clojure "1.9.0"]]
  :repositories {}
  :java-source-paths ["src"]
  :jvm-opts ["-server" "-XX:-OmitStackTraceInFastThrow"]
  :main ^:skip-aot roomie.main
  :profiles {:uberjar {:aot         :all
                       :main        roomie.main
                       :global-vars {*warn-on-reflection* true}}}
  :plugins [])
