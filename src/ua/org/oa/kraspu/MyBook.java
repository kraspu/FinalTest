package ua.org.oa.kraspu;

public class MyBook extends Book {
  private String title;
  @Override
  void setTitle(String s) {
    this.title = s;
  }

  @Override
  public String getTitle() {
    return "\t\tA title is: " + title;
  }
}
