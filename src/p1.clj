(ns p1)

(defn sol [n]
(reduce + 
(filter some?
(for [x (range n)] 
	(if (or (= 0 (mod x 3)) (= 0 (mod x 5))) x))))
)


(defn -main [] 
	(println "hello")
	(println "10 :" (sol 10))
 (println "20 :" (sol 20))
 (println "1000 :" (sol 1000))
)

