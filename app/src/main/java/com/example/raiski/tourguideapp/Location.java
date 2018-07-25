package com.example.raiski.tourguideapp;

public class Location {

	private String mName;
	private String mAddress;
	private String mInfo;
	private int mImgResourceId;

	public Location(String name, String address, String info, int imgResourceId) {
		mName = name;
		mAddress = address;
		mInfo = info;
		mImgResourceId = imgResourceId;
	}

	public String getName() {
		return mName;
	}

	public String getAddress() {
		return mAddress;
	}

	public String getInfo() {
		return mInfo;
	}

	public int getImgResourceId() {
		return mImgResourceId;
	}

}
