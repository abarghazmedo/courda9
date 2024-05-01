
package Revision;

public class SalariedEmployer extends Employer implements Desplayble{
   double salry,bonus,deduction;

    public double getSalry() {
        return salry;
    }

    public void setSalry(double salry) {
        this.salry = salry;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public SalariedEmployer() {
    }

    public SalariedEmployer(double salry, double bonus, double deduction, String name, String adress, int ssn, Gender sex) {
        super(name, adress, ssn, sex);
        this.salry = salry;
        this.bonus = bonus;
        this.deduction = deduction;
    }
    
   @Override
   public double earning(){
    return (salry+bonus)-deduction;
   }
   
   public void Displayalldetaills(){
       System.out.println(super.toString());
       System.out.println(toString());
       
   }
    public void Displayearnings(){
        System.out.println(earning());
       
   }

    @Override
    public String toString() {
        return "SalariedEmployer{" + "salry=" + salry + ", bonus=" + bonus + ", deduction=" + deduction + '}';
    }
            
    
    
    

    
    
    
}
