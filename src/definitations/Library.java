/*   Created by IntelliJ IDEA.
 *   Author: Yogita Balyan(Yogita780)
 *   Date: 29-08-2020
 *   Time: 20:45
 *   File: Library.java
 */

package definitations;

public class Library {
    private Book[] currentlyBooksAvailable;

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

}
