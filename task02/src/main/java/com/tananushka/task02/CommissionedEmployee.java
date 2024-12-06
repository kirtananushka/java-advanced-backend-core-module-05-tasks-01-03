package com.tananushka.task02;

public class CommissionedEmployee extends Employee {
   private final double salesAmount;
   private final double commissionRate;

   public CommissionedEmployee(String name, double salesAmount, double commissionRate) {
      super(name);
      this.salesAmount = salesAmount;
      this.commissionRate = commissionRate;
   }

   @Override
   public Money calculatePay() {
      return new Money(salesAmount * commissionRate);
   }

   @Override
   public Money calculateBonus() {
      return new Money(salesAmount * 0.1);
   }
}