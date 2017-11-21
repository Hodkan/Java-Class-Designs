/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise2_3;

import static oracle.jrockit.jfr.events.Bits.doubleValue;

/**
 *
 * Ali Albayrak - P304320 - Practise 2_3
 */
public class Cuboid<T> {
    private T l,h,b;
    public void setL(T length){
        l = length;
    }
    public void setH(T height){
        h = height;
    }
    public void setB(T breadth){
        b = breadth;
    }
    
    public T getL(){
        return l;
    }
    public T getH(){
        return h;
    }
    public T getB(){
        return b;
    }
    
    public double getVolume(){
        double l1 = doubleValue(l);
        double h1 = doubleValue(h);
        double b1 = doubleValue(b);
        return l1*h1*b1;
    }
    
    public String toString(){

        return "Length: "+ l +", Height: "+ h+", Breadth: "+b;
       
        
    } 
}
