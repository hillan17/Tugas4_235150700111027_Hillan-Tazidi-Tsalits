public class Novel extends Book implements BookOperations {
  private String genre;

  public Novel(String title, String author, int year, String genre) {
    super(title, author, year);
    setGenre(genre);
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getGenre() {
    return genre;
  }

  public void borrowBook() {
    if (super.isBorrowed() == false) {
      System.out.println("Novel : " + super.getTitle() + " is not borrowed.");
    } else {
      System.out.println("Novel : " + super.getTitle() + " borrowed succesfully.");
    }
  }

  public void returnBook() {
    if (super.isBorrowed() == false) {
      System.out.println("Novel : " + super.getTitle() + " is not returned.");
    } else {
      System.out.println("Novel : " + super.getTitle() + " returned succesfully.");
    }
  }
}
