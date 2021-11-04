package tacos.web;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tacos.domain.TacoOrder;

import javax.validation.Valid;


@Controller
@RequestMapping("/orders")
public class OrderController {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(OrderController.class);

	@GetMapping("/current")
	public String orderForm(Model model) {
		model.addAttribute("tacoOrder", new TacoOrder());
		return "orderForm";
	}
	
	@PostMapping
	public String processOrder(@Valid  TacoOrder order, Errors errors) {
		if(errors.hasErrors()){
			return "orderForm";
		}

		log.info("Order submitted: " + order);
		return "redirect:/";
	}
}