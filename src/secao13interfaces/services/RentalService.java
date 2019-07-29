package secao13interfaces.services;

import secao13interfaces.entities.CarRental;
import secao13interfaces.entities.Invoice;

public class RentalService {
	private Double pricePerDay;
	private Double pricePerHour;
	
	private BrasilTaxService taxService;

	public RentalService() {
	}

	public RentalService(Double pricePerDay, Double pricePerHour, BrasilTaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		double hours = (double)(t2-t1) /1000 / 60 / 60;
		double basicPayment;
		
		if(hours <= 12) 
			basicPayment = Math.ceil(hours) * pricePerHour;
		else
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
		
	}
}
