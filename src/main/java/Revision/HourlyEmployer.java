/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision;


public class HourlyEmployer extends Employer implements Desplayble{
   private double hour_rate;
   private double no_of_hours;

    public double getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    public double getNo_of_hours() {
        return no_of_hours;
    }

    public void setNo_of_hours(double no_of_hours) {
        this.no_of_hours = no_of_hours;
    }

    public HourlyEmployer() {
    }

    public HourlyEmployer(double hour_rate, double no_of_hours, String name, String adress, int ssn, Gender sex) {
        super(name, adress, ssn, sex);
        this.hour_rate = hour_rate;
        this.no_of_hours = no_of_hours;
    }
   
   @Override
   public double earning(){
       return hour_rate*no_of_hours ;
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
        return "HourlyEmployer{" + "hour_rate=" + hour_rate + ", no_of_hours=" + no_of_hours + '}';
    }
    
   
}
