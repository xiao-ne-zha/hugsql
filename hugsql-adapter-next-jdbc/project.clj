(defproject org.clojars.xiao-ne-zha/hugsql-adapter-next-jdbc "1.0.0-SNAPSHOT"
  :description "next.jdbc hugsql adapter"
  :url "https://github.com/layerware/hugsql"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :scm {:dir ".."}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.github.seancorfield/next.jdbc "1.2.772"]
                 [org.clojars.xiao-ne-zha/hugsql-adapter "1.0.0-SNAPSHOT"]]
  :profiles {:dev {:dependencies [[org.clojars.xiao-ne-zha/hugsql-core "1.0.0-SNAPSHOT"]
                                  [com.h2database/h2 "1.4.199"]]}})
