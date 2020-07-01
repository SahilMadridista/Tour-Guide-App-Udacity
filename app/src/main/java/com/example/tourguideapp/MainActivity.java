package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.graphics.Color;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener{

   com.google.android.material.appbar.MaterialToolbar toolbar;
   ViewPager viewPager;
   TabLayout tabLayout;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      toolbar = findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);

      viewPager = findViewById(R.id.viewpager);
      tabLayout = findViewById(R.id.tablayout);

      tabLayout.addTab(tabLayout.newTab().setText("Stadiums"));
      tabLayout.addTab(tabLayout.newTab().setText("Cities"));
      tabLayout.addTab(tabLayout.newTab().setText("Monuments"));
      tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

      tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#ffffff"));
      tabLayout.setTabTextColors(Color.parseColor("#727272"), Color.parseColor("#ffffff"));

      Pager adapter = new Pager(getSupportFragmentManager(), tabLayout.getTabCount());

      viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

      viewPager.setAdapter(adapter);

      tabLayout.setOnTabSelectedListener(this);

   }

   @Override
   public void onTabSelected(TabLayout.Tab tab) {
      viewPager.setCurrentItem(tab.getPosition());
   }

   @Override
   public void onTabUnselected(TabLayout.Tab tab) {

   }

   @Override
   public void onTabReselected(TabLayout.Tab tab) {

   }
}