package net.javaguide.springbootjpatesting;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
//@Table(name="employee")
public class Employee {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_Nmae", nullable = false)
	private String lastName;
	
	@Column(name = "email", nullable = false)
	private String email;

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
