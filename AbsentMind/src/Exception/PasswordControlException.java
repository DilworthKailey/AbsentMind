/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Josh
 */
public class PasswordControlException extends Exception{

    public PasswordControlException() {
    }

    public PasswordControlException(String message) {
        super(message);
    }

    public PasswordControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordControlException(Throwable cause) {
        super(cause);
    }

    public PasswordControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
