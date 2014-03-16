/*
 * 
 * 	This is a custom library for helping tedious tasks in Android.
 * 
 * 	GNU Public Licence
    Copyright (C) 2013  Can ULUDAG

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
