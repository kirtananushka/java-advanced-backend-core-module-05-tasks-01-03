package com.tananushka.task03;

public class Main {
   public static void main(String[] args) {
      PaymentMethod creditCardPayment = new CreditCardPayment();
      PaymentMethod payPalPayment = new PayPalPayment(false);

      PaymentProcessor processor = new PaymentProcessor();

      processor.makePayment(creditCardPayment, 100.0);
      processor.makePayment(payPalPayment, 200.0);
   }
}