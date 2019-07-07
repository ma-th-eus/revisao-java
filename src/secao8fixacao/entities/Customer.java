package secao8fixacao.entities;

import java.util.Date;

public class Customer {
	private String name;
	private String email;
	private Date birthDate;
	
	public Customer(String name, String email, Date birthDate) {
		super();
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Date getBirthDate() {
		return birthDate;
	}
	
	
	
	
}
