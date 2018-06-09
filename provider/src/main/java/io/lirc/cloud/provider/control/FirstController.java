package io.lirc.cloud.provider.control;

import io.lirc.cloud.provider.domain.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class FirstController {
	
	@RequestMapping(value = "/person/{personId}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Person findPerson(@PathVariable("personId") Integer personId, HttpServletRequest request) {
		Person person = new Person(personId, "Crazyit", 30);
		person.setMessage(request.getRequestURL().toString());
		return person;
	}
}
