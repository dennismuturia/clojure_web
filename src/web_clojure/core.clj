(ns web-clojure.core
  (:use compojure.core)
  (:use hiccup.core)
  (:use hiccup.page-helpers))

;;This is where the -hello world resided
;;Now we are creating a view
(defn view-layout [& content]
  (html
  (doctype :xhtml-strict)
  (xhtml-tag "en"
  [:head 
    [:meta {:http-equiv "content-type" :content "text/html; charset=utf-8"}]
    [:title "Simple webapp"]]
    [:body content]
  )))
;;Lets create a form that will get the userdata
(defn view-input[]
  (view-layout
    [:h2 "Let us add two numbers"]
    [:form {:method "post" action "/"}
      [:input.math {:type "text" :name "a"}][:span.math "+"]
      [:input.math {:type "text" :name"b"}][:br]
      [:input.action {:type "submit" :value "add"}]
    ]
  )
)
;;Shows the output of the sum 
(defn view-output [a b sum]
  (view-layout
    [:h2 "The sum of two numbers are....."]
    [:p.math a "+" b "=" sum]
    [:a.action {:'href "/"} "add more numbers"]
  )
)

;;parse the input
(defn parse-input [a b]
  [(Integer/parseInt a) (Integer/parseInt b)]
)

;;Setting the routes
(defroutes app
  (GET "/" []
    (view-input)
  )
  (POST "/" [a b]
    (let [[a b] (parse-input ab) sum (+ a b)]
      (view-output a b sum))
  )
)



