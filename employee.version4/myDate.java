 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version4;

/**
 *
 * @author User
 */
public class myDate {
        private int day;
        private int month;
        private int year;
        String[] monthName = {"January", "February", "March", "May", "June", "July", "August", "September", "October", "November", "Decemeber"};

        //constructor
        public myDate(){
        }
        
        public myDate(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }
    
        //setters and getters
        public void setDay(int day){
            this.day = day;
        }
    
        public int getday(){
            return day;
        }
    
        public void setMonth(int month){
            this.month = month;
        }
    
        public int getMonth(){
            return month;
        }
    
        public void setYear(int year){
            this.year = year;
        }
    
        public int getYear(){
            return year;
        }
    
        public String displayDate(){
            return monthName[month-1] + " " + day + "," + year ;
        }
    
        @Override
        public String toString(){
            return String.format("%s %d, %d ", monthName[month+1], day, year);
        }
    }