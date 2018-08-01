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
public class SightsFragment extends Fragment {


	public SightsFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.list, container, false);

		final ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location("Alvar Aalto keskus", "Koulukatu 24",
				"Church and tower", R.drawable.alvaraalto));
		locations.add(new Location("Maakuntamuseo", "Kauppakatu 17",
				"Monimuotoinen ja laaja museokokonaisuus", R.drawable.museo));
		locations.add(new Location("Lakeuden Risti", "Koulukatu 24",
				"Huge cross tower", R.drawable.lakeuden_risti));

		LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

		ListView listView = (ListView) rootView.findViewById(R.id.list);

		listView.setAdapter(adapter);

		return rootView;
	}

}
