# REPL Utils

Some useful Clojure development utilities.

## Usage

I like to include it in my [Leiningen][lein] `profiles.clj` like so.

```clojure
{:user
 {:dependencies [[radicalzephyr/repl-utils "0.1.0"]]
  :repl-options {:init (require '[radicalzephyr.repl-utils :refer :all])}}}
```

## License

Copyright © 2015 Geoff Shannon

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
