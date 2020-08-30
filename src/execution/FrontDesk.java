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
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        Book bookobject = new Book();
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
    }
}
