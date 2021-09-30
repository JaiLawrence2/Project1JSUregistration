package CS232_Project1;


import java.time.LocalTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jlaw
 */
public class TraditionalCourse extends Course {
    private LocalTime start;
    private LocalTime stop;
    private String days;
    private String room;
    TraditionalCourse(){
        super();
        start = stop = LocalTime.of(00, 00);
        days = room = "";
    }
    public TraditionalCourse(String n, int c, String num, int s, int cred, String t, String ins, LocalTime sta, LocalTime sto, String d, String r) {
        super(n, c, num, s, cred, t, ins);
        this.start = sta;
        this.stop = sto;
        this.days = d;
        this.room = r;
    }
   
    void setStart(LocalTime of) {
    }
    void setStop(LocalTime of) {
    }
    void setDays(String get) {
    }
    void setRoom(String get) {   
    }

}
