(ns stats-package.methods.fact)
(defn fact
  "Return factorial of n"
  ([n] (fact n 1))
  ([n accum]
   (if (<= n 1)
     accum
     (recur (- n 1) (* n accum)))))
