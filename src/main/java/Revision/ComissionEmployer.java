
package Revision;

public class ComissionEmployer extends Employer implements Desplayble{
    private double gross_sales;
    private double comission_rate;

    public double getGross_sales() {
        return gross_sales;
    }

    public void setGross_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public double getOmission_rate() {
        return comission_rate;
    }

    public void setOmission_rate(double omission_rate) {
        this.comission_rate = omission_rate;
    }

    public ComissionEmployer() {
    }

    public ComissionEmployer(double gross_sales, double omission_rate, String name, String adress, int ssn, Gender sex) {
        super(name, adress, ssn, sex);
        this.gross_sales = gross_sales;
        this.comission_rate = omission_rate;
    }
    
    @Override
    public double earning(){
        return gross_sales*comission_rate;
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
        return "ComissionEmployer{" + "gross_sales=" + gross_sales + ", comission_rate=" + comission_rate + '}';
    }
    
    
    
    
    
    
}
