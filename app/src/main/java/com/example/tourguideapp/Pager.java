package com.example.tourguideapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Pager extends FragmentStatePagerAdapter {

   int tabCount;

   //Constructor to the class
   public Pager(FragmentManager fm, int tabCount) {
      super(fm);
      //Initializing tab count
      this.tabCount= tabCount;
   }

   @NonNull
   @Override
   public Fragment getItem(int position) {
      switch (position) {
         case 0:
            StadiumFragment stadiumFragment = new StadiumFragment();
            return stadiumFragment;
         case 1:
            CityFragment cityFragment = new CityFragment();
            return cityFragment;
         case 2:
            MonumentFragment monumentFragment = new MonumentFragment();
            return monumentFragment;
         default:
            return null;
      }
   }

   @Override
   public int getCount() {
      return tabCount;
   }
}
