package secao3orientacaoobjeto.exerciciofixacao.ex2;

public class Employee {
	
	private String name;
	private double grossSalary;
	private double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percent) {
		grossSalary*=(1+(percent/100));
		System.out.println("Updated data: " + name + ", $ " + NetSalary());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public String getStatus() {
		return "Employee: " + name + ", $ " + NetSalary();
	}
}
