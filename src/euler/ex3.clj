(ns euler.ex3)

(defn prime-factors [n]
  (let [sn (int (Math/ceil (Math/sqrt n)))]
    (loop [x n pf 2 pfs []]
      (cond
        (> pf sn) pfs
        (ratio? (/ x pf)) (recur x (+ pf 1) pfs)
        :else (recur (/ x pf) pf (conj pfs pf))))))

(defn largest-prime-factor [n]
  (last (prime-factors n)))
