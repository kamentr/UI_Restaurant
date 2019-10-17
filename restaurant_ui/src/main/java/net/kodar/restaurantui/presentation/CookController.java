package net.kodar.restaurantui.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookController {

	@GetMapping("/cook")
	public String cook() {		
		return "cook.html";
	}
}
