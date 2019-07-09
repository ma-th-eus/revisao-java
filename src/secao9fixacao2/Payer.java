package secao9fixacao2;

public abstract class Payer {

	private String name;
	private double anualIncome;
	
	public Payer(String name, double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	protected String getName() {
		return name;
	}

	protected double getAnualIncome() {
		return anualIncome;
	}
	
	public abstract double taxPaid();

}
