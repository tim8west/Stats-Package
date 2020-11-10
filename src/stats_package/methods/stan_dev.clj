(ns stats-package.methods.stan-dev)
(clojure.core/refer-clojure)
(require 'stats-package.methods.mean)
(refer 'stats-package.methods.mean)

(defn stan-dev
  "Return standard deviation"
  [& numbers]
  ;; How to call mean on numbers for this function?
  (let [diff-list (map #(- (/ (reduce + numbers) (count numbers)) %) numbers)]
  ;;(let m (mean numbers))
  ;;(let [diff-list (map #(- (mean numbers) %) numbers)]
    (let [square-list (map #(* % %) diff-list)]
      (Math/sqrt (/ (reduce + square-list) (count square-list))))))
