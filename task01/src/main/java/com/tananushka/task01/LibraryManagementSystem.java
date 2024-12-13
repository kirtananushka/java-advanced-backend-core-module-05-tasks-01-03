package com.tananushka.task01;

public class LibraryManagementSystem implements BookLendingService {
   private final BookRegistry bookRegistry;

   public LibraryManagementSystem(BookRegistry bookRegistry) {
      this.bookRegistry = bookRegistry;
   }

   @Override
   public void checkOutBook(String bookId, String userId) {
      if (bookRegistry.checkOut(bookId, userId)) {
         System.out.println("Book checked out to " + userId);
      } else {
         System.out.println("Book is currently unavailable.");
      }
   }

   @Override
   public void returnBook(String bookId) {
      if (bookRegistry.returnBook(bookId)) {
         System.out.println("Book returned.");
      } else {
         System.out.println("This book was not checked out.");
      }
   }
}