//package net.kodar.restaurantui.config;
//
//import java.io.IOException;
//import java.util.Optional;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.http.HttpResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpRequest;
//import org.springframework.security.authentication.AnonymousAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import net.kodar.restaurantui.data.entities.CustomAuthenticationToken;
//import net.kodar.restaurantui.data.entities.CustomUsernamePasswordAuthentication;
//
//@Component
//public class CustomAuthenticationFilter extends OncePerRequestFilter {
//
//	@Autowired
//	private ApiCredentials apiCredentials;
//
//	@Autowired 
//	private RestTemplate restTemplate;
//	
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//
//		Authentication authentication = apiCredentials.getAuthentication();
//
//		if (null != authentication && authentication.isAuthenticated()
//				&& !authentication.getPrincipal().equals("anonymousUser")) {
//
//			CustomUsernamePasswordAuthentication customAuthentication = (CustomUsernamePasswordAuthentication) authentication;
//
//		}
//
//		filterChain.doFilter(request, response);
//	}
//
//}