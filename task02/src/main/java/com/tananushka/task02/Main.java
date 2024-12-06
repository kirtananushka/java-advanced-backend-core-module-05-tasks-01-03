package com.tananushka.task02;

import java.util.List;

public class Main {
   public static void main(String[] args) {
      Employee commissioned = new CommissionedEmployee("Alice", 5000, 0.1);
      Employee hourly = new HourlyEmployee("Bob", 20, 45);
      Employee salaried = new SalariedEmployee("Charlie", 60000);

      List<Employee> employees = List.of(commissioned, hourly, salaried);

      for (Employee employee : employees) {
         System.out.println("Employee: " + employee.getName());
         System.out.println("Pay: " + employee.calculatePay().amount());
         System.out.println("Bonus: " + employee.calculateBonus().amount());
         System.out.println();
      }
   }
}