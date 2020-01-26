(ns p4)

(defn palindrome [count]
 (if (== count 3)
   (let [arr []]
    (for [i (range 100 1000) j (range 100 1000)]
      (let [n (* i j)]
       (loop [val n final 0 temp n]
      					(if (pos? val)
        				(recur (quot val 10) (+ (* final 10) (mod val 10)) temp)
         			(if (== final temp) final))))))))
   

(defn -main [] 
  (println "palindrome 3:" (apply max (filter (fn [n] (not (nil? n))) (palindrome 3))))
  (println "palindrome 3:" (apply max (filter (comp not nil?) (palindrome 3))))
		(println "palindrome 3:" (apply max (filter (comp not nil?) (palindrome 3)))))

