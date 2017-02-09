/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Kailey
 */
public class PasswordControl {
    
    public double setPassword(String playerName){
        char first_letter = playerName.charAt(0);
        char second_letter = playerName.charAt(1);
        char third_letter = playerName.charAt(2);
        char fourth_letter = playerName.charAt(3);
        
        double value1;
        double value2;
        double value3;
        double value4;
        double value5;
        
        first_letter = Character.toUpperCase(first_letter);
        second_letter = Character.toUpperCase(second_letter);
        third_letter = Character.toUpperCase(third_letter);
        fourth_letter = Character.toUpperCase(fourth_letter);
        
        if (first_letter == 'A' | first_letter == 'B' | first_letter == 'C' | first_letter == 'D' | first_letter == 'E' | first_letter == 'F'| first_letter == 'G'){
            value1 = 1;
        }
        if (first_letter == 'H' | first_letter == 'I' | first_letter == 'J' | first_letter == 'K' | first_letter == 'L' | first_letter == 'M'){
            value1 = 2;
        }
        if (first_letter == 'N' | first_letter == 'O' | first_letter == 'P' | first_letter == 'Q' | first_letter == 'R' | first_letter == 'S'){
            value1 = 3;
        }
        if (first_letter == 'T' | first_letter == 'U' | first_letter == 'V' | first_letter == 'W' | first_letter == 'X' | first_letter == 'Y'){
            value1 = 4;
        }
        else{
            value1 = 5;
        }
        
        if (second_letter == 'A' | first_letter == 'B' | first_letter == 'C' | first_letter == 'D' | first_letter == 'E' | first_letter == 'F'| first_letter == 'G'){
            value2 = 1;
        }
        if (second_letter == 'H' | first_letter == 'I' | first_letter == 'J' | first_letter == 'K' | first_letter == 'L' | first_letter == 'M'){
            value2 = 2;
        }
        if (second_letter == 'N' | first_letter == 'O' | first_letter == 'P' | first_letter == 'Q' | first_letter == 'R' | first_letter == 'S'){
            value2 = 3;
        }
        if (second_letter == 'T' | first_letter == 'U' | first_letter == 'V' | first_letter == 'W' | first_letter == 'X' | first_letter == 'Y'){
            value2 = 4;
        }
        else{
            value2 = 5;
        }
        
        if (third_letter == 'A' | first_letter == 'B' | first_letter == 'C' | first_letter == 'D' | first_letter == 'E' | first_letter == 'F'| first_letter == 'G'){
            value3 = 1;
        }
        if (third_letter == 'H' | first_letter == 'I' | first_letter == 'J' | first_letter == 'K' | first_letter == 'L' | first_letter == 'M'){
            value3 = 2;
        }
        if (third_letter == 'N' | first_letter == 'O' | first_letter == 'P' | first_letter == 'Q' | first_letter == 'R' | first_letter == 'S'){
            value3 = 3;
        }
        if (third_letter == 'T' | first_letter == 'U' | first_letter == 'V' | first_letter == 'W' | first_letter == 'X' | first_letter == 'Y'){
            value3 = 4;
        }
        else{
            value3 = 5;
        }
        
        if (fourth_letter == 'A' | first_letter == 'B' | first_letter == 'C' | first_letter == 'D' | first_letter == 'E' | first_letter == 'F' | first_letter == 'G'){
            value4 = 1;
        }
        if (fourth_letter == 'H' | first_letter == 'I' | first_letter == 'J' | first_letter == 'K' | first_letter == 'L' | first_letter == 'M'){
            value4 = 2;
        }
        if (fourth_letter == 'N' | first_letter == 'O' | first_letter == 'P' | first_letter == 'Q' | first_letter == 'R' | first_letter == 'S'){
            value4 = 3;
        }
        if (fourth_letter == 'T' | first_letter == 'U' | first_letter == 'V' | first_letter == 'W' | first_letter == 'X' | first_letter == 'Y'){
            value4 = 4;
        }
        else{
            value4 = 5;
        }
        
        value5 = Math.sqrt(Math.pow(value1 + value2, 2) + Math.pow(value3 + value4, 2)) * 10000;
        
        double password = Math.round(value5);
        
        return password;
    }
    
   
    

}
