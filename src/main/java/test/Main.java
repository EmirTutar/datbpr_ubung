package test;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matr_nr: ");
        int matr_nr = scanner.nextInt();
        StudentTO student = null;
        student = studentDao.readStudentByMatNr(matr_nr);
        System.out.println(student.getFirstName()+ " " +student.getLastName());
    }

}
