(ns euler.ex2)

(defn lazy-fib [a b]
  (lazy-seq (cons a (lazy-fib b (+ b a)))))

(apply + (take-while #(< % 4000000)
                     (filter even? (lazy-fib 1 2))))