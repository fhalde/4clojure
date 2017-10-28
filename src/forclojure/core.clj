(ns forclojure.core)

(defn prob-1 [] (= "HELLO WORLD" (.toUpperCase "hello world")))
(defn prob-1-ans [] "HELLO WORLD")

(defn prob-2 [] (= true true))
(defn prob-2-ans [] true)

(defn prob-3 [] (= (- 10 (* 2 3)) 4))
(defn prob-3-ans [] 4)

(defn prob-4 [] (= (list :a :b :c) '(:a :b :c)))
(defn prob-4-ans [] '(:a :b :c))

(defn prob-5 [] (= (- 10 (* 2 3)) 4))
(defn prob-5-ans [] 4)

(defn prob-6 [] (set '(:a :b :a :c :d)))
(defn prob-6-ans [] #{:a :b :c :d})





