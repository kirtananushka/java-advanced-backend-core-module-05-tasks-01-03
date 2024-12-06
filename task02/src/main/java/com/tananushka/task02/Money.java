package com.tananushka.task02;

public record Money(double amount) {

   @Override
   public String toString() {
      return String.format("$%.2f", amount);
   }
}