import obj.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import comparartor.*;
/**
 * Created by anastasiya on 21.9.16.
 */
public class Main {

    public static void main(String[] args) {

        Book[] books = generateBooks();

        Comparator<Book> bcompTitle = new BookTitleComparator();
        System.out.println("title sort");
        startComparator(bcompTitle, books);

        Comparator<Book> bcompTitleAuthor = new BookTitleComparator().thenComparing(new BookAuthorComparator());
        System.out.println("title-author sort");
        startComparator(bcompTitleAuthor, books);

        Comparator<Book> bcompAuthorTitle = new BookAuthorComparator().thenComparing(new BookTitleComparator());
        System.out.println("author-title sort");
        startComparator(bcompAuthorTitle, books);

        Comparator<Book> bcompAuthorPrice = new BookAuthorComparator().thenComparing(new BookTitleComparator()).thenComparing(new BookPriceComparator());
        System.out.println("author-title-price sort");
        startComparator(bcompAuthorPrice, books);

    }

    private static void startComparator(Comparator<Book> comparator, Book[] books){
        Collections.sort(Arrays.asList(books), comparator);
        printBooks(books);
    }

    private static void printBooks(Book[] books){
        for(Book book : books)
            System.out.println(book.getAuthor() + " " + book.getTitle() + " " + book.getPrice() + " " + book.getIsbn());
    }


    private static Book[] generateBooks(){
        Book[] books = {new Book("a", "b", 100), new Book("z", "k", 50), new Book("n", "s", 80), new Book("h", "y", 120),
                new Book("c", "a", 700), new Book("a", "w", 300), new Book("a", "w", 150), new Book("s", "a", 80), new Book("a", "w", 110) };
        return books;
    }


}
