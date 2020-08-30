/*   Created by IntelliJ IDEA.
 *   Author: Yogita Balyan(Yogita780)
 *   Date: 29-08-2020
 *   Time: 19:30
 *   File: Student.java
 */

package definitations;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String firstNameOfStudent;
    private String middleNameOfStudent;
    private String lastNameOfStudent;
    private long universityRollNumber;
    private int numberOfIssuedBook;
    private Book[] BooksIssuedByStudent;

    public Student(String firstNameOfStudent, String middleNameOfStudent, String lastNameOfStudent, long universityRollNumber, int numberOfIssuedBook) {
        this.firstNameOfStudent = firstNameOfStudent;
        this.middleNameOfStudent = middleNameOfStudent;
        this.lastNameOfStudent = lastNameOfStudent;
        this.universityRollNumber = universityRollNumber;
        this.numberOfIssuedBook = numberOfIssuedBook;
    }

    public Student() {

    }

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

    public Book[] getBooksIssuedByStudent() {
        return BooksIssuedByStudent.clone();
    }

    public void setNumberOfIssuedBook(int numberOfIssuedBook) {
        this.numberOfIssuedBook = numberOfIssuedBook;
    }

    @Override
    public String toString() {
        return Arrays.toString(BooksIssuedByStudent);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                numberOfIssuedBook == student.numberOfIssuedBook &&
                Objects.equals(getFirstNameOfStudent(), student.getFirstNameOfStudent()) &&
                Objects.equals(getMiddleNameOfStudent(), student.getMiddleNameOfStudent()) &&
                Objects.equals(getLastNameOfStudent(), student.getLastNameOfStudent()) &&
                Arrays.equals(getBooksIssuedByStudent(), student.getBooksIssuedByStudent());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstNameOfStudent(), getMiddleNameOfStudent(), getLastNameOfStudent(), getUniversityRollNumber(), numberOfIssuedBook);
        result = 31 * result + Arrays.hashCode(getBooksIssuedByStudent());
        return result;
    }
}
