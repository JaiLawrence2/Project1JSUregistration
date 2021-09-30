package CS232_Project1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Course {
    private String name;
    private int crn;
    private String number;
    private int section;
    private int credits;
    private String type;
    private String instructor;
    
    public Course() {
    name = number = type = instructor = "";
    crn = section = credits = 0;
    }
       
    public Course(String n, int c, String num, int s, int cred, String t, String ins) {
        this.name = n;
        this.crn = c;
        this.number = num;
        this.section = s;
        this.credits = cred;
        this.type = t;
        this.instructor = ins;
    }
    //methods
    void setName(String get){
    }
    public String getName(){
        return name;
    }
    void setCrn(int parseInt){
    }
    public int getCrn(){
        return crn;
    }
    void setNumber(String get){
    }
    public String getNumber(){
        return number;
    }
    void setSection(int parseInt){
    }
    void setCredits(int parseInt){
    }
    void setType(String get){
    }
    void setInstructor(String get){
    }

    boolean conflictsWith(Course c) {
        System.out.println("TEST");
        return false;
    }

}