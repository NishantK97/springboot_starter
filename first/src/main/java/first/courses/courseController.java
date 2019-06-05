package first.courses;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import first.topics.topic;

@RestController
public class courseController {
	@Autowired
	private courseserv cp;

	@GetMapping("/topics/{topicid}/courses")
	public List<course> sayt(@PathVariable String topicid){
		return cp.getall(topicid);		
	} 
	
	@GetMapping("/topic/{topicid}/courses/{id}")
	public course getbyid(@PathVariable String id) {
		return cp.getcourse(id);
	}
	
	@PostMapping("/topics/{topicid}/courses")
	public void setcourse(course single_course, @PathVariable String topicid) {
		single_course.setTopics(new topic(topicid,"",""));
		cp.addcourse(single_course);
	}
	
	@PutMapping("/topics/{topicid}/courses/{id}")
	public void updatecourse(@PathVariable String topicid,@PathVariable String id,course single_course) {
		single_course.setTopics(new topic(topicid,"",""));
		cp.updateCourse(single_course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicid}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		cp.deleteCourse(id);
	}
	
}