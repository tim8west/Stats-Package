(ns stats-package.methods.fact)
(defn fact
  "Return factorial of n"
  ;;Todo: return floating point rather than rat"
  ([n] (fact n 1))
  ([n accum]
   (if (<= n 1)
     accum
     (recur (- n 1) (* n accum)))))
