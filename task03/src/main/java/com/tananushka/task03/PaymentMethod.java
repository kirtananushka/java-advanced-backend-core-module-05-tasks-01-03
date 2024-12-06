package com.tananushka.task03;

public interface PaymentMethod {
   boolean validatePaymentDetails();

   void processPayment(double amount) throws PaymentProcessingException;
}
