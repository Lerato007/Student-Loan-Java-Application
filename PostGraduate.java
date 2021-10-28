package com.leratomoshabi;

public class PostGraduate extends Student{
    private String thesis;

    public PostGraduate(){

    }

    public PostGraduate(String name, long studentNumber, double loanAmount, String thesis) {
        super(name, studentNumber, loanAmount);
        this.thesis = thesis;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() + "Postgraduate thesis: " + thesis;
    }

    public void show(){
        super.show();
        System.out.println("Thesis: " + getThesis());
    }

    public double interest(){
        return getLoanAmount() * 0.10;
    }
}
