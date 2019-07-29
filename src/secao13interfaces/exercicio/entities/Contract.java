package secao13interfaces.exercicio.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private int number;
	private Date date;
	private double contractValue;
	private double totalValue;
	
	private List<Installment> installments = new ArrayList<>();
	
	public Contract(int number, Date date, double contractValue, double totalValue) {
		this.number = number;
		this.date = date;
		this.contractValue = contractValue;
		this.totalValue = totalValue;
	}

	public int getNumber() {
		return number;
	}

	public Date getDate() {
		return date;
	}

	public double getContractValue() {
		return contractValue;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
	
	public void addInstallment(Installment installment) {
		installments.add(installment);
	}

	public void removeInstallment(Installment installment) {
		installments.remove(installment);
	}

	
	
	
	
	
	

}
