(defproject immutant-web-issue "0.1.0-SNAPSHOT"
  :description "Sample demonstraing an issue in immutant.web's LazyMap.hashCode()"
  :url "https://github.com/emidln/immutant-web-issue"
  :main immutant-web-issue.core
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.taoensso/timbre "4.10.0"]]
  :profiles {:broken {:dependencies [[org.immutant/web "2.1.8"]]}
             :fixed? {:dependencies [[org.immutant/web "2.x.incremental.771"]]
                      :repositories [["Immutant incremental builds"
                                      "http://downloads.immutant.org/incremental/"]]}})
