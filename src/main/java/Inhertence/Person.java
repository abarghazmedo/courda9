
package Inhertence;

public class Person {
    
   protected String firstName;
   protected String lastName;
   protected String email;
   protected String adress;
   protected String number;
    
    
    public Person() {
        System.out.println("im base class constractors");
        }
    
    public Person(String firstName, String lastName, String email, String adress, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.adress = adress;
        this.number = number;
    }

  
    public String getFirstName() {
        return firstName;
    }

    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   
    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getAdress() {
        return adress;
    }

    
    public void setAdress(String adress) {
        this.adress = adress;
    }

   
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

  public void printMessage(){
      System.out.println("All Name "+firstName+" "+lastName+" \n Email "+email+" \n AdreSS in "+adress);
  }
    

 
    

    
    
    
    
}
