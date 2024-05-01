/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursConstructors;


public class Test {
    public static void main(String[] args) {
        //contrictor
//        Employer emp1=new Employer(1, "Mohamed", "12/03/2024", 9500, 10, true);
//        emp1.PrintEmpData();
//        emp1.setSalary(10000);
//        emp1.PrintEmpData();
//////////////////////////////////////////////////////
//        Employer emp2 = new Employer();
//        Employer emp3 = new Employer();
//        Employer emp4 = new Employer();
//        System.out.println(/*emp3 any obeject*/ Employer.getTotalObejts());
//////////////////////////////////////////////////////////
//passing obeject as argemenet
    //    Employer emp9=new Employer();
    //    Employer myInputObject=new Employer(100, "tarik");
    //    emp9.modify(myInputObject);
    //        System.out.println(myInputObject.getEmpId()); 
    //        System.out.println(myInputObject.getName());
////////////////////////////////////////////////////////////
//  Employer employe1=new Employer( 3500,10000);
//  Employer employe2=new Employer( 2500,10000);
//  Employer rs=new Employer();
//  Employer rs2=rs.add(employe1 , employe2);

// meth 2

        Employer employer1=new Employer(2000, 1000);
        Employer employer2=new Employer(3000, 5000);
        
        //copy object on object
        Employer employer3=new Employer(50, 50);
        Employer emplyer4=new Employer(employer3);
        System.out.println(emplyer4.getSalary());
         System.out.println(emplyer4.getBonus());
        //.
   
        System.out.println(employer1.add(employer2).getSalary());
        System.out.println(employer1.add(employer2).getBonus());
    
    }
    
}
