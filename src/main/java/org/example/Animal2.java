package org.example;

public abstract class Animal2{
   abstract void  makeVoice();

}
 class Cat2 extends Animal2{
    void makeVoice(){
        System.out.println("cat");
    }
     void jumpcat(){
         System.out.println("cat");
     }

}
class Dog2 extends Animal2{
    void makeVoice(){
        System.out.println("Dog");
    }
    void sidDog(){
        System.out.println("dog");
    }
}
class Main2{
    public static void main(String[] args) {
    Animal2 animal2 = new Cat2();
    animal2.makeVoice();
    }
    public static void run(Animal2 animal2){
      Cat2 cat2 = (Cat2) animal2 ;
            cat2.jumpcat();
        }
    }
