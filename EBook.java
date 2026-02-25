public class EBook extends Book {

    public EBook(String author, String title) {
        super(author, title);

    }
    @Override
    public void getFormat() {
        System.out.println("Digital format");

    }
}
