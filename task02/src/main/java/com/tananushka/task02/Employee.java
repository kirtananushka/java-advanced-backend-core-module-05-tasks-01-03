package com.tananushka.task02;

public abstract class Employee {
   private final String name;

   public Employee(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public abstract Money calculatePay();

   public abstract Money calculateBonus();
}