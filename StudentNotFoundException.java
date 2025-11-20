// Name: Vanshika Dixit
// Roll Number: 2401010010
package exception;
public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(int rollNo) {
        super("Student with roll number " + rollNo + " not found.");
    }

    public StudentNotFoundException(String message) {
        super(message);
    }
}