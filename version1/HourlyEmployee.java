package employee.version1;

public class HourlyEmployee{
    private int empID;
    private String empName;
    private myTime empDateHired;
    private myTime birthDate;
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee(){
    }

    public HourlyEmployee(int empID, float totalHoursWorked, float ratePerHour){
        this.empID = empID;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, String empName, myTime empDateHired, myTime birthDate, float totalHoursWorked, float ratePerHour){
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.birthDate = birthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public void setempID(int empID){
            this.empID = empID;
        }

    public int getempID(){
            return empID;
        }

    public void setempName(String empName){
            this.empName = empName;
        }

    public String getempName(){
            return empName;
        }

    public void setempDateHired(myTime empDateHired){
            this.empDateHired = empDateHired;
        }

    public myTime getempDateHired(){
            return empDateHired;
        }

    public void setbirthDate(myTime birthDate){
            this.birthDate = birthDate;
        }

    public myTime getbirthDate(){
            return birthDate;
        }

    public void settotalHoursWorked(float totalHoursWorked){
            this.totalHoursWorked = totalHoursWorked;
        }

    public float gettotalHoursWorked(){
            return totalHoursWorked;
        }

    public void setratePerHour(float ratePerHour){
            this.ratePerHour = ratePerHour;
        }

    public float getratePerHour(){
            return ratePerHour;
        }

    double computeSalary(float totalHoursWorked, float ratePerHour){
        double salary, overtime;
        if(totalHoursWorked > 40){
            overtime = totalHoursWorked-40;
            salary = (40*ratePerHour) + (overtime*ratePerHour*1.5);
        }else{
            salary = (totalHoursWorked*ratePerHour);
        }
        return salary;
    }

    void displayInfo(){
        System.out.printf("ID:%d Employee Name: %s Date Hired: %s Birth Date: %s Total Hours Worked: %.2f  Rate Per Hour: %.2f  Salary: %.2f/n", empID, empName, empDateHired.displayDate(), birthDate.displayDate(), totalHoursWorked, ratePerHour, computeSalary(totalHoursWorked, ratePerHour));
    }

    @Override
    public String toString(){
        return String.format("ID:%d Employee Name: %s Date Hired: %s Birth Date: %s Total Hours Worked: %.2f  Rate Per Hour: %.2f  Salary: %.2f/n", empID, empName, empDateHired.displayDate(), birthDate.displayDate(), totalHoursWorked, ratePerHour, computeSalary(totalHoursWorked, ratePerHour));
    }
}
