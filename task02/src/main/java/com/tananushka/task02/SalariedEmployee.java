package com.tananushka.task02;

public class SalariedEmployee extends Employee {
   private final double annualSalary;

   public SalariedEmployee(String name, double annualSalary) {
      super(name);
      this.annualSalary = annualSalary;
   }

   @Override
   public Money calculatePay() {
      return new Money(annualSalary / 12);
   }

   @Override
   public Money calculateBonus() {
      return new Money(annualSalary * 0.05);
   }
}