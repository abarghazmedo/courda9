/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inhertence;

 class Animal{
    public void makeSound(){
        System.out.println("geerite sound");
    }  
   class Dog extends Animal{
       @Override
       public void makeSound(){
           System.out.println("sound of Dog is haw haw !!");
       }
   }
   class Cat extends Animal{
       @Override
       public void makeSound(){
           System.out.println("sound of Cat is Miyaw Miyaw !!");
       }             
   }
  class Lion extends Animal {
      @Override
      public void makeSound(){
          System.out.println("Sound of Lion is Wa3wa3");
      }
  } 
     public static void main(String[] args) {
           Animal genericAnimal = new Animal();
//            Dog myDog = new Dog();
                 
         
     }
   
} 
