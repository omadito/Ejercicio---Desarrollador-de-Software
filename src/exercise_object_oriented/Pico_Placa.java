/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_object_oriented;

/**
 *
 * @author diego
 */
public class Pico_Placa {
    
    //Declaration of variables
    private String plate_number;
    private String date;
    private int time;

    //Constructors
    public Pico_Placa() {
    }

    public Pico_Placa(String plate_number, String date, int time) {
        this.plate_number = plate_number;
        this.date = date;
        this.time = time;
    }

    //get & set
    public String getPlate_number() {
        return plate_number;
    }

    public void setPlate_number(String plate_number) {
        this.plate_number = plate_number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    //Function where you validate the number of characters entered
    public int checkPlateNumber(String string) {
        int length = 0;
        char[] arrayChar = string.toCharArray();
        length = arrayChar.length;
        return length;
    }

}
