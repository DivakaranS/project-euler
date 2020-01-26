(ns p4)

(defn palindrome? [n]
  (loop [value n  last 0]
   (if (pos? value)
    (recur (quot value 10) (+ (* last 10) (mod value 10)))
     (== last n))))

(defn largest-palindrome []
  (apply max
   (filter palindrome? 
    (for [i (range 100 1000) j (range 100 1000)] (* i j)))))

(defn -main [] 
  (println "palindrome 3:" (largest-palindrome)))

