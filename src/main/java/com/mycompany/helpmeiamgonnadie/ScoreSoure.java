/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helpmeiamgonnadie;

import java.util.ArrayList;

/**
 *
 * @author ratchaphum
 */
public class ScoreSoure {
    
    ArrayList<ScoreListener> Gang;
    
       public ScoreSoure(){
           Gang = new ArrayList<>() ;
           
    
}
       public  void addSub(Subscriber e) {
        Gang.add(e);
    }
    
    
    public void setScoreLine(String value) {
        fireMyEvent(new ScoreEvent (this, value));

    }
    
    public void fireMyEvent(ScoreEvent event){
        for (ScoreListener s : Gang) {
        s.scoreChange(event);
        }
        
    }
}
