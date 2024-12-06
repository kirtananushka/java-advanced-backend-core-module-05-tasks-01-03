package com.tananushka.task03;

public class PayPalPayment implements PaymentMethod {
   private final boolean isLinkedToBankAccount;

   public PayPalPayment(boolean isLinkedToBankAccount) {
      this.isLinkedToBankAccount = isLinkedToBankAccount;
   }

   @Override
   public boolean validatePaymentDetails() {
      // Validate
      return true;
   }

   @Override
   public void processPayment(double amount) throws PaymentProcessingException {
      if (!isLinkedToBankAccount) {
         throw new PaymentProcessingException("PayPal account not linked to a bank account.");
      }
      System.out.println("Processing PayPal payment of $" + amount);
   }
}