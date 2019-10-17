package net.kodar.restaurantui.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IngredientsController {

	@GetMapping("/ingrediettable")
	public String index() {
		return "ingredientsTable.html";
	}
	
}
