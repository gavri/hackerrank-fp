(let [f (fn gcd [a b]
          (cond (> b a) (recur b a)
                (= a b) a
                :else (recur (- a b) b))

          ) [m n] (map read-string (re-seq #"\d+" (read-line)))] (println (f m  n)))
