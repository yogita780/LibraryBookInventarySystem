/*   Created by IntelliJ IDEA.
 *   Author: Yogita Balyan(Yogita780)
 *   Date: 29-08-2020
 *   Time: 20:45
 *   File: Library.java
 */

package definitations;

import java.util.Arrays;

public class Library {
    private Book[] currentlyBooksAvailable;

    public Library(Book[] currentlyBooksAvailable) {
        this.currentlyBooksAvailable = currentlyBooksAvailable;
    }

    public Library() {
        Book book1 = new Book("Operating System Concept", "Avi Silberschaztz", "3456723456894");
        Book book2 = new Book("Higher Mathematics", "B.S Grewal", "2354613789453");
        Book book3 = new Book("Chandrakanta", "Devaki Nandan Khatri", "4532167834567");
        Book[] books = new Book[]{book1, book2, book3};
        this.currentlyBooksAvailable = books;

    }

    public Book[] getCurrentlyBooksAvailable() {
        return currentlyBooksAvailable;
    }

    public void setCurrentlyBooksAvailable(Book[] currentlyBooksAvailable) {
        this.currentlyBooksAvailable = currentlyBooksAvailable;
    }

    @Override
    public String toString() {
        return Arrays.toString(currentlyBooksAvailable);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Library library = (Library) object;
        return Arrays.equals(getCurrentlyBooksAvailable(), library.getCurrentlyBooksAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getCurrentlyBooksAvailable());
    }

    public void addBooks(String bookName) {
        System.out.println(bookName + ",is added successfully.");
    }

    public void doCheckOut(String bookName) {
        System.out.println(bookName + ",issued successfully");
    }

    public void doReturn(String bookName) {
        System.out.println(bookName + ",return successfully");
    }
}
