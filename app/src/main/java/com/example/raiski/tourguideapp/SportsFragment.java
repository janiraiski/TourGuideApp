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
		locations.add(new Location(getString(R.string.sports_name1), getString(R.string.sports_address1),
				getString(R.string.sports_info1), R.drawable.easyfit));
		locations.add(new Location(getString(R.string.sports_name2), getString(R.string.sports_address2),
				getString(R.string.sports_info2), R.drawable.maxium));
		locations.add(new Location(getString(R.string.sports_name3), getString(R.string.sports_address3),
				getString(R.string.sports_info3), R.drawable.uimahalli));
		locations.add(new Location(getString(R.string.sports_name4), getString(R.string.sports_address4),
				getString(R.string.sports_info4), R.drawable.jaahalli));
		locations.add(new Location(getString(R.string.sports_name5), getString(R.string.sports_address5),
				getString(R.string.sports_info5), R.drawable.sqb));

		LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

		ListView listView = (ListView) rootView.findViewById(R.id.list);

		listView.setAdapter(adapter);

		return rootView;
	}

}
