(ns p3)


(defn prime-factor [n]
     (loop [i 2 arr []]
      (if (and (<= i n) (not= n (apply * arr)))
        (recur (inc i) (if (== 0 (mod n i)) (conj arr i) arr))
        (apply max arr)
     )))

(defn -main []
  (reduce (fn [passing [input output]]
  		(if passing (let [actual (apply prime-factor input)] 
  			(println "input" input "expected" output "actual" actual)
  			(== actual output)
  		) (do
  			(println "skipping" "input" input "expected" output)
  		)))
  true 
  [
			[[2] 2]
	  [[3] 3]
	  ; [[4] 2]
	  [[5] 5]
	  ; [[6] 3]
	  [[7] 7]
	  ; [[8] 2]
	  [[13195] 29]
	  [[600851475143] 6857]
  ]))