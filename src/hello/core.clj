(ns hello.core
  (:gen-class))

(defn balanced? [s]
    (->> s
        (filter #{\[ \] \( \) \{ \}})

        (reduce
            (fn [stack item]
                (cond
                    (#{ \( \{ \[ } item) (conj stack item)

                    (and (#{ \( \{ \[ } (last stack))
                         (= ({ \) \(, \} \{, \] \[ } item) (last stack)))
                    (pop stack)

                    :else (conj stack item)))
        [])

        empty?)
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
