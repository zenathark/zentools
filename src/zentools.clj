(ns zentools)

;;; https://github.com/klutometis/lambda

(defmacro λ [& sigs] `(fn ~@sigs))

(defmacro lambda [& sigs] `(fn ~@sigs))

;;; end lambda

(defmacro ??? []
  `(throw
    (ex-info "Function not yet implemented"
             {:causes (NotImplementedException.)})))
