(defproject nupic.core.java "0.0.1"
  :description "Clojure bindings for nupic.core"
  :url "https://github.com/DavidRagazzi/nupic.core.java"
  :license {:name "GNU Public License v3"
            :url "http://www.gnu.org/licenses/gpl.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [net.java.dev.jna/jna "4.0.0"]]
  :jvm-opts ["-server" "-Xmx2g" "-XX:+UseG1GC"]
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :plugins [[lein-javadoc "0.1.1"]
            [codox "0.6.6"]]
  :javadoc-opts {:output-dir "doc/api/java"
                 :package-names ["nanomsg" "nanomsg.jna" "nanomsg.pubsub" "nanomsg.exceptions"
                                 "nanomsg.reqrep" "nanomsg.bus" "nanomsg.pair" "nanomsg.pipeline"]}
  :codox {:output-dir "doc/api/clojure"
          :src-dir-uri "http://github.com/niwibe/jnanomsg/blob/master/"
          :src-linenum-anchor-prefix "L"}
  :main nupic.benchmark
  :profiles {:uberjar {:aot :all}})
