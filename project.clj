(defproject org.clojars.xiao-ne-zha/hugsql "1.0.0-SNAPSHOT"
  :description "A Clojure library for embracing SQL"
  :url "https://github.com/layerware/hugsql"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :scm {:name "HugSQL"
        :url "https://github.com/layerware/hugsql"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojars.xiao-ne-zha/hugsql-core "1.0.0-SNAPSHOT"]
                 [org.clojars.xiao-ne-zha/hugsql-adapter-clojure-java-jdbc "1.0.0-SNAPSHOT"]]
  :aliases {"install-all" ["do" ["sub" "install"] "install"]}
  :profiles {:dev
             {:plugins [[lein-codox "0.10.7"]
                        [lein-sub "0.3.0"]]
              :sub ["hugsql-adapter"
                    "hugsql-core"
                    "hugsql-adapter-clojure-java-jdbc"
                    "hugsql-adapter-clojure-jdbc"
                    "hugsql-adapter-next-jdbc"]
              :dependencies [[org.clojars.xiao-ne-zha/hugsql-adapter-clojure-jdbc "1.0.0-SNAPSHOT"]
                             [org.clojars.xiao-ne-zha/hugsql-adapter-next-jdbc "1.0.0-SNAPSHOT"]]
              :codox {:source-uri "http://github.com/layerware/hugsql/blob/0.5.3/{filepath}#L{line}"
                      :output-path "../gh-pages"
                      :source-paths ["hugsql-core/src"
                                     "hugsql-adapter/src"
                                     "hugsql-adapter-clojure-java-jdbc/src"
                                     "hugsql-adapter-clojure-jdbc/src"
                                     "hugsql-adapter-next-jdbc/src"]}
              :global-vars {*warn-on-reflection* false
                            *assert* false}}})
