package org.onkar.DesignPattern.FacadePatternProblem;

// Micriservice for Payment management.
public class PaymentService {
	
	public String getPaymentService(String paymentId) {
		return "Procrssing payment with PaymentId: " + paymentId;
	}
}
