package com.tananushka.task01;

public class Main {
   public static void main(String[] args) {
      BookRegistry bookRegistry = new BookRegistry();
      LibraryManagementSystem library = new LibraryManagementSystem(bookRegistry);

      library.checkOutBook("BK001", "USR001");
      library.returnBook("BK001");
   }
}