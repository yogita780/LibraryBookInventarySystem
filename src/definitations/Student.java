/*   Created by IntelliJ IDEA.
 *   Author: Yogita Balyan(Yogita780)
 *   Date: 29-08-2020
 *   Time: 19:30
 *   File: Student.java
 */

package definitations;

public class Student {
    private String firstNameOfStudent;
    private String middleNameOfStudent;
    private String lastNameOfStudent;
    private long universityRollNumber;
    private int numberOfIssuedBook;

    public String getFirstNameOfStudent() {
        return firstNameOfStudent;
    }

    public void setFirstNameOfStudent(String firstNameOfStudent) {
        this.firstNameOfStudent = firstNameOfStudent;
    }

    public String getMiddleNameOfStudent() {
        return middleNameOfStudent;
    }

    public void setMiddleNameOfStudent(String middleNameOfStudent) {
        this.middleNameOfStudent = middleNameOfStudent;
    }

    public String getLastNameOfStudent() {
        return lastNameOfStudent;
    }

    public void setLastNameOfStudent(String lastNameOfStudent) {
        this.lastNameOfStudent = lastNameOfStudent;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfIssuedBook() {
        return numberOfIssuedBook;
    }

    public void setNumberOfIssuedBook(int numberOfIssuedBook) {
        this.numberOfIssuedBook = numberOfIssuedBook;
    }
}