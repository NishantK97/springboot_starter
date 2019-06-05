package first.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class topicserv {
	
	topicrepo tp;
	
	public List<topic> getall(){
		List<topic> topics=new ArrayList<>();
		tp.findAll().forEach(topics::add);
		return topics;
	}

	
	public topic gettopic(String id) {	
		return tp.findOne(id);
	}


	public void addtopic(topic single_topic) {
		tp.save(single_topic);
	}


	public void updateTopic(topic single_topic, String id) {
		
		tp.save(single_topic);
	}


	public void deleteTopic(String id) {
		
		tp.delete(id);
	}
}
