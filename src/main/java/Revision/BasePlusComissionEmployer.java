
package Revision;


public class BasePlusComissionEmployer extends ComissionEmployer{
    
    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double earning(){
        return base+super.earning();
    }
    
    @Override
      public void Displayalldetaills(){
      super.Displayalldetaills();
      Displayearnings();
     }
    @Override
    public void Displayearnings(){
        System.out.println("Earning"+earning());
    }

}
