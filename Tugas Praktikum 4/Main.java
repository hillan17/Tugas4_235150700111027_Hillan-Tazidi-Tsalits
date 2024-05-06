public class Main {
  public static void main(String[] args) {
    TextBook textbook = new TextBook("Java Programming", "John Smith", 2020, "Programming");
    Novel novel = new Novel("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction");
    Magazine magazine = new Magazine("National Geographic", "Various", 2021, "History");

    Book[] books = new Book[3];
    books[0] = textbook;
    books[1] = novel;
    books[2] = magazine;

    System.out.println("---- Book Information ----");
    for(Book currentBook : books) {
      if(currentBook instanceof TextBook) {
        TextBook book = (TextBook)currentBook;
        System.out.println("Subject : " + book.getSubject());
        book.displayInfo();
        System.out.println();

      } else if(currentBook instanceof Novel) {
        Novel book = (Novel)currentBook;
        System.out.println("Genre : " + book.getGenre());
        book.displayInfo();
        System.out.println();

      } else if(currentBook instanceof Magazine) {
        Magazine book = (Magazine)currentBook;
        System.out.println("Category : " + book.getCategory());
        book.displayInfo();
        System.out.println();
      }
    }

    System.out.println("---- Borrowing and Returning Book ----");
    for(int i = 0; i < books.length; i++) {
      if(books[i] instanceof TextBook) {
        TextBook book = (TextBook)books[i];
        book.setBorrowed(true);
        book.borrowBook();
        book.returnBook();
      } else if(books[i] instanceof Novel) {
        Novel book = (Novel)books[i];
        book.setBorrowed(false);
        book.borrowBook();
        book.setBorrowed(true);
        book.returnBook();
      } else if(books[i] instanceof Magazine) {
        Magazine book = (Magazine)books[i];
        book.setBorrowed(true);
        book.borrowBook();
        book.setBorrowed(false);
        book.returnBook();
      }
    }
  }
}
