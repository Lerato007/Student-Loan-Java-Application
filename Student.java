package com.leratomoshabi;

public class Student {
    private String name;
    private long studentNumber;
    private double loanAmount;

    public Student(){

    }

    public Student(String name, long studentNumber, double loanAmount) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.loanAmount = loanAmount;
    }

    public String getName() {
        return name;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                "Student Number: " + this.studentNumber +
                "Loan Amount: " + this.loanAmount;
    }

    public void show(){
        System.out.println("Student Details:" + "\n");
        System.out.println("Name: " + getName());
        System.out.println("Student Number: " + getStudentNumber());
        System.out.println("Loan Amount: " + getLoanAmount());
    }

    public double interest(){
        return loanAmount * 0.05;
    }
}
