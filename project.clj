(defproject web-clojure "0.1.0-SNAPSHOT"
  :description "This is a simple web app"
  :dependencies [[org.clojure/clojure "1.8.0"]
    [org.clojure/clojure-contrib "1.8.0"]
    [ring/ring-core "0.2.5"]
    [ring/ring-devel "0.2.5"]
    [ring/ring-jetty-adapter "0.2.5"]
    [compojure "0.4.0"]
    [hiccup "0.2.6"]]
  :dev-dependencies [[lein-run "1.0.0-SNAPSHOT"]]
  :main ^:skip-aot web-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
