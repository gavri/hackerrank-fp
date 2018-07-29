(fn[lst]
  (letfn
    [(abs [n] (max (- n) n))]
    (map abs lst)))
