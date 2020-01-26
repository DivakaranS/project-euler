(ns p5)

(defn Smallest-multiple [n]
 (loop [x 1 y 1]
   (if (>= n y)
     (if (zero? (mod x y))
       (recur x (inc y))
       (recur (inc x) 1)) x)))


(defn -main [] 
 (println "3 :" (Smallest-multiple 3))
 (println "5 :" (Smallest-multiple 5))
 (println "10 :" (Smallest-multiple 10))
 (println "20 :" (Smallest-multiple 20)))

