package hello;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public Map<String, Object> greeting() {
		return Collections.singletonMap("message", "Hello World");
	}
	

}
