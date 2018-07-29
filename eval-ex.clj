(def n (Integer/parseInt (clojure.string/trim (read-line))))

(defn exp [base exponent] (if (= exponent 0) 1 (* base (exp base (- exponent 1)))))
(defn factorial [n] (if (= n 0) 1 (* n (factorial (- n 1)))))

(doseq [n-itr (range n)]
  (def x (Double/parseDouble (clojure.string/trim (read-line))))
  (println (apply + (map (fn [n] (/ (exp x n) (factorial n))) (range 10)))))
