(ns stats-package.core)
(clojure.core/refer-clojure)
(require 'stats-package.methods.mean)
(refer 'stats-package.methods.mean)
(require 'stats-package.methods.fact)
(refer 'stats-package.methods.fact)
(require 'stats-package.methods.binom-coeff)
(refer 'stats-package.methods.binom-coeff)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (mean 10 0 20))
  (println (fact 6))
  (println (binom-coeff 5 2)))
