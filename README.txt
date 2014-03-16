This is a custom library for helping tedious tasks in Android.

GNU Public Licence
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


More info about the library name:
LibCandroid --> Lib = Library, Candroid = Can+Android :)

1.CustomFonts Class
This class have built-in font types to use for your TextView, EditText and Button texts.

	Typeface droidSans, droidSansBold;
	Typeface robotoRegular, robotoBold;
	Typeface helveticaNeue, helveticaNeueBold;

To use it. Simply create an instance of this class and use wearFont() method.

	CustomFonts mFont = new CustomFonts(this);

	mFont.wearFont(tvInfoText, 4);

2.FindLocation Class
With this class you can get the latitude-longitude data by using simple methods.

	getLatitude();

	getLongitude();

