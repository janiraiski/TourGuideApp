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
public class MallsFragment extends Fragment {


	public MallsFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.list, container, false);

		final ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location("Mega Keskus", "Keskuskatu 3",
				"Muodikasta shoppailua", R.drawable.mega));
		locations.add(new Location("Torikeskus", "Kauppatori 1-3",
				"Helppoon arkeen", R.drawable.torikeskus));
		locations.add(new Location("Epstori", "Kalevankatu 4",
				"Kaiken keskellä", R.drawable.epstori));
		locations.add(new Location("Lehtinen", "Puskantie 1",
				"Se tuttu kauppapaikka", R.drawable.lehtinen));
		locations.add(new Location("CityPiha", "Kauppakatu 1",
				"Kaikkea hyvään elämään", R.drawable.citypiha));
		locations.add(new Location("Seinäjoen Ostoskulma", "Puskantie 13",
				"Helppo löytää, kulmalla tavataan", R.drawable.ostoskulma));

		LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

		ListView listView = (ListView) rootView.findViewById(R.id.list);

		listView.setAdapter(adapter);

		return rootView;
	}

}
