package net.kodar.restaurantui.util;

import java.nio.charset.Charset;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpHeaders;

import net.kodar.restaurantui.config.Constants;

public final class UtilsUI {

public static HttpHeaders createBAHeaders(String username, String password){
	   return new HttpHeaders() {/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
	         String auth = username + ":" + password;
	         byte[] encodedAuth = Base64.encodeBase64( 
	            auth.getBytes(Charset.forName("US-ASCII")) );
	         String authHeader = "Basic " + new String( encodedAuth );
	         set( Constants.AUTHENTICATION_BASIC, authHeader );
	      }};
	}

public static HttpHeaders createAuthTokenHeaders(String authToken){
	   return new HttpHeaders() {/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
	         set( Constants.AUTHENTICATION_TOKEN, authToken );
	      }};
	}

}
