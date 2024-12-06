package com.tananushka.task03;

public class PaymentProcessor {
   public void makePayment(PaymentMethod payment, double amount) {
      try {
         if (payment.validatePaymentDetails()) {
            payment.processPayment(amount);
         } else {
            System.out.println("Payment details validation failed.");
         }
      } catch (PaymentProcessingException e) {
         System.out.println("Error processing payment: " + e.getMessage());
      }
   }
}