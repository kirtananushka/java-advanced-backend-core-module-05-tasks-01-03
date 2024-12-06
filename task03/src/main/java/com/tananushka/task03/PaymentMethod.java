package com.tananushka.task03;

abstract class PaymentMethod {
   abstract boolean validatePaymentDetails();

   abstract void processPayment(double amount);
}
