/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Kailey
 */
public class StartProgramView {
    
        private String promptMessage;
    
        public StartProgramView() {
            
            this.promptMessage = "\nPlease enter your name: ";
            // display the banner when view is created
            this.displayBanner();
            
        }

    private void displayBanner() {
      
        System.out.println(
                "\n********************************************"
               +"\n*                                          *"
               +"\n*Welcome to Absent Mind                    *"
               +"\n*You have awoken on the subway with no     *"
               +"\n*memory of who you are or what is going on *"
               +"\n*except your name. It's up to you and your *"
               +"\n*choices to sovle the mystery and discover *"
               +"\n*your identity.                            *"
               +"\n*                                          *"
               +"\n*You will need to examine your             *"
               +"\n*surroungings, find clues, talk to people, *"
               +"\n*and choose your next destination on the   *"
               +"\n*path to solving the mystery. Your         *"
               +"\n*decisions create the adventure.           *"
               +"\n*                                          *"
               +"\n*Good luck and have fun!                   *"
        );
        
    }
    
}
