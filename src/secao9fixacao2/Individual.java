package secao9fixacao2;

public class Individual extends Payer {
	
	private double healthExpenditure;

	public Individual(String name, double anualIncome, double healthExpenditure) {
		super(name, anualIncome);
		this.healthExpenditure = healthExpenditure;
	}

	protected double getHealthExpenditure() {
		return healthExpenditure;
	}

	@Override
	public double taxPaid() {
		
		double tax = 0;
		
		if(this.getAnualIncome() < 20000)
			tax = this.getAnualIncome()*0.15;
		else
			tax = this.getAnualIncome()*0.25;
		
		if(healthExpenditure > 0)
			tax -= (healthExpenditure*0.5);
		
		return tax;
	}
	
	

}
