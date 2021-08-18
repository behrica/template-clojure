(ns calc-test
  (:require [clojure.test :refer :all]
            [calc :refer :all])
  
  ) 
  
(deftest x 
  (is (=  2 (add 1 1)))
  )