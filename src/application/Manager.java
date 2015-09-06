/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 *
 * @author Evilguy
 */
public class Manager extends Person {
    private Date dateOfHire;
    private double standardSalary;
    private double extraPerYear;

    Manager(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        try{
           dateOfHire = sdf.parse("01/01/2000");
        } catch (Exception e){
            //Error parsing date
        }

        standardSalary = 30000;
        extraPerYear = 2000;
    }

    //get methods

    public String getDateOfHire(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String doh = "";
        try{
           doh = sdf.format(dateOfHire);
        } catch (Exception e){
            //Error parsing date
        }
        return doh;
    }

    public int getYearsOfExperience(){
   
        Calendar now = Calendar.getInstance();
        Calendar doh = Calendar.getInstance();

        doh.setTime(dateOfHire);

        if (doh.after(now)){
            //Error parsing date
        }
        int years = now.get(Calendar.YEAR) - doh.get(Calendar.YEAR);

        if (now.get(Calendar.DAY_OF_YEAR)<=doh.get(Calendar.DAY_OF_YEAR)){
            years--;
        }

    return years;
    }

    public double getStandardSalary(){
        return standardSalary;
    }

    public double getExtraPerYear(){
        return extraPerYear;
    }

    public double getSalaryPerYear(){
        double salaryPerYear = getStandardSalary() + getExtraPerYear() * getYearsOfExperience();
        return salaryPerYear;

    }

    public double getSalaryPerWeek(){
        //per week
        double salaryPerWeek = getSalaryPerYear()/(365/7);
        return salaryPerWeek;
    }

    //set methods

    public void setDateOfHire(String val){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dateOfHire = null;
        try{
           dateOfHire = sdf.parse(val);
        } catch (Exception e){
            //Error parsing date
        }
    }

    public void setStandardSalary(String val){
        standardSalary = Double.parseDouble(val);
    }

    public void setExtraPerYear(String val){
        extraPerYear = Double.parseDouble(val);

    }

}
