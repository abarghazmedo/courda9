
package Inhertence;

public abstract class Employer extends Person {

 protected double Salary;
 protected String clases;

    public Employer() {
  //why not call this constractors   
        System.out.println(" im drive sub class contractors");
    }

    public Employer(String firstName, String lastName, String email, String adress, String number,double Salary, String clases) {
        super(firstName, lastName, email, adress, number);
        this.Salary = Salary;
        this.clases = clases;
    }

    public abstract double getSalary() ;
    

    public String getClases() {
        return clases;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }
  @Override  
    public void printMessage(){
      System.out.println("All Name "+firstName+" "+lastName+" \n Email "+email+" \n AdreSS in "+adress+" \n Salary in "+Salary+" \n Class in "+clases);
  }
    
//     public static void main(String[] args) {
//        
//        Person st1=new Person();
//        st1.setFirstName("mohamed");
//         System.out.println(st1.getFirstName());
//    }
     
   }
