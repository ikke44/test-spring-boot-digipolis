package gent.digipolis.sf.testjx.testspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;
import java.util.Date;

@SpringBootApplication
@Controller
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping("/")
	public String home(Map<String, Object> model) {
		model.put("message", "Hello Service Factory");
		model.put("title", "Hello Home");
		model.put("date", new Date());
		return "home";
	}
	
}
