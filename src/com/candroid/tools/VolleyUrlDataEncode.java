package com.candroid.tools;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

import org.json.JSONObject;

import android.net.Uri;

public class VolleyUrlDataEncode {

	public String encodeUsingString(String apiURL, String queryString) {

		StringBuilder sb = new StringBuilder();

		String urlEncodedQuery = null;
		try {
			urlEncodedQuery = URLEncoder.encode(queryString, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sb.append(apiURL).append("?").append(urlEncodedQuery);

		return sb.toString();

	}

	public String encodeUsingMap(Map<Object, Object> urlParams,
			String authority, String path, String[] keys) {

		JSONObject json = new JSONObject(urlParams);

		Uri.Builder uri = new Uri.Builder();
		uri.scheme("https");
		uri.authority(authority);
		uri.path(path);

		for (int i = 0; i < keys.length; i++) {
			uri.appendQueryParameter(keys[i].toString(), json.toString());
		}

		return uri.build().toString();

	}

}
