package secao5estruturadedados.exercicioproposto;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	private void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(Double percent) {
		setSalary(this.salary*(1+(percent/100)));
	}
	
	public String toString() {
		return id + ", " + name + ", " + salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}
	
	
}
