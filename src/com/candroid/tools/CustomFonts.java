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

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CustomFonts {

	Typeface givenFont;

	Context context;
	Fragment fragment;

	public CustomFonts(Activity activity, String fontPath) {

		this.context = activity;

		givenFont = Typeface.createFromAsset(context.getAssets(), fontPath);

	}

	// Second type of constructor. For FragmenActivity
	public CustomFonts(Fragment frag, String fontPath) {

		this.fragment = frag;

		givenFont = Typeface.createFromAsset(context.getAssets(), fontPath);

	}

	/*
	 * Give this method a textview. And it will wear this textview with a font
	 * that you desire
	 */

	public void wearFont(TextView nakedTextView) {

		// Selection for the font type that given to method

		nakedTextView.setTypeface(givenFont);

	}

	public void wearFont(Button nakedButtonText) {

		nakedButtonText.setTypeface(givenFont);

	}

	public void wearFont(EditText nakedEdittext) {

		nakedEdittext.setTypeface(givenFont);

	}

}
