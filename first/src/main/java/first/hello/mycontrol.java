package first.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontrol {

	@RequestMapping("/hello")
	public String sayhi() {
		return "Heyya!";
	}
}
