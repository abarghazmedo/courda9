
package Inhertence;

public class Salaried_Employer extends Employer{
    
   private double Bonus;
   private double deducation;

    public Salaried_Employer() {
    }

    public Salaried_Employer(double Bonus, double deducation, String firstName, String lastName, String email, String adress, String number, double Salary, String clases) {
        super(firstName, lastName, email, adress, number, Salary, clases);
        this.Bonus = Bonus;
        this.deducation = deducation;
    }
    
    @Override//method abstrac daroru dir get salary
    public double getSalary() {
        return Salary +Bonus-deducation;
    }
    @Override  
    public void printMessage(){
        super.printMessage();
      System.out.println(" Salary Calculer "+getSalary()+" \n Bonus "+Bonus+" \n deducation "+deducation);
  }
    

   
    


   
   
    
}
