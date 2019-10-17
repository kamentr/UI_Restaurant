package net.kodar.restaurantui.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WaiterController {

	@GetMapping("/waiter")
	public String waiter() {
		return "waiter.html";
	}
}
