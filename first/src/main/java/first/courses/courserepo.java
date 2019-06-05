package first.courses;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface courserepo extends CrudRepository<course,String> {
	
	public List<course> findByTopicId(String id);

}
