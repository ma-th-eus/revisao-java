package secao9fixacao2;

public class Company extends Payer {

	private int numEmployees;

	public Company(String name, double anualIncome, int numEmployees) {
		super(name, anualIncome);
		this.numEmployees = numEmployees;
	}

	protected int getNumEmployees() {
		return numEmployees;
	}

	@Override
	public double taxPaid() {
		double tax = this.getAnualIncome()*0.16;
		
		if(numEmployees > 10)
			tax = this.getAnualIncome()*0.14;
			
		return tax;
	}
	
	
	
	

}
