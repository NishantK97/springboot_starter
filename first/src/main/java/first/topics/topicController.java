package first.topics;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topicController {
	@Autowired
	private topicserv tp;

	@GetMapping("/topics")
	public List<topic> sayt(){
		return tp.getall();		
	} 
	
	@GetMapping("/topic/{id}")
	public topic getbyid(@PathVariable String id) {
		return tp.gettopic(id);
	}
	
	@PostMapping("/topics")
	public void settopic(topic single_topic) {
		tp.addtopic(single_topic);
	}
	
	@PutMapping("/topics/{id}")
	public void updatetopic(@PathVariable String id,topic single_topic) {
		tp.updateTopic(single_topic,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		tp.deleteTopic(id);
	}
	
}