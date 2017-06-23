(ns immutant-web-issue.core
  (:require immutant.web
            taoensso.timbre)
  (:gen-class))
 
(defn -main []
  (future
    (immutant.web/run
      (fn [req]
        (println "getting the hashCode")
        ;; the next line blows up if the issue isn't fixed!
        (println (.hashCode req))
        ;; the next line blows up if the issue isn't fixed!
        (taoensso.timbre/info "request:" req)
        ;; we never reach this line if the issue isn't fixed and receive a 500
        {:status 200
         :body "ok"})))
  (Thread/sleep 5000)
  (System/exit
    (try
      (prn "200 result:" (slurp "http://localhost:8080"))
      0
      (catch Exception e
        (prn "500 result:" e)
        1))))
