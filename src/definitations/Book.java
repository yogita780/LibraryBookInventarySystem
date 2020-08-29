/*   Created by IntelliJ IDEA.
 *   Author: Yogita Balyan(Yogita780)
 *   Date: 23-08-2020
 *   Time: 20:22
 *   File: Book.java
 */

package definitations;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String ISBNNumber;

    public Book() {
        this.bookName = "SOFTWARE ENGINEERING";
        this.authorName = "YOGESH SINGH";
        this.ISBNNumber = "5423673452347"
    }

    public Book(String bookName, String authorName, String ISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumber = ISBNNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    @Override
    public String toString() {
        return String.format(
                "Book Name: %s, Book author: %s,Book ISBN number:%s",
                getBookName(), getAuthorName(), getISBNNumber()
        );
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(getISBNNumber(), book.getISBNNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getISBNNumber());
    }
}
