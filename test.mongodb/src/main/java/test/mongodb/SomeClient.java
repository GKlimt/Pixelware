package test.mongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class SomeClient {
	@Autowired
	private PersonRepository repository;
	
	public void doSomething(){
		List<Person> persons = repository.findByLastName("Matthews");
	}
	
}
