package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class StadiumFragment extends Fragment {


   public StadiumFragment() {
      // Required empty public constructor
   }

   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {

      View rootview = inflater.inflate(R.layout.fragment_stadium,container,false);

      ArrayList<Place> stadiums = new ArrayList<Place>();

      stadiums.add(new Place("Santiago Bernabue", R.drawable.santiago_bernabue));
      stadiums.add(new Place("Allianz Arena", R.drawable.allianz_arena));
      stadiums.add(new Place("King Power Stadium", R.drawable.king_power));
      stadiums.add(new Place("Melbourne Cricket Ground", R.drawable.mcg));
      stadiums.add(new Place("Old Trafford", R.drawable.old_trafford));
      stadiums.add(new Place("Salt Lake Stadium", R.drawable.salt_lake));
      stadiums.add(new Place("San Siro", R.drawable.san_siro));
      stadiums.add(new Place("Signal Iduna Park", R.drawable.signal_iduna_park));
      stadiums.add(new Place("Stamford Bridge", R.drawable.stamford_bridge));
      stadiums.add(new Place("Wankhede Stadium", R.drawable.wankhede));
      stadiums.add(new Place("Wembley", R.drawable.wembley));


      PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), stadiums);

      ListView listView = rootview.findViewById(R.id.stadium_list);

      listView.setAdapter(placeAdapter);

      return rootview;

   }

}