/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_object_oriented;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Exercise_object_oriented {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exception control
        try { 
            //Data Instantiation
            Scanner read = new Scanner(System.in);
            Random predict = new Random(); //Function to predict
            int bit = predict.nextInt(2); //Assignment of two numbers
            Pico_Placa picoyplaca = new Pico_Placa(); //Instantiation of class Pico_Placa
            System.out.println("Welcome to System");
            //Data entry            
            //Check if plate number is correct
            do {
                System.out.println("Please, input your plate number. Remember the digits are seven");
                picoyplaca.setPlate_number(read.nextLine());
            } while (picoyplaca.checkPlateNumber(picoyplaca.getPlate_number()) < 7);
            System.out.println("Please, input the date");
            picoyplaca.setDate(read.nextLine());
            System.out.println("Please, input the time");
            picoyplaca.setTime(read.nextInt());
            read.nextLine();
            System.out.println("***************");
            //Validate if the bit variable is zero or one
            if (bit == 1) {
                System.out.println("With the follow information:");
                System.out.println(picoyplaca.getPlate_number());
                System.out.println(picoyplaca.getDate());
                System.out.println(picoyplaca.getTime());
                System.out.println("The car can be on the road.");
            } else {
                System.out.println("With the follow information:");
                System.out.println(picoyplaca.getPlate_number());
                System.out.println(picoyplaca.getDate());
                System.out.println(picoyplaca.getTime());
                System.out.println("The car can't be on the road.");
            }
        } catch (Exception e) {
            System.out.println(e); //Exception message
        }
    }

}
