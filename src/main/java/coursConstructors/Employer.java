package coursConstructors;



public class Employer {

    //Attribut
    private int empId;
    private String name;
    private String depart;
    private double salary;
    private double bonus;
    private boolean resident;
    private static int totalObejts;//static calculer total all object created
    
    //Constructors
    public Employer() {
        totalObejts ++;
    }

    //Constructors argement/overloading 
    public Employer(int empId, String name) {
        this.empId = empId;
        this.name = name;
        totalObejts ++;
        
    }
    public Employer(double salary,double bonus){
        this.salary=salary;
        this.bonus=bonus;
    }
    public Employer(Employer Copysrc){
        this.salary=Copysrc.salary;
        this.bonus=Copysrc.bonus;
        
        
    }
    //modify methodes by objects
    public void modify(Employer e){
        e.empId=10;
        e.name="mohamed";
    }
    
    //rutrning object from methods
//    public Employer add(Employer emp1, Employer emp2) {
//        Employer result = new Employer();
//        result.salary = emp1.salary + emp2.salary;
//        result.bonus = emp1.bonus + emp2.bonus;
//        return result;
//    }
    
    
    //if you created parametre bzf just creat object in agemnt 
    public Employer add( Employer emp2) {
        Employer result = new Employer();
        result.salary = this.salary + emp2.salary;
        result.bonus = this.bonus + emp2.bonus;
        return result;
    }
    
    

    public Employer(int empId, String name, boolean resident) {
//        this.empId = empId;
//        this.name = name;
//or
        this(empId, name);
        this.resident = resident;
         totalObejts ++;
        
    }

    public Employer(int empId, String name, String depart, double salary, double bonus, boolean resident) {
        this.empId = empId;
        this.name = name;
        this.depart = depart;
        this.salary = salary;
        this.bonus = bonus;
        this.resident = resident;
         totalObejts ++;
         
    }

    public static int getTotalObejts() {//static calculer total all object created
        return totalObejts;
    }
    
    
    

    //Setters
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSalary(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }
    
    

    public String getDepart() {
        return depart;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void PrintEmpData() {
        System.out.println("Id " + empId);
        System.out.println("name " + name);
        System.out.println("Depart " + depart);
        System.out.println("Salary " + salary);
        System.out.println("Bonus " + bonus);
        System.out.println("Resident " + resident);
    }
    

}
