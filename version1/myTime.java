package employee.version1;

public class myTime {
        private int day;
        private int month;
        private int year;
        String[] monthName = {"January", "February", "March", "May", "June", "July", "August", "September", "October", "November", "Decemeber"};

        //constructor
        public myTime(){
        }
        public myTime(int day, int month, int year){
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
            System.out.printf(" %s %d,%d ", monthName[month-1], day, year);
        }
    
        @Override
        public String toString(){
            return String.format(" %d / %d / %d ", month, day, year);
        }
    }
