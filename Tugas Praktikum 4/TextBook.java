public class TextBook extends Book implements BookOperations{
  private String subject;

  public TextBook(String title, String author, int year, String subject) {
    super(title, author, year);
    setSubject(subject);
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getSubject() {
    return subject;
  }

  public void borrowBook() {
    if(super.isBorrowed() == false) {
      System.out.println("Textbook : " + super.getTitle() + " is not borrowed.");
    } else {
      System.out.println("Textbook : " + super.getTitle() + " borrowed successfully.");
    }
  }

  public void returnBook() {
    if(super.isBorrowed() == false) {
      System.out.println("Textbook : " + super.getTitle() + " is not returned.");
    } else {
      System.out.println("Textbook : " + super.getTitle() + " returned successfully.");
    }
  }
}
