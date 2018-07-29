(fn my-count [lst]
  (if (empty? lst)
    0
    (+ 1 (my-count (rest lst)))))
