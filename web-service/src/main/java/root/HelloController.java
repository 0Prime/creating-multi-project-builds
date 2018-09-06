package root;

import greeter.GreetingFormatter;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {

	@GetMapping("/hello")
	public String greet(@RequestParam(defaultValue = "World", name = "name") String name) {
		return GreetingFormatter.greeting(name);
	}
}
