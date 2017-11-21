/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practise2;

/**
 *
 * @author P304320
 */
public class InteriorFeature implements Feature {
    String interiorFeature;
    public InteriorFeature(){
        interiorFeature = "Generic";
    }
    
    public InteriorFeature(String interiorFeature){
        this.interiorFeature = interiorFeature;
    }
    
    public String getFeature(){
        return interiorFeature;
    }
    
    public void setFeature(String interiorFeature){
        this.interiorFeature = interiorFeature;
    }
    
    public String toString(){
        return "Interior ["+ interiorFeature + "]";
    }
    
    public static void main(String[] args){
        InteriorFeature first = new InteriorFeature();
        InteriorFeature second = new InteriorFeature("Climate Control");
        System.out.println("First:");
        System.out.println(first.toString());
        System.out.println("Second:");
        System.out.println(second.toString());
        
    }
    
}
