public class Magazine extends Book implements BookOperations {
  private String category;

  public Magazine(String title, String author, int year, String category) {
    super(title, author, year);
    setCategory(category);
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getCategory() {
    return category;
  }

  public void borrowBook() {
    if (super.isBorrowed() == false) {
      System.out.println("Magazine : " + super.getTitle() + " is not borrowed.");
    } else {
      System.out.println("Magazine : " + super.getTitle() + " borrowed succesfully.");
    }
  }

  public void returnBook() {
    if (super.isBorrowed() == false) {
      System.out.println("Magazine : " + super.getTitle() + " is not returned.");
    } else {
      System.out.println("Magazine : " + super.getTitle() + " returned succesfully.");
    }
  }
}
