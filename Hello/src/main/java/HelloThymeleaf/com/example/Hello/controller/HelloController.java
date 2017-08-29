package HelloThymeleaf.com.example.Hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;



@Controller

	
public class HelloController {
		@RequestMapping("/hello")
		public String hello(@RequestParam(name="name") String name, @RequestParam(name="age")int age, Model model) {
		
			model.addAttribute("name", name);
			model.addAttribute("age", age);
			return "welcome" ;
		}

}
