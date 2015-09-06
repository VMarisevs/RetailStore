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
public class Person {
    private String ppsNumber;
    private String name;
    private String surname;
    private int gender;
    private String address;
    private int city;
    private Date dateOfBirth;

    //constructor
    Person(){
    ppsNumber = "noPPSNumber";
    name = "NoName";
    surname = "NoSurname";
    gender = 0;
    address = "No Address";
    city = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        try{
           dateOfBirth = sdf.parse("01/01/2000");
        } catch (Exception e){
            //Error parsing date
        }
    }

    //get methods
    public String getPPSNumber(){
        return ppsNumber;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getGender(){
        return gender;
    }

    public String getAddress(){
        return address;
    }

    public int getCity(){
        return city;
    }

    public String getDoB(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dob = "";
        try{
           dob = sdf.format(dateOfBirth);
        } catch (Exception e){
            //Error parsing date
        }
    return dob;
    }

    public String getAge(){
        Calendar now = Calendar.getInstance();
        Calendar dob = Calendar.getInstance();

        dob.setTime(dateOfBirth);

        if (dob.after(now)){
            //Error parsing date
        }
        int age = now.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

        if (now.get(Calendar.DAY_OF_YEAR)<=dob.get(Calendar.DAY_OF_YEAR)){
            age--;
        }
        
        return String.valueOf(age);
    }

    //set methods
    public void setPPSNumbers(String val){
        ppsNumber = val;
    }

    public void setName(String val){
        name = val;
    }

    public void setSurname(String val){
        surname = val;
    }

    public void setGender(int val){
        gender = val;
    }

    public void setAddress(String val){
        address = val;
    }

    public void setCity(int val){
        city = val;
    }

    public void setDoB(String val){
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dateOfBirth = null;
        try{
           dateOfBirth = sdf.parse(val);
        } catch (Exception e){
            //Error parsing date
        }
    }

    public boolean checkDob(String val){
        boolean answer = true;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dateOfBirth = null;
        try{
           dateOfBirth = sdf.parse(val);
           answer = true;
        } catch (Exception e){
            answer = false;
        }
        return answer;
    }
}
