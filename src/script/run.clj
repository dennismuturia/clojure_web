(use 'ring.adapter.jetty)
(require 'web_clojure.core)

(run-jetty #'web-clojure.core/app {:port 8080})