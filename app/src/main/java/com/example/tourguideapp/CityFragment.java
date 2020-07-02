package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CityFragment extends Fragment {

   public CityFragment() {
      // Required empty public constructor
   }

   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {

      View rootview = inflater.inflate(R.layout.fragment_city,container,false);

      ArrayList<Place> cities = new ArrayList<Place>();

      cities.add(new Place("Lucknow", R.drawable.lucknow));
      cities.add(new Place("Madrid", R.drawable.madrid));
      cities.add(new Place("Berlin", R.drawable.berlin));
      cities.add(new Place("Chicago", R.drawable.chicago));
      cities.add(new Place("Kolkata", R.drawable.kolkata));
      cities.add(new Place("Mumbai", R.drawable.mumbai));
      cities.add(new Place("Paris", R.drawable.paris));
      cities.add(new Place("Ranchi", R.drawable.ranchi));
      cities.add(new Place("Shilma", R.drawable.shimla));
      cities.add(new Place("Srinagar", R.drawable.srinagar));

      PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), cities);

      ListView listView = rootview.findViewById(R.id.city_list);

      listView.setAdapter(placeAdapter);

      return rootview;

   }

}