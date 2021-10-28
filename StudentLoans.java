package com.leratomoshabi;

import java.util.Scanner;

public class StudentLoans {

    private Student[] students = new Student[20];
    private int noOfStudents;

    public StudentLoans(){
        students[0] = new Student("Smittie", 12345, 10000.0);
        students[1] = new Student("Jonny", 54321, 67400.0);
        students[2] = new PostGraduate("Mpho", 201812345, 10000.0, "I do not know");
        students[3] = new PostGraduate("Mural", 201745903, 23450.0, "I am a money magnet");
        this.noOfStudents = 4;
    }

    public int menu(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("1: Add student");
        System.out.println("2: Display students");
        System.out.println("3: Display interest");
        System.out.println("4: Exit");
        choice = scanner.nextInt();

        return choice;
    }

    public Student createStudent(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a student name:");
        String studentName = scanner.next();
        System.out.println("Enter student number:");
        int studentNumber = scanner.nextInt();
        System.out.println("Enter loan amount:");
        double loanAmount = scanner.nextDouble();

        Student student = new Student(studentName, studentNumber, loanAmount);

        return student;
    }

    public PostGraduate createPostGraduate(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a student name:");
        String studentName = scanner.nextLine();
        System.out.println("Enter student number:");
        int studentNumber = scanner.nextInt();
        System.out.println("Enter loan amount:");
        double loanAmount = scanner.nextDouble();
        System.out.println("Enter thesis:");
        String thesis = scanner.next();

        PostGraduate pGrad = new PostGraduate(studentName, studentNumber, loanAmount, thesis);

        return pGrad;
    }

    public void displayAllStudents(){
        System.out.println("Displaying all Students:");

        System.out.println("-------------------------------------");
        for (int i = 0; i < noOfStudents; i++){
            students[i].show();
            System.out.println("-------------------------------------");
        }
    }

    public void displayLoanAmounts(){
        System.out.println("Loan amounts and Interests:");

        for (int i = 0; i < noOfStudents; i++){
            System.out.println("" + students[i].getLoanAmount() +
                    "     " + students[i].interest());
            System.out.println("-------------------------------------");
        }
    }

    public void menuControl(){
        int option;
        while (true){
            option = menu();
            switch (option){
                case 1:
                    add();
                    break;

                case 2:
                    displayAllStudents();
                    break;

                case 3:
                    displayLoanAmounts();
                    break;

                case 4:
                    System.out.println("Thank you");
                    System.exit(0);

                default:
                    System.out.println("Not a valid option");
                    System.out.println("Please try again");
            }
        }
    }

    public void add(){
        int choice;
        Student student;
        PostGraduate postGraduate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Student");
        System.out.println("Enter 2 for Post Graduate Student");
        choice = scanner.nextInt();

        switch (choice){
            case 1:
                student = createStudent();
                students[noOfStudents] = student;
                noOfStudents++;
                break;

            case 2:
                postGraduate = createPostGraduate();
                students[noOfStudents] = postGraduate;
                noOfStudents++;
                break;

            default:
                System.out.println("Wrong choice");
        }
    }
}
