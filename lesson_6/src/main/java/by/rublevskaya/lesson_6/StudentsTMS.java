package main.java.by.rublevskaya.lesson_6;

public class StudentsTMS {
    String firstName;
    String lastName;
    String phoneNumber;
    String emale;
    String course;
    String passportNumber;

    public StudentsTMS(String firstName, String lastName, String phoneNumber, String emale, String course, String passportNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emale = emale;
        this.course = course;
        this.passportNumber = passportNumber;

    }

    public void printInfo() {
        System.out.println("student's name: " + firstName + ", student's last name: " + lastName + ", student's phone number: " + phoneNumber
                           + ", student's emale: " + emale  + ", student's course: " + course  + ", student's passport " + passportNumber);
        System.out.println();
    }
}


