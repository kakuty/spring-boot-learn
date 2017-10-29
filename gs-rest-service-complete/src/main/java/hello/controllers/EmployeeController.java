package hello.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hello.data.Employee;
import hello.data.PersonInfo;

@RestController
public class EmployeeController {
    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public ResponseEntity<Employee> getPersonInfo() {
    	PersonInfo personInfo = new PersonInfo("Join", "Micheal", "Some address", "123456789");
    	Employee employee = new Employee(personInfo, 100, "Director");
    	return ResponseEntity.ok().body(employee);
    }
}
