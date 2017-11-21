/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise2_3;

/**
 *
 * Ali Albayrak  - P304320 
 */
public class Map<K,V> {
    private K key;
    private V value;
    
    public String toString(){

        return "Key: " + key + "\nValue: " + value;            
    } 
    
    
    public static void main(String[] args) {
        Map<Integer,String> e1 = new Map();
        Map<Integer,String> e2 = new Map();
        Map<Integer,String> e3 = new Map();
        
        e1.key = 1989;
        e1.value = "GT-R";
        e2.key = 1969;
        e2.value = "Capri";
        e3.key = 1953;
        e3.value = "Corvette C1";
        
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
  
    }
    
}
