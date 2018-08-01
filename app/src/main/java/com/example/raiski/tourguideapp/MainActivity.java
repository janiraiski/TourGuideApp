package com.example.raiski.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Create viewpager object
		ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

		// Create categoryAdapter object
		CategoryAdapter categoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());

		viewPager.setAdapter(categoryAdapter);

		TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

		tabLayout.setupWithViewPager(viewPager);
	}
}
