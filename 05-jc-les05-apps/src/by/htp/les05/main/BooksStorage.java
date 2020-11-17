package by.htp.les05.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;


public class BooksStorage {
    private ArrayList<Book> books;

    public BooksStorage(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }
    public void sortBooks() {
        Collections.sort(this.books);
    }

    public static String toString(ArrayList<Book> books) {
        String result = "";
        for (int i = 0; i < books.size(); i++) {
            result += books.get(i).toString() + "\n";
        }
        return result;
    }

    private static ArrayList<Book> filterByField(Function<Book, String> func, String value, ArrayList<Book> books) {
        ArrayList<Book> result = new ArrayList<Book>();
        for (Book book : books) {
            if (func.apply(book).equals(value)) {
                result.add(book);
            }
        }
        return result;
    }

    public static ArrayList<Book> filterByAuthor(String value, ArrayList<Book> books) {
        Function<Book, String> getBookAuthor = e -> e.getAuthor();
        return BooksStorage.filterByField(getBookAuthor, value, books);
    }

    public static ArrayList<Book> filterByPublishingHouse(String value, ArrayList<Book> books) {
        Function<Book, String> getBookAuthor = e -> e.getPublishingHouse();
        return BooksStorage.filterByField(getBookAuthor, value, books);
    }

    public static ArrayList<Book> afterYearOfPublishing(int yearOfPublishing, ArrayList<Book> books) {
        ArrayList<Book> result = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getYearOfPublishing() > yearOfPublishing) {
                result.add(book);
            }
        }
        return result;
    }
}
