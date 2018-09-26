(use 'ring.adapter.jetty)
(require 'web-clojure.core)

(run-jetty #'web_clojure.core/app {:port 8080})