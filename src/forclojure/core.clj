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

(defn prob-7 [] (= '(1 1 2 3) (conj '(1 2 3) 1)))
(defn prob-8 [] (=  [1 2 3 1] (conj  [1 2 3] 1)))
(defn prob-9 [] (= #{1 2 3}   (conj #{1 2 3} 1))) 
(defn prob-14 [] (= {:a 1 :b 2 :c 3}   (conj {:a 1 :b 2} [:c 3])))

(defn prob-10 [] (vec '(1 2 3)))
(defn prob-10 [] (vector 1 2 3))
(defn prob-11 [] (hash-map :a 1 :b 2))

(defn prob-12 [] ((prob-11) :b))
(defn prob-13 [] (:b (prob-11)))

(defn prob-15 [] (= (first '(1 2 3)) (second '(2 1 3)) (last '(3 2 1))))
