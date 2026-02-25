public class PrintedBook extends Book {
    public PrintedBook (String author, String title) {
        super(author, title);
    }
    @Override
    public void getFormat() {
        System.out.println("Paper format");
    }

}
