package com.candroid.tools;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CustomFonts {

	Typeface droidSans, droidSansBold;
	Typeface robotoRegular, robotoBold;
	Typeface helveticaNeue;
	Context context;
	Fragment fragment;

	/*
	 * Constructor method of this class
	 * 
	 * KEYNO FOR FONT SELECTION
	 * 
	 * 0.DroidSans 1.DroidSansBold 2.RobotoRegular 3.RobotoBold 4.Helvetica Neue
	 */

	public CustomFonts(Activity activity) {

		this.context = activity;

		droidSans = Typeface.createFromAsset(context.getAssets(),
				"fonts/droidsans.ttf");
		droidSansBold = Typeface.createFromAsset(context.getAssets(),
				"fonts/droidsans_bold.ttf");
		robotoRegular = Typeface.createFromAsset(context.getAssets(),
				"fonts/roboto_regular.ttf");
		robotoBold = Typeface.createFromAsset(context.getAssets(),
				"fonts/roboto_bold.ttf");
		helveticaNeue = Typeface.createFromAsset(context.getAssets(),
				"fonts/helvetica_neue_thin.ttf");

	}

	// Second type of constructor. For FragmenActivity
	public CustomFonts(Fragment frag) {

		this.fragment = frag;

		droidSans = Typeface.createFromAsset(
				fragment.getActivity().getAssets(), "fonts/droidsans.ttf");
		droidSansBold = Typeface.createFromAsset(fragment.getActivity()
				.getAssets(), "fonts/droidsans_bold.ttf");
		robotoRegular = Typeface.createFromAsset(fragment.getActivity()
				.getAssets(), "fonts/roboto_regular.ttf");
		robotoBold = Typeface.createFromAsset(fragment.getActivity()
				.getAssets(), "fonts/roboto_bold.ttf");
		helveticaNeue = Typeface.createFromAsset(fragment.getActivity()
				.getAssets(), "fonts/helvetica_neue_thin.ttf");

	}

	/*
	 * Give this method a textview. And it will wear this textview with a font
	 * that you desire
	 */

	public void wearFont(TextView nakedTextView, int fontType) {

		// Selection for the font type that given to method

		switch (fontType) {
		case 0:

			nakedTextView.setTypeface(droidSans);

			break;

		case 1:

			nakedTextView.setTypeface(droidSansBold);

			break;

		case 2:

			nakedTextView.setTypeface(robotoRegular);

			break;

		case 3:

			nakedTextView.setTypeface(robotoBold);

			break;

		case 4:

			nakedTextView.setTypeface(helveticaNeue);

			break;

		}

	}

	public void wearFont(Button nakedButtonText, int fontType) {

		// Selection for the font type that given to method

		switch (fontType) {
		case 0:

			nakedButtonText.setTypeface(droidSans);

			break;

		case 1:

			nakedButtonText.setTypeface(droidSansBold);

			break;

		case 2:

			nakedButtonText.setTypeface(robotoRegular);

			break;

		case 3:

			nakedButtonText.setTypeface(robotoBold);

			break;

		case 4:

			nakedButtonText.setTypeface(helveticaNeue);

			break;

		}

	}

	public void wearFont(EditText nakedEdittext, int fontType) {

		// Selection for the font type that given to method

		switch (fontType) {
		case 0:

			nakedEdittext.setTypeface(droidSans);

			break;

		case 1:

			nakedEdittext.setTypeface(droidSansBold);

			break;

		case 2:

			nakedEdittext.setTypeface(robotoRegular);

			break;

		case 3:

			nakedEdittext.setTypeface(robotoBold);

			break;

		case 4:

			nakedEdittext.setTypeface(helveticaNeue);

			break;

		}

	}

}
