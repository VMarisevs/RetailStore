/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

/**
 *
 * @author Evilguy
 */

public class Cashier extends Person {
        private double hoursPerWeek;
        private double standardFeePerHour;
        

        Cashier(){
            hoursPerWeek = 0;
            standardFeePerHour = 0;
        }

        //get methods
        public double getHoursPerWeek(){
            return hoursPerWeek;
        }

        public double getStandardFeePerHour(){
            return standardFeePerHour;
        }

        public double getOvertimeHours(){
            double overtimeHours;
            if (getHoursPerWeek()>40){
            overtimeHours = getHoursPerWeek() - 40;
            } else {
            overtimeHours = 0;
            }
            return overtimeHours;
        }

        public double getOvertimeFeePerHour(){
            double overtimeFeePerHour = getStandardFeePerHour() * 1.5;
            return overtimeFeePerHour;
        }

        public double getSalaryPerWeek(){
            double salaryPerWeek = 0;

                if (getHoursPerWeek()>40){
                    salaryPerWeek = 40 * getStandardFeePerHour() + getOvertimeHours() * getOvertimeFeePerHour();
                } else {
                    salaryPerWeek = getHoursPerWeek() * getStandardFeePerHour();
                }

            return salaryPerWeek;
         }


        //set methods

        public void setHoursPerWeek(String val){
            hoursPerWeek = Double.parseDouble(val);
        }

        public void setStandardFeePerHour(String val){
            standardFeePerHour = Double.parseDouble(val);
        }
}
