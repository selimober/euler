(ns euler.ex1)

(defn div-by-fn
  [d]
  #(= 0 (mod % d)))

(range 1 10)