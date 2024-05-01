
package Revision;


public class Revision {
    public static void main(String[] args) {
        Departement d1=new Departement(1, "Information system");
        
        
        SalariedEmployer se=new SalariedEmployer(3000, 600, 200, "mohamed", "berrchid", 1030, Gender.man);
        
        d1.add_employer(se);
        
        HourlyEmployer he=new HourlyEmployer(100, 6, "tarik", "casablnca", 1200, Gender.man);
        
        d1.add_employer(he);
        
        ComissionEmployer ce=new ComissionEmployer(15000, 0.5, "aicha", "rabat", 3200, Gender.woman);
        
        d1.add_employer(ce);
        
        System.out.println(d1.getemployercount());
        
        d1.print_basic_data();
        
        d1.print_All_etails();
                
        
    }
    
}
