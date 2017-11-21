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
public class ExteriorFeature implements Feature{
    String exteriorFeature;
    
    public ExteriorFeature(){
        exteriorFeature = "Generic";
    }
    
    public ExteriorFeature(String exteriorFeature){
        this.exteriorFeature = exteriorFeature;
    }
    
    public String getFeature(){
        return exteriorFeature;
    }
    public void setFeature(String exteriorFeature){
        this.exteriorFeature= exteriorFeature;
    }
    
    @Override
    public String toString(){
        return "Exterior [" + exteriorFeature + "]";
    }
    
    public static void main(String[] args){
        ExteriorFeature first = new ExteriorFeature();
        ExteriorFeature second = new ExteriorFeature("Fog Lamps");
        System.out.println("First:" + "\n" + first.toString());
        System.out.println("Second:" + "\n" + second.toString());
        
    }
    
}
