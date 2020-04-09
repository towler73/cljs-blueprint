(ns blueprint.core
  (:require [reagent.dom :as rdom]
            [re-frame.core :as rf :refer [dispatch dispatch-sync]]
            [blueprint.views]))

(enable-console-print!)

(defn render []
  (rdom/render [blueprint.views/foo] (.getElementById js/document "app")))

(render)

