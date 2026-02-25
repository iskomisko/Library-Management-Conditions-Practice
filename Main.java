//Akhmatkulov Islam Date: 25.02.2026 Id: 250104026
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new EBook("Arthur Conan Doyle", "[Sherlock Holmes]"));
        books.add(new PrintedBook("Franz Kafka", "[Metamorphosis]"));
        for (Book book : books) {
            System.out.println(book.getTitle());
            System.out.println(book.getAuthor());
            book.getFormat();
            System.out.println();
        }
    }
}
