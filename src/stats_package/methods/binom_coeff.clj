(ns stats-package.methods.binom-coeff)
(clojure.core/refer-clojure)
(require 'stats-package.methods.fact)
(refer 'stats-package.methods.fact)

(defn binom-coeff
  [n k]
  (/ (fact n) (* (fact k) (fact (- n k)))))
