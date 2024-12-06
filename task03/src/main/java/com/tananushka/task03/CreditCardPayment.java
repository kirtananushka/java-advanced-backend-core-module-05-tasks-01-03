package com.tananushka.task03;

public class CreditCardPayment implements PaymentMethod {
   @Override
   public boolean validatePaymentDetails() {
      // Validate
      return true;
   }

   @Override
   public void processPayment(double amount) throws PaymentProcessingException {
      System.out.println("Processing credit card payment of $" + amount);
   }
}