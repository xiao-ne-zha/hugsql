(defproject org.clojars.xiao-ne-zha/hugsql-core "1.0.0-SNAPSHOT"
  :description "HugSQL core functionality without adapter dependencies"
  :url "https://github.com/layerware/hugsql"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :scm {:dir ".."}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/tools.reader "1.3.6"]
                 [org.clojars.xiao-ne-zha/hugsql-adapter "1.0.0-SNAPSHOT"]]
  :profiles {:dev
             {:plugins [[lein-auto "0.1.2"]]
              :dependencies [[org.clojars.xiao-ne-zha/hugsql-adapter-clojure-java-jdbc "1.0.0-SNAPSHOT"]
                             [org.clojars.xiao-ne-zha/hugsql-adapter-clojure-jdbc "1.0.0-SNAPSHOT"]
                             [org.clojars.xiao-ne-zha/hugsql-adapter-next-jdbc "1.0.0-SNAPSHOT"]
                             [org.postgresql/postgresql "42.2.8"]
                             [mysql/mysql-connector-java "8.0.17"]
                             [org.xerial/sqlite-jdbc "3.28.0"]
                             [org.apache.derby/derby "10.14.2.0"]
                             [hsqldb/hsqldb "1.8.0.10"]
                             [com.h2database/h2 "1.4.196"]]
              :global-vars {*warn-on-reflection* false
                            *assert* false}}
             :1.10 {:dependencies [[org.clojure/clojure "1.10.3"]]}
             :1.11 {:dependencies [[org.clojure/clojure "1.11.0"]]}}
  :aliases {"test-all" ["with-profile" "dev,1.10:dev,1.11" "test"]})
