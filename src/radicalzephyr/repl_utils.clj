(ns radicalzephyr.repl-utils
  (:require [clojure.java.io :as io]))

(defmacro redirect [file-name & body]
  `(with-open [wr# (clojure.java.io/writer ~file-name)]
     (binding [*out* wr#]
       ~@body)))
