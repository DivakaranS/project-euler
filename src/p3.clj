(ns p3)


(defn prime-factor [n]
     (loop [f 2 facts [] prod n]
      (if (and (<= f n) (not= n (apply * facts)))
        (if (zero? (rem prod f))
          (recur f (conj facts f) (quot prod f))
          (recur (inc f) facts prod))
        (apply max facts))))

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
	  [[4] 2]
	  [[5] 5]
	  [[6] 3]
	  [[7] 7]
	  [[8] 2]
	  [[9] 3]
	  [[27] 3]
	  [[13195] 29]
	  [[600851475143] 6857]
  ]))