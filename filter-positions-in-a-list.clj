(fn [lst]
  (letfn [(remove-element [l] (if (empty? l) l (dont-remove-element (rest l))))
          (dont-remove-element [l] (if (empty? l) l(cons (first l) (remove-element (rest l)))))]
    (remove-element lst)
    )
  )
