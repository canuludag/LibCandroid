package com.candroid.tools;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class VolleyUrlDataEncode {
	
	public String encodeUsingString(String apiURL, String queryString){
		
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
	
	
	public String encodeUsingMap(){
		
		
		
		return null;
		
	}

}
