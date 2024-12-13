package com.tananushka.task01;

public interface BookLendingService {
   void checkOutBook(String bookId, String userId);

   void returnBook(String bookId);
}
