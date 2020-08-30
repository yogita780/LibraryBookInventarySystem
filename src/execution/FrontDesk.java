/*   Created by IntelliJ IDEA.
 *   Author: Yogita Balyan(Yogita780)
 *   Date: 29-08-2020
 *   Time: 21:40
 *   File: FrontDesk.java
 */

package execution;

import definitations.Book;
import definitations.Library;
import definitations.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int EXIT = 4;
    private static final int ISSUE_A_BOOK = 1;
    private static final int RETURN_PREVIOUSLY_ISSUED_BOOKS = 2;
    private static final int SHOW_ALL_BOOKS_ISSUED = 3;

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        Book bookObject = new Book();
        Library libraryObject = new Library();
        Student studentObject = new Student();
        System.out.println("enter your first name");
        String firstname = scannerObject.nextLine();
        System.out.println("enter your middle name");
        String middle = scannerObject.nextLine();
        System.out.println("enter your last name");
        String lastname = scannerObject.nextLine();
        System.out.println("enter your roll.no:");
        long rollNumber = scannerObject.nextLong();
        scannerObject.nextLine();
        System.out.println("-=-=--=-=-\"Welcome," + firstname + ",TO THE FRONT DESK\"-=-=--=-=-");
        System.out.println("how may i help you?");
        System.out.println("1. issue a new book for me:");
        System.out.println("2.return a previously issues book for me:");
        System.out.println("show me all my issues books:");
        System.out.println("4.exit:");
        System.out.println("ENTER YOUR CHOICE FROM:[1,2,3,4]");
        int choice = scannerObject.nextInt();
        String bookName;
        int booksIssued;
        if (choice <= 4) {
            switch (choice) {
                case ISSUE_A_BOOK:
                    System.out.println("ENTER THE NAME OF THE BOOK YOU WANT TO ISSUE:");
                    scannerObject.nextLine();
                    bookName = scannerObject.nextLine();
                    libraryObject.doCheckOut(bookName);
                    break;
                case RETURN_PREVIOUSLY_ISSUED_BOOKS:
                    System.out.println("ENTER THE NAME OF BOOK,YOU WANT TO RETURN:");
                    scannerObject.nextLine();
                    bookName = scannerObject.nextLine();
                    libraryObject.doReturn(bookName);
                    break;
                case SHOW_ALL_BOOKS_ISSUED:
                    System.out.println("ENTER THE NUMBER OF BOOKS ISSUED:");
                    booksIssued = scannerObject.nextInt();
                    studentObject.getBooksIssuedByStudent();
                    break;
                case EXIT:
                    break;

            }

        } else {
            System.out.println("PLEASE CHOOSE THE CORRECT OPTION?");
        }
        scannerObject.close();
    }
}
