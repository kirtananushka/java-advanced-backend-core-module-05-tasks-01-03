package com.tananushka.task01;

import java.util.HashMap;
import java.util.Map;

public class BookRegistry {
   private final Map<String, String> checkedOutBooks = new HashMap<>();

   public boolean checkOut(String bookId, String userId) {
      if (checkedOutBooks.containsKey(bookId)) return false;
      checkedOutBooks.put(bookId, userId);
      return true;
   }

   public boolean returnBook(String bookId) {
      return checkedOutBooks.remove(bookId) != null;
   }
}