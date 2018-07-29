(fn [num lst] (mapcat (fn [e] (take num (repeat e))) lst))
