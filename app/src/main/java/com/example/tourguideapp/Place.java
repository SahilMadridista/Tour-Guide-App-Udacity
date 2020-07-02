package com.example.tourguideapp;

public class Place {

   private String PlaceName;
   private int PlaceImageID;

   public Place(String placeName, int placeImageID) {
      PlaceName = placeName;
      PlaceImageID = placeImageID;
   }

   public String getPlaceName() {
      return PlaceName;
   }

   public int getPlaceImageID() {
      return PlaceImageID;
   }
}
