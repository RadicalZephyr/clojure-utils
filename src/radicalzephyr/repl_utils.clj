(ns radicalzephyr.repl-utils
  (:require [clojure.java.io :as io]
            [clojure.pprint  :as pp]))

(defmacro redirect [file-name & forms]
  (with-open [wr (clojure.java.io/writer file-name)]
    (binding [*out* wr]
      ~@forms)))
