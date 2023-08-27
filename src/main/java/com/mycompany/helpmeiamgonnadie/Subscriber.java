/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helpmeiamgonnadie;

/**
 *
 * @author ratchaphum
 */
public class Subscriber implements ScoreListener{
    
    @Override
    public void scoreChange(ScoreEvent event) {
        System.out.println ("live result:" +
                 event.getSomeData() );
    }


}
