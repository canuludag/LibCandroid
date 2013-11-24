package com.candroid.tools;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class InternetConnectionDetector {

	private Context c;

	public InternetConnectionDetector(Context context) {

		this.c = context;
	}

	
	//THIS FUNCTION WILL RETURN "TRUE" OR "FALSE" VALUE FOR INTERNET CONNECTION
	public boolean isConnectedToInternet() {

		ConnectivityManager connectivity = (ConnectivityManager) c
				.getSystemService(Context.CONNECTIVITY_SERVICE);

		// If there is an internet connection
		if (connectivity != null) {

			NetworkInfo[] info = connectivity.getAllNetworkInfo();

			// If info data is full
			if (info != null) {

				for (int i = 0; i < info.length; i++) {
					if (info[i].getState() == NetworkInfo.State.CONNECTED) {
						return true;
					}
				}

			}
		}

		return false;
	}

}
