(fn [delim lst]
  ((fn my-filter [p l] (cond (empty? l) l
                             (p (first l)) (cons (first l) (my-filter p (rest l)))
                             :else (my-filter p (rest l))))
   (fn [n] (< n delim)) lst))
