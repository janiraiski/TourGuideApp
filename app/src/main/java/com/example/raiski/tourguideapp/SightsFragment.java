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
		locations.add(new Location(getString(R.string.sights_name1), getString(R.string.sights_address1),
				getString(R.string.sights_info1), R.drawable.alvaraalto));
		locations.add(new Location(getString(R.string.sights_name2), getString(R.string.sights_address2),
				getString(R.string.sights_info2), R.drawable.museo));
		locations.add(new Location(getString(R.string.sights_name3), getString(R.string.sights_address3),
				getString(R.string.sights_info3), R.drawable.lakeuden_risti));

		LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

		ListView listView = (ListView) rootView.findViewById(R.id.list);

		listView.setAdapter(adapter);

		return rootView;
	}

}
