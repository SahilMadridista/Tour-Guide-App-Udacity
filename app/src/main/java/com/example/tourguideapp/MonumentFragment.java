package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MonumentFragment extends Fragment {

   public MonumentFragment() {
      // Required empty public constructor
   }

   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {

      View rootview = inflater.inflate(R.layout.fragment_monument,container,false);

      ArrayList<Place> monuments = new ArrayList<Place>();

      monuments.add(new Place("Bara Imambara", R.drawable.imambara));
      monuments.add(new Place("Ajanta Caves", R.drawable.ajanta));
      monuments.add(new Place("Taj Mahal", R.drawable.taj_mahal));
      monuments.add(new Place("Akshardham Temple", R.drawable.akshardham));
      monuments.add(new Place("India Gate", R.drawable.india_gate));
      monuments.add(new Place("Jama Masjid", R.drawable.jama_masjid));
      monuments.add(new Place("Qutub Minar", R.drawable.qutub_minar));
      monuments.add(new Place("Red Fort", R.drawable.red_fort));
      monuments.add(new Place("Konark Sun Temple", R.drawable.sun_temple));
      monuments.add(new Place("Srinagar", R.drawable.srinagar));

      PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), monuments);

      ListView listView = rootview.findViewById(R.id.monument_list);

      listView.setAdapter(placeAdapter);

      return rootview;

   }

}