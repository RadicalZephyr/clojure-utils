(ns radicalzephyr.repl-utils
  (:require [clojure.java.io :as io]
            [clojure.pprint  :as pp]))

(defmacro redirect [& forms]
  (with-open [wr (clojure.java.io/writer file-name)]
    (binding [*out* wr]
      ~@forms)))
