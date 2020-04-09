(ns blueprint.views
  (:require [reagent.core :as r]
            [bp :refer [Button Card Elevation H5 Text Navbar NavbarGroup NavbarHeading NavbarDivider Alignment ControlGroup InputGroup]]))


(defn foo []
  [:div
   [:> Navbar
    [:> NavbarGroup {:align (. Alignment -LEFT)}
     [:> NavbarHeading "Clojure Blueprint"]
     [:> NavbarDivider]
     [:> Button {:class-name "bp3-minimal" :icon "home" :text "Home"}]
     [:> Button {:class-name "bp3-minimal" :icon "document" :text "Files"}]]]

   [:div {:class "content"}
    [:> Card {:interactive true :elevation (. Elevation -THREE)}
     [:> H5 "Card Heading"]
     [:p  "This is where you put the content"]
     [:> Button {:text "Submit" :intent "Success"}]]]])
