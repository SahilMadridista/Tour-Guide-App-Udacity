package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {


   public PlaceAdapter(Context context, ArrayList<Place> object) {
      super(context, 0, object);
   }

   @NonNull
   @Override
   public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

      if(convertView == null){
         convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item
         ,parent,false);
      }

      Place currentPlace = (Place) getItem(position);

      TextView placeTextView = convertView.findViewById(R.id.place_name_text);
      placeTextView.setText(currentPlace.getPlaceName());

      ImageView itemImageView = convertView.findViewById(R.id.place_image);
      itemImageView.setImageResource(currentPlace.getPlaceImageID());

      return convertView;

   }
}
