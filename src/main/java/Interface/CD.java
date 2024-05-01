/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;


public class CD implements RetailItems{//implements
  double price;
  String title;
  String artist;

    public CD(double price, String title, String artist) {
        this.price = price;
        this.title = title;
        this.artist = artist;
    }

    public CD() {
    }
    public double getitemsprice(){
        //method in class interface
        return price;
    }
   
    
}
