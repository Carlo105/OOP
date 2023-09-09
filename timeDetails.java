package TIMECONVERTAPP;

public class timeDetails {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean meridian; //whether am or pm

    //constructor
    public timeDetails(){
    }
    public timeDetails(int hours, int minutes, int seconds, boolean meridian){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.meridian = meridian;
    }

    //setters and getters
    public void setHours(int nhours){
        this.hours = nhours;
    }

    public int getHours(){
        return hours;
    }

    public void setMinutes(int nminutes){
        this.minutes = nminutes;
    }

    public int getMinutes(){
        return minutes;
    }

    public void setSeconds(int nseconds){
        this.seconds = nseconds;
    }

    public int getSeconds(){
        return seconds;
    }

    public void setMeridians(boolean nmeridians){
        this.meridian = nmeridians;
    }

    public boolean getMeridians(){
        return meridian;
    }

    //methods
    public void forwardTime(int seconds){
        this.seconds += seconds;
        if(this.seconds > 59){
            this.minutes += this.seconds / 60;
            this.seconds %= 60;
            if(this.minutes > 59){
                this.hours += this.minutes / 60;
                this.minutes %= 60;
                if(this.hours > 11){
                    this.hours %= 12;
                    this.meridian = !this.meridian;
                }
            }
        }
    }
    public void tickPerSecond(){
        forwardTime(1);
    }
    public void tickPerMinute(){
        forwardTime(60);
    }
    public void tickPerHour(){
        forwardTime(3600);
    }
    public void displayTime12(){
        String meridianString;
        if(meridian == true){
            meridianString = "PM";
        }else{
            meridianString = "AM";
        }
        int showHours;
        if(hours == 0 || hours == 12){
            showHours=12;
        }else{
            showHours = hours % 12;
        }
        System.out.printf("%d : %d : %d  %s/n", showHours, minutes, seconds, meridianString);
    }
    public void displayTime24(){
        System.out.printf("%d : %d : %d /n", hours, minutes, seconds);
    }

    @Override
    public String toString(){
        String meridianTimeString2;
        if(meridian == true){
            meridianTimeString2 = "PM";
        }else{
            meridianTimeString2 = "AM";
        }
        return String.format("%d : %d : %d  %s", hours, minutes, seconds, meridianTimeString2);
    }
}
