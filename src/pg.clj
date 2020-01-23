(ns pg)

(defn temp [max-n]
	(loop [n1 1 n2 2 sum 0]
			(let [n3 (+' n1 n2)]
								(if (< n2 max-n)
												(recur n2 n3 (if (even? n2) (+' sum n2) sum))
												sum))))

(defn -main []
 (println (temp 10))
 (println (temp 35))
 (println (temp 4000000))
 )