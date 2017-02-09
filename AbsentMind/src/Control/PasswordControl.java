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
        
        if (first_letter == 65 | first_letter == 66 | first_letter == 67 | first_letter == 68 | first_letter == 69 | first_letter == 70 | first_letter == 71){
            value1 = 1; }
        else if (first_letter == 72 | first_letter == 73 | first_letter == 74 | first_letter == 75 | first_letter == 76 | first_letter == 77 ){
            value1 = 2;
        }
        else if (first_letter == 78 | first_letter == 79 | first_letter == 80 | first_letter == 81 | first_letter == 82 | first_letter == 83 ){
            value1 = 3;
        }
        else if (first_letter == 84 | first_letter == 85 | first_letter == 86 | first_letter == 87 | first_letter == 88 | first_letter == 89){
            value1 = 4;
        }
        else{
            value1 = 5;   
        }    

         if (second_letter == 65 | second_letter == 66 | second_letter == 67 | second_letter == 68 | second_letter == 69 | second_letter == 70 | second_letter == 71){
            value2 = 1;
         }
         else if (second_letter == 72 | second_letter == 73 | second_letter == 74 | second_letter == 75 | second_letter == 76 | second_letter == 77 ){
            value2 = 2;
         }
         else if (second_letter == 78 | second_letter == 79 | second_letter == 80 | second_letter == 81 | second_letter == 82 | second_letter == 83 ){
            value2 = 3;
         }
         else if (second_letter ==  84 | second_letter == 85 | second_letter == 86 | second_letter == 87 | second_letter == 88 | second_letter == 89){
            value2 = 4;
         }
        else{
            value2 = 5;}
        
        if (third_letter == 65 | third_letter == 66 | third_letter == 67 | third_letter == 68 | third_letter == 69 | third_letter == 70 | third_letter == 71){
            value3 = 1;
        }
        else if (third_letter == 72 | third_letter == 73 | third_letter == 74 | third_letter == 75 | third_letter == 76 | third_letter == 77){
            value3 = 2;
        }
        else if (third_letter == 78 | third_letter == 79 | third_letter == 80 | third_letter == 81 | third_letter == 82 | third_letter == 83){
            value3 = 3;
        }
        else if (third_letter == 84 | third_letter == 85 | third_letter == 86 | third_letter == 87 | third_letter == 88 | third_letter == 89){
            value3 = 4;
        }
        else{
            value3 = 5;
        }
        
        if (fourth_letter == 65 | fourth_letter == 66 | fourth_letter == 67 | fourth_letter == 68 | fourth_letter == 69 | fourth_letter == 70 | fourth_letter == 71){
            value4 = 1;
        }
        else if (fourth_letter == 72 | fourth_letter == 73 | fourth_letter == 74 | fourth_letter == 75 | fourth_letter == 76 | fourth_letter == 77){
            value4 = 2;
        }
        else if (fourth_letter == 78 | fourth_letter == 79 | fourth_letter == 80 | fourth_letter == 81 | fourth_letter == 82 | fourth_letter == 83){
            value4 = 3;
        }
        else if (fourth_letter == 84 | fourth_letter == 85 | fourth_letter == 86 | fourth_letter == 87 | fourth_letter == 88 | fourth_letter == 89){
            value4 = 4;
        }
        else{
            value4 = 5;
        }
        
            value5 = Math.sqrt(Math.pow((value1 + value2), 2) + Math.pow((value3 + value4), 2)) * 10000;
        
     
        double password = Math.round(value5);
        
        if (password < 100000){
           password = password + 100000;
        }
        if (password > 999999){
           password = -1;
           System.out.println("Input must be less than 1000000.");
        }
        return password;
    }
    
   
    

}
