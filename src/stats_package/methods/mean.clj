(ns stats-package.methods.mean)
(defn mean
  "Return mean of numbers with varying length"
  ;;Todo: return floating point rather than rat"
  [& numbers]
  (int (/ (reduce + numbers) (count numbers))))
