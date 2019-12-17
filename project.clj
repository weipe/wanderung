(defproject wanderung "0.1.0-SNAPSHOT"
  :description "Data migration tool for Datahike"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [io.replikativ/datahike "0.2.1-SNAPSHOT"]
                 [com.datomic/datomic-free "0.9.5697" :scope "provided"]]
  :repl-options {:init-ns wanderung.core})