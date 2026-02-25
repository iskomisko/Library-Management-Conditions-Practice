public class Book {

    private String author;
    private String title;
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
    public void getFormat() {
        System.out.println("Generetic book format ");
    }
}
