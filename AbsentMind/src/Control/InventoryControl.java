/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Clue;
import Model.NpcClue;
import java.util.ArrayList;

/**
 *
 * @author Kailey
 */
public class InventoryControl {
    

 
    public static void doNpcSort(ArrayList<NpcClue> arr){
         
        for (int i = 0; i < arr.size() - 1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < arr.size(); j++)
               {
                if(arr.get(j).getDescription().compareToIgnoreCase(arr.get(minIndex).getDescription()) < 0)
                {
                    minIndex = j;
                }
            }
           
            
            NpcClue temp = arr.get(i);
            arr.set( i, arr.get(minIndex) );
            arr.set( minIndex, temp );
        }
    }
     
//    private void printNpcClues(ArrayList<NpcClue> arr)
//    {
//        for (int i=0; i<arr.size(); i++)
//            System.out.println( arr.get(i) );
//        System.out.println();
//    }
    
//    BEGIN
//countClueList(ArrayList<Clue> arr){
//	count = 0;
//	for (i = 0; i < arr.size() – 1; i++) {
//	count =+ 1;
//	}
// return count;
//}
//END
    public static int countClueList(ArrayList<Clue> arr){
        int count = 0;
        for (int i = 0; i < arr.size() - 1; i++){
            count += 1;
        }
        if(count < 0){
            return -1;
        }
        return count;
    }

    
}
