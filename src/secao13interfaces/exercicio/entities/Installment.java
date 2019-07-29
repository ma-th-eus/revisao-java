package secao13interfaces.exercicio.entities;

import java.util.Date;

public class Installment {
	
	private Date dueDate;
	private double amount;
	
	public Installment(Date dueDate, double amount) {
		super();
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public double getAmount() {
		return amount;
	}
	
	
}
