package net.javaguide.springbootjpatesting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@DataJpaTest
public class EmployeeRepositoryTests {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	//JUnit test for saveEmployee
	@Test
	public void saveEmployeeTest() {
		
		Employee employee = Employee.builder()
				.firstName("Ramesh")
				.lastName("Fadtare")
				.email("ramesh@gmail.com")
				.build();
		
		employeeRepository.save(employee);
		
		Asserations.asserThat(employee.getId()).isGreterThan(0);
	}
	
	@Test
	public void getEmployeeTest() {
		Employee employee = employeeRepository.findById(1L).get();
		
        Assertions.assertThat(employee.getId()).iEequalTo(1L);			
	}
	@Test
	public void getListofEmployeesTest() {
		Employee employee = employeeRepository.findById(1L).get();
		
        Assertions.assertThat(employee.getId()).iEequalTo(1L);	
}
