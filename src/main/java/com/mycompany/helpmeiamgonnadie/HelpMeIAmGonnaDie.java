/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.helpmeiamgonnadie;

import java.util.Scanner;

/**
 *
 * @author ratchaphum
 */
public class HelpMeIAmGonnaDie {

    public static void main(String[] args) {
    ScoreSoure obj = new ScoreSoure();
    Subscriber obj1 = new Subscriber ();
    Subscriber obj2= new Subscriber ();
    obj.addSub(obj1); obj.addSub(obj2);

    Scanner inp = new Scanner (System.in);
    
    
    String scoreLine;
    
    System.out.print("Enter Score ");
    scoreLine = inp.nextLine();
    while (!scoreLine.equals ("")) {
        obj.setScoreLine(scoreLine);
        System.out.print ("Enter Score ");
        scoreLine = inp.nextLine();
    }
}

    
}
    
