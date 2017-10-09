package test.mongodb;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface PersonRepository extends Repository<User, Long>{

	List<Person> findByLastName(String lastname);
	
}
