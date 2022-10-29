package com.zipcodewilmington.scientificcalculator;

//Yingjie's features coding from here
    /* create StringBuilder object
     add features to the stringBuilder object, like display,get, clear, and channg
     */

public class Display {
    //A state, representing the value currently displayed on the calculator (default 0) *
        private double value;
    //Get the current number on the display *
        public double getValue() {return value;}
    //Clear the display *
        public void clearDisplay(){value=0;}
    //Change the number on the display *
        public void setValue(double newValue){value=newValue;}

}
