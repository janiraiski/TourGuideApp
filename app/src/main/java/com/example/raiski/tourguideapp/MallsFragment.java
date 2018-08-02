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
		locations.add(new Location(getString(R.string.malls_name1), getString(R.string.malls_address1),
				getString(R.string.malls_info1), R.drawable.mega));
		locations.add(new Location(getString(R.string.malls_name2), getString(R.string.malls_address2),
				getString(R.string.malls_info2), R.drawable.torikeskus));
		locations.add(new Location(getString(R.string.malls_name3), getString(R.string.malls_address3),
				getString(R.string.malls_info3), R.drawable.epstori));
		locations.add(new Location(getString(R.string.malls_name4), getString(R.string.malls_address4),
				getString(R.string.malls_info4), R.drawable.lehtinen));
		locations.add(new Location(getString(R.string.malls_name5), getString(R.string.malls_address5),
				getString(R.string.malls_info5), R.drawable.citypiha));
		locations.add(new Location(getString(R.string.malls_name6), getString(R.string.malls_address6),
				getString(R.string.malls_info6), R.drawable.ostoskulma));

		LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

		ListView listView = (ListView) rootView.findViewById(R.id.list);

		listView.setAdapter(adapter);

		return rootView;
	}

}
