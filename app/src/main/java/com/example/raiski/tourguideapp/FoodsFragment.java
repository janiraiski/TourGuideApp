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
		locations.add(new Location("Holy Smoke", "Koulukatu 20",
				"May The Holy Smoke Be With You", R.drawable.holy_smoke));
		locations.add(new Location("Amarillo", "Kauppatori 3",
				"Always something going on", R.drawable.amarillo));
		locations.add(new Location("Classic American Diner", "Kalevalankatu 2",
				"Original Diner Burgers", R.drawable.classic_american_diner));
		locations.add(new Location("Pancho Villa", "Kalevankatu 14",
				"Mexican Food Restaurant", R.drawable.pancho_villa));
		locations.add(new Location("Ravintola Juurella", "Keskustori 1",
				"Ravintola, Seinäjoki, Catering", R.drawable.juurella));
		locations.add(new Location("Japanilainen Ravintola Juku", "Koulukatu 22",
				"Herkullisia japanilaisia sekä aasialaisia ruokia",
				R.drawable.japanilainen_ravintola_juku));
		locations.add(new Location("Mallas Kabacka", "Kalevankatu 14",
				"Seinäjoen Olutravintola", R.drawable.mallas_kabacka));

		LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

		ListView listView = (ListView) rootView.findViewById(R.id.list);

		listView.setAdapter(adapter);

		return rootView;
	}

}
