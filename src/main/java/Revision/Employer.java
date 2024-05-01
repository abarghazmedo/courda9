
package Revision;

enum Gender{man,woman};
public abstract class Employer {
    String name ;
    String adress ;
    int ssn ;
    Gender sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public Employer() {
    }

    public Employer(String name, String adress, int ssn, Gender sex) {
        this.name = name;
        this.adress = adress;
        this.ssn = ssn;
        this.sex = sex;
    }
    public abstract double earning();

    @Override
    public String toString() {
        return "Employer{" + "name=" + name + ", adress=" + adress + ", ssn=" + ssn + ", sex=" + sex + '}';
    }  
    
}
