package net.kodar.restaurantui.config;

import static net.kodar.restaurantui.util.UtilsUI.createBAHeaders;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import net.kodar.restaurantui.data.entities.ApiGroup;
import net.kodar.restaurantui.data.entities.CustomUsernamePasswordAuthentication;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		if (null != authentication.getCredentials()) {
			String username = authentication.getName();
			String password = authentication.getCredentials().toString();

			RestTemplate restTemplate = new RestTemplate();

			String url = Constants.LOGIN_URL;

			HttpHeaders headers = createBAHeaders(username, password);
			HttpEntity<String> request = new HttpEntity<String>(headers);

			ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, request, String.class);

			if (response.getStatusCodeValue() == 200) {
				String authToken = response.getBody();

				final String urlAuthToken = Constants.API_GROUP_URL + username + Constants.AUTH_TOKEN_URL + authToken;

				ResponseEntity<List<ApiGroup>> responseGroup = restTemplate.exchange(urlAuthToken, HttpMethod.GET,
						null, new ParameterizedTypeReference<List<ApiGroup>>() {
						});

				List<ApiGroup> groups = responseGroup.getBody();

				CustomUsernamePasswordAuthentication auth = new CustomUsernamePasswordAuthentication(username, password,
						authToken, groups);

				SecurityContextHolder.getContext().setAuthentication(auth);
				return auth;
			}
		}

		return null;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}

}
