package com.example.raiski.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SportsFragment extends Fragment {


	public SportsFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.list, container, false);

		final ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location("EasyFit", "Upankatu 1",
				"Monipuolinen ja kotimainen liikuntakeskus", R.drawable.easyfit));
		locations.add(new Location("Kuntokeskus Maxium", "Teollisuus 8",
				"Jokaiselle monipuolinen kuntosali", R.drawable.maxium));
		locations.add(new Location("Seinäjoki Swimming Hall", "Kirkkokatu 15",
				"Swimming and Sports Hall", R.drawable.uimahalli));
		locations.add(new Location("Seinäjoki Ice Rink", "Alaseinäjoenkatu 10",
				"Viihtyisät puitteet toiminnalle", R.drawable.jaahalli));
		locations.add(new Location("SQB Center", "Urheilupuisto 5",
				"Monipuolinen vapaa-aika, urheilu- ja viihdekeskus", R.drawable.sqb));

		LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

		ListView listView = (ListView) rootView.findViewById(R.id.list);

		listView.setAdapter(adapter);

		return rootView;
	}

}
