/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helpmeiamgonnadie;

import java.util.EventObject;

/**
 *
 * @author ratchaphum
 */
 

public class ScoreEvent extends EventObject {
    
private String someData = "";

public String getSomeData() {
return someData;
}
public ScoreEvent (Object o , String value) {
super(o);
someData = value;
}
}

