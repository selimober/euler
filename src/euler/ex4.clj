(ns euler.ex4
  (:require [clojure.string :as s]))

(defn palindrom? [n]
  (= (str n) (s/reverse (str n))))

(def three-digit-range (range 999 99 -1))

(defn brute []
  (first
    (filter palindrom?
            (reverse
              (sort
                (for [x three-digit-range y three-digit-range]
                  (* x y)))))))
