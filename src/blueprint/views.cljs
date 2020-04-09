(ns blueprint.views
  (:require [reagent.core :as r]
            [bp :refer [Button Card Elevation H5 Text Navbar NavbarGroup NavbarHeading NavbarDivider Alignment ControlGroup InputGroup]]))


(defn foo []
  [:div
   [:> Navbar
    [:> NavbarGroup {:align (. Alignment -LEFT)}
     [:> NavbarHeading "Clojure Ledger"]
     [:> NavbarDivider]
     [:> Button {:class-name "bp3-minimal" :icon "home" :text "Home"}]
     [:> Button {:class-name "bp3-minimal" :icon "document" :text "Files"}]]]

   [:div {:class "content"}
    [:> Card {:interactive true :elevation (. Elevation -THREE)}
     [:> H5 "Card Heading"]
     [:p  "This is where you put the content"]
     [:> Button {:text "Bar" :intent "Success"}]]
    [:> ControlGroup {:vertical false}
     [:> InputGroup {:placeholder "Date"}]
     [:> InputGroup {:placeholder "Code"}]
     [:> InputGroup {:placeholder "Description"}]
     [:> InputGroup {:placeholder "Comment"}]]
    [:> ControlGroup {:vertical false}
     [:> InputGroup {:placeholder "Status"}]
     [:> InputGroup {:placeholder "Account"}]
     [:> InputGroup {:placeholder "Amount"}]
     [:> InputGroup {:placeholder "Comment"}]]
    [:> ControlGroup {:vertical false}
     [:> InputGroup {:placeholder "Status"}]
     [:> InputGroup {:placeholder "Account"}]
     [:> InputGroup {:placeholder "Amount"}]
     [:> InputGroup {:placeholder "Comment"}]]]])