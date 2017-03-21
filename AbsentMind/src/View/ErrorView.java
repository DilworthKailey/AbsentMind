/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import absentmind.AbsentMind;
import java.io.PrintWriter;

/**
 *
 * @author Kailey and J.D.
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = AbsentMind.getOutFile();
    private static final PrintWriter logFile = AbsentMind.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "------------------------------------------------------"
                   +"\n- ERROR - "+ errorMessage
                   +"\n----------------------------------------------------");
        //log error
        logFile.println(className + " - " + errorMessage);
    }
    
        
    
}
