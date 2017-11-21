/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise2_2;

/**
 *
 * @author aliay
 */
public class Practise2_2 {





    public static void main(String[] args) {
    Animal animal = new Animal();
    animal.makeNoise();
    Dog dog = new Dog();
    dog.makeNoise();
    
    //Upcasting
    Animal animal2 = dog;
    System.out.println("Upcasting:");
    animal2.makeNoise();
    
    //Downcasting
    Animal animal3 = new Dog();
    Dog dog2  = (Dog) animal3;
    System.out.println("Downcasting:");
    dog2.makeNoise();
    
 
    }
    
}
