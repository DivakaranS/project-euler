(ns p2)

(defn fibonacchi [max-n]
   	(loop [n1 1 n2 2 sum 0]
			  (let [n3 (+' n1 n2)]
								(if (< n2 max-n)
												(recur n2 n3 (if (even? n2) (+' sum n2) sum))
												sum))))

(defn -main [] 
	(println "hello")
	(println "10 :" (fibonacchi 10))
 (println "35 :" (fibonacchi 35))
 (println "4000000 :" (fibonacchi 4000000))
)

