
package EnumeratedTypes;


enum Gender{man,women};
enum Cours{database,java,python,math};
enum Semester{winter,summer,spring,fall};

public class RegistForm {
    String stdname;
    Gender stGender;
    Cours crs;
    Semester sem;

    public RegistForm() {
        stdname="no name";
        stGender=Gender.man;
        crs=Cours.java;
        sem=Semester.summer;
    }
    public static void main(String[] args) {
        Cours c1=Cours.math;
         Cours c2=Cours.database;
         
//        System.out.println(c1.toString());
//        System.out.println(c1.ordinal());
        
        System.out.println(c1.compareTo(c2));//>
        System.out.println(c2.equals(c1));
    }
    
    
}
