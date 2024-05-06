public class Book {
  private String title;
  private String author;
  private int year;
  private boolean borrowed;

  public Book(String title, String author, int year) {
    this.title = title;
    this.author = author;
    this.year = year;
    borrowed = false;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public boolean isBorrowed() {
    return borrowed;
  }

  public boolean setBorrowed(boolean borrowed) {
    this.borrowed = borrowed;
    return borrowed;
  }

  public void displayInfo() {
    System.out.println("Title : " + title);
    System.out.println("Author : " + author);
    System.out.println("Year : " + year);
    System.out.println("Borrowed : " + borrowed);
  }
}
