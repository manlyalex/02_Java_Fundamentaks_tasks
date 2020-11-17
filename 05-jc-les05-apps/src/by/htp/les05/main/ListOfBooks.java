package by.htp.les05.main;

import java.util.ArrayList;

public class ListOfBooks {
    public static void main(String[] args) {

        Book book1 = new Book(1, "The Stand", "Stephen King", "Doubleday",
                1979, 823, 100, "HARD COVER");
        Book book2 = new Book(2, "Rage", "Stephen King", "Signet Books",
                1977, 211, 124, "SOFT COVER");
        Book book3 = new Book(3, "C++: The Complete Reference", "Herbert Schildt", "Osborne",
                1991, 1056, 38, "HARD COVER");

        ArrayList<Book> books = new ArrayList<Book>();

        books.add(book1);
        books.add(book2);
        books.add(book3);

        BooksStorage booksStorage = new BooksStorage(books);

        System.out.println(BooksStorage.toString(booksStorage.getBooks()));
        booksStorage.sortBooks();
        System.out.println(BooksStorage.toString(booksStorage.getBooks()));

        ArrayList<Book> filteredByAuthor = BooksStorage.filterByAuthor("Stephen King", books);
        ArrayList<Book> filteredByPublishingHouse = BooksStorage.filterByPublishingHouse("Doubleday", books);
        ArrayList<Book> afterYearOfPublishing = BooksStorage.afterYearOfPublishing(1990, books);

        System.out.println(BooksStorage.toString(filteredByAuthor));
        System.out.println(BooksStorage.toString(filteredByPublishingHouse));
        System.out.println(BooksStorage.toString(afterYearOfPublishing));

    }
}
