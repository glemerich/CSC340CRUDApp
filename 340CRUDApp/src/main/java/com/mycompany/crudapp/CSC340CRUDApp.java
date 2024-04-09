/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.crudapp;

/**
 *
 * @author garrettemerich
 */
import java.util.List;
import java.util.Scanner;

public class CSC340CRUDApp {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        StudentDAO studentDAO = new StudentDAO(dbConnection.getConnection());

        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println();
                System.out.println("1. Add Student");
                System.out.println("2. Update Student");
                System.out.println("3. Delete Student");
                System.out.println("4. View All Students");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.print("Enter student grade: ");
                        double grade = scanner.nextDouble();
                        Student newStudent = new Student(0, name, grade); // ID will be auto-generated
                        studentDAO.addStudent(newStudent);
                        System.out.println("Student added successfully.");
                        break;
                    case 2:
                        System.out.print("Enter student ID to update: ");
                        int updateId = scanner.nextInt();
                        System.out.print("Enter updated student name: ");
                        scanner.nextLine();
                        String updatedName = scanner.nextLine();
                        System.out.print("Enter updated student grade: ");
                        double updatedGrade = scanner.nextDouble();
                        Student updatedStudent = new Student(updateId, updatedName, updatedGrade);
                        studentDAO.updateStudent(updatedStudent);
                        System.out.println("Student updated successfully.");
                        break;
                    case 3:
                        System.out.print("Enter student ID to delete: ");
                        int deleteId = scanner.nextInt();
                        studentDAO.deleteStudent(deleteId);
                        System.out.println("Student deleted successfully.");
                        break;
                    case 4:
                        List<Student> students = studentDAO.getAllStudents();
                        for (Student student : students) {
                            System.out.println(student.getId() + " " + student.getName() + " " + student.getGrade());
                        }
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 5);
        } finally {
            dbConnection.closeConnection();
        }
    }
}

