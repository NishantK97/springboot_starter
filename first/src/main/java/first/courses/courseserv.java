package first.courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class courseserv {
	
	courserepo cp;
	
	
	public List<course> getall(String topicid){
		List<course> courses=new ArrayList<>();
		cp.findByTopicId(topicid).forEach(courses::add);
		return courses;
	}

	
	public course getcourse(String id) {
	
		return cp.findOne(id);
	}


	public void addcourse(course single_course) {
		cp.save(single_course);
	}


	public void updateCourse(course single_course) {
		
		cp.save(single_course);
	}


	public void deleteCourse(String id) {
		
		cp.delete(id);
	}
}
