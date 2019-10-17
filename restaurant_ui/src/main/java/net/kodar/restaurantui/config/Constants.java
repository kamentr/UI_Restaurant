package net.kodar.restaurantui.config;

public interface Constants {
	
	public String BASE_URL = "http://localhost:8080/";
	
	public String AUTHENTICATION_TOKEN = "authToken";

	public String AUTHENTICATION_BASIC = "Authorization";

	public String LOGIN_URL = BASE_URL + "login";
	
	public String AUTH_TOKEN_URL = "?token=";
	
	public String API_GROUP_URL = Constants.BASE_URL + "/apigroup/byusername/";
}
