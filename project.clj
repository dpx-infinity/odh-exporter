(defproject dpx-infinity/odh-exporter "1"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/data.zip "0.1.1"]
                 [org.clojure/data.xml "0.0.7"]
                 [seesaw "1.4.2"]]

  :aot :all
  :main odh.core
  :warn-on-reflection true

  :omit-source true

  :jar-name "odh-exporter-stripped.jar"
  :uberjar-name "odh-exporter.jar")