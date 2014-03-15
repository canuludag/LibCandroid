/*
 * 
 * 	This is a custom library for helping tedious tasks in Android.
 * 
 * 	GNU Public Licence
    Copyright (C) 2013  Can ULUDAÐ

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * 
 */

package com.candroid.tools;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public class FindLocation extends Service implements LocationListener {

	private final Context mContext;

	// Flag for GPS status
	boolean isGPSEnabled = false;

	// Flag for network status
	boolean isNetworkEnabled = false;

	boolean canGetLocation = false;

	Location location; // location
	double latitude; // latitude
	double longitude; // longitude

	// The minimum distance to change updates in meters
	private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 10; // 10 meters

	// The minimum time between updates in miliseconds
	private static final long MIN_TIME_BW_UPDATES = 1000 * 60 * 1; // 1 minute

	// Declaring a location manager
	protected LocationManager locationManager;

	public FindLocation(Context context) {
		this.mContext = context;
		getLocation();
	}

	public Location getLocation() {

		try {

			locationManager = (LocationManager) mContext
					.getSystemService(LOCATION_SERVICE);

			// Getting GPS status
			isGPSEnabled = locationManager
					.isProviderEnabled(LocationManager.GPS_PROVIDER);

			// Getting network status
			isNetworkEnabled = locationManager
					.isProviderEnabled(LocationManager.NETWORK_PROVIDER);

			if (!isGPSEnabled && !isNetworkEnabled) {
				// No network provider is enabled
				Log.e("PROVIDER ERROR", "No network provider is enabled!");
			} else {

				this.canGetLocation = true; // Yes, there is a network provider
											// exist

				// First get location from network provider
				if (isNetworkEnabled) {
					locationManager.requestLocationUpdates(
							LocationManager.NETWORK_PROVIDER,
							MIN_TIME_BW_UPDATES,
							MIN_DISTANCE_CHANGE_FOR_UPDATES, this);

					if (locationManager != null) {
						location = locationManager
								.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);

						if (location != null) {
							latitude = location.getLatitude();
							longitude = location.getLongitude();
						}

					}

				}

				// If GPS enabled get lat/long using GPS Services
				if (isGPSEnabled) {
					if (location == null) {
						locationManager.requestLocationUpdates(
								LocationManager.GPS_PROVIDER,
								MIN_TIME_BW_UPDATES,
								MIN_DISTANCE_CHANGE_FOR_UPDATES, this);

						if (locationManager != null) {
							location = locationManager
									.getLastKnownLocation(LocationManager.GPS_PROVIDER);
							if (location != null) {
								latitude = location.getLatitude();
								longitude = location.getLongitude();
								// Log these infos into console
								Log.d("LAT/LONG",
										"LAT: " + String.valueOf(latitude)
												+ " / " + "LONG: "
												+ String.valueOf(longitude));
							}
						}

					}
				}

			}

		} catch (Exception e) {
			Log.e("ERROR", "An error occured");
		}

		return location;
	}

	// FUNCTION TO GET LATITUDE
	public double getLatitdue() {
		if (location != null) {
			latitude = location.getLatitude();
		}

		return latitude;
	}

	// FUNCTION TO GET LONGITUDE
	public double getLongitude() {
		if (location != null) {
			longitude = location.getLongitude();
		}

		return longitude;
	}

	public boolean canGetLocation() {
		return this.canGetLocation;
	}

	@Override
	public void onLocationChanged(Location arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub

	}

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
