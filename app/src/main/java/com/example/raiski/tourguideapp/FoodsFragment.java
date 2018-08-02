package com.example.raiski.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FoodsFragment extends Fragment {


	public FoodsFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.list, container, false);

		final ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(getString(R.string.foods_name1), getString(R.string.foods_address1),
				getString(R.string.foods_info1), R.drawable.holy_smoke));
		locations.add(new Location(getString(R.string.foods_name2), getString(R.string.foods_address2),
				getString(R.string.foods_info2), R.drawable.amarillo));
		locations.add(new Location(getString(R.string.foods_name3), getString(R.string.foods_address3),
				getString(R.string.foods_info3), R.drawable.classic_american_diner));
		locations.add(new Location(getString(R.string.foods_name4), getString(R.string.foods_address4),
				getString(R.string.foods_info4), R.drawable.pancho_villa));
		locations.add(new Location(getString(R.string.foods_name5), getString(R.string.foods_address5),
				getString(R.string.foods_info5), R.drawable.juurella));
		locations.add(new Location(getString(R.string.foods_name6), getString(R.string.foods_address6),
				getString(R.string.foods_info6), R.drawable.japanilainen_ravintola_juku));
		locations.add(new Location(getString(R.string.foods_name7), getString(R.string.foods_address7),
				getString(R.string.foods_info7), R.drawable.mallas_kabacka));

		LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

		ListView listView = (ListView) rootView.findViewById(R.id.list);

		listView.setAdapter(adapter);

		return rootView;
	}

}
