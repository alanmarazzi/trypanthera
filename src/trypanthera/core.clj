(ns trypanthera.core
  (:require [panthera.panthera :as pt]
            [libpython-clj.python :as py]
            [libpython-clj.require :refer [require-python]]))

(defn -main
  "I don't do a whole lot."
  []
  (println
   (pt/series [1 2 3])))
