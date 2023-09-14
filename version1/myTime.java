package employee.version1;

public class myTime {
        private int day;
        private int month;
        private int year;

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
    
        public void displayDate(){
            System.out.printf(" %d/%d/%d ", month, day, year);
        }
    
        @Override
        public String toString(){
            return String.format(" %d / %d / %d ", month, day, year);
        }
    }
