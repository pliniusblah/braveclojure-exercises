;1.
;vector

(vector "USP" "UNICAMP" "UNESP")
(get (vector "USP" "UNICAMP" "UNESP") 2)

; str
(str "Hi! " "I " "am " "Plínio.")

;hash-map
(hash-map :santos 20 :palmeiras 25)

;hash-set
(hash-set 5 3 3 5 6 2 1 9 8 7 0)

;2.
(defn add100 [x] (+ x 100))

;3.
(defn dec-maker
  [dec-by]
  #(- % dec-by))
(def dec9 (dec-maker 9))
(dec9 10)

;4
(defn mapset
  [func list]
  (map inc (into #{} list)))
(mapset inc [1 1 2 2])

;5

;6
