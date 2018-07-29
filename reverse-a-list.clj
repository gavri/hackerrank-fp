(fn my-reverse [lst] 
  (if (empty? lst) 
    lst (concat (my-reverse (rest lst)) (list (first lst)))))
