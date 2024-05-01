package Revision;

import java.util.ArrayList;

public class Departement {
    int dno;
    String dname;
    ArrayList<Employer> emplist;

    public Departement() {
    }

    public Departement(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
        emplist =new ArrayList<Employer>();
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
    
    public void add_employer(Employer e){
        emplist.add(e);
    }
     public void remove_employer(int idx){
        emplist.remove(idx);
    }
     public int getemployercount(){
         
         return emplist.size();
     }
     public void print_basic_data(){
         for (int i = 0; i < emplist.size(); i++) {
             System.out.println(emplist.get(i).getSsn()+" "+emplist.get(i).getName());
         }
     }
     public void print_All_etails(){//type casting
          for (int i = 0; i < emplist.size(); i++) {
                                     //kan 
              if (emplist.get(i)instanceof SalariedEmployer)
                  ((SalariedEmployer)emplist.get(i)).Displayalldetaills();//type casting from base clase to sub class
              if (emplist.get(i)instanceof HourlyEmployer)
                  ((HourlyEmployer)emplist.get(i)).Displayalldetaills();//type casting from base clase to sub class
              if (emplist.get(i)instanceof ComissionEmployer)
              ((ComissionEmployer)emplist.get(i)).Displayalldetaills();//type casting from base clase to sub class
          }
         
     }
     
    
    

  
    
    
}
