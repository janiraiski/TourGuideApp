package com.example.raiski.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {


	public LocationAdapter(Activity context, ArrayList<Location> locations) {
		super(context, 0, locations);
	}

	@NonNull
	@Override
	public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
		View listItemView = convertView;
		if (listItemView == null) {
			listItemView = LayoutInflater.from(getContext()).inflate(
					R.layout.list_item, parent, false);
		}

		Location currentLocation = getItem(position);

		TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
		nameTextView.setText(currentLocation.getName());

		TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
		addressTextView.setText(currentLocation.getAddress());

		TextView infoTextView = (TextView) listItemView.findViewById(R.id.info);
		infoTextView.setText(currentLocation.getInfo());

		ImageView image = (ImageView) listItemView.findViewById(R.id.location_image);
		image.setImageResource(currentLocation.getImgResourceId());

		return listItemView;
	}

}
