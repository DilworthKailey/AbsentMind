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
        
        switch (first_letter) {
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                value1 = 1;
                break;
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                value1 = 2;
                break;
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
                value1 = 3;
                break;
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
                value1 = 4;
                break;
            default:
                value1 = 5;
                break;
        }

        switch (second_letter) {
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                value2 = 1;
                break;
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                value2 = 2;
                break;
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
                value2 = 3;
                break;
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
                value2 = 4;
                break;
            default:
                value2 = 5;
                break;
        }
        
        switch (third_letter) {
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                value3 = 1;
                break;
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                value3 = 2;
                break;
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
                value3 = 3;
                break;
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
                value3 = 4;
                break;
            default:
                value3 = 5;
                break;
        }
        
        switch (fourth_letter) {
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                value4 = 1;
                break;
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                value4 = 2;
                break;
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
                value4 = 3;
                break;
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
                value4 = 4;
                break;
            default:
                value4 = 5;
                break;
        }
        
            value5 = Math.sqrt(Math.pow((value1 + value2), 2) + Math.pow((value3 + value4), 2)) * 10000;
        
     
        double password = Math.round(value5);
        
        if (password < 100000){
           password = password + 100000;
        }
        if (password > 999999){
           password = -1; 
        }
        
        return password;
    }
    
   
    

}
