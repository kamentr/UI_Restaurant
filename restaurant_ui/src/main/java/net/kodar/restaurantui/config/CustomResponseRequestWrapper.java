package net.kodar.restaurantui.config;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class CustomResponseRequestWrapper extends HttpServletResponseWrapper{
	
	public CustomResponseRequestWrapper(HttpServletResponse response) {
		super(response);

//		Authentication authentication = Optional.ofNullable(apiCredentials.getAuthentication()).orElse(null);
//		if(authentication != null) {
//		CustomUsernamePasswordAuthentication auth = (CustomUsernamePasswordAuthentication) apiCredentials.getAuthentication();
//		
//		String authToken = auth.getAuthToken();
//		response.addHeader(Constants.AUTHENTICATION_TOKEN, authToken );
//		}
		
	}
}
