package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {
//    variable declaring
    private String name;
    private int studentId;
    private double gpa;
    private int numberOfCredits;

//    Constructor

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

//    Setters
    public void setName (String name){
        this.name = name;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }

// Getters
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }



}