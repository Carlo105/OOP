package employee.version1;

public class ComissionEmployee {
    private int empID;
    private String empName;
    private myTime empDateHired;
    private myTime birthDate;
    private double totalSales;

    public ComissionEmployee(){
    }

    public ComissionEmployee(int empID, double totalSales){
        this.empID = empID;
        this.totalSales = totalSales;
    }

    public ComissionEmployee(int empID, String empName, myTime empDateHired, myTime birthDate, double totalSales){
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.birthDate = birthDate;
        this.totalSales = totalSales;
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

    public void settotalSales(double totalSales){
        this.totalSales = totalSales;
    }

    public double gettotalSales(){
        return totalSales;
    }

    double computeSalary(double totalSales){
        double comission;
        if(totalSales < 50000){
            comission = totalSales*0.05;
        }else if(totalSales >= 50000 && totalSales < 100000){
            comission = totalSales*0.2;
        }else if(totalSales >= 100000 && totalSales < 500000){
            comission = totalSales*0.3;
        }else{
            comission = totalSales*0.5;
        }
        return comission;
    }

    void displayInfo(){
        System.out.printf("ID:%d Employee Name: %s Date Hired: %s Birth Date: %s Total Pieces Finished: %.2f Salary: %.2f/n", empID, empName, empDateHired.displayDate(), birthDate.displayDate(), totalSales, computeSalary(totalSales));
    }

    @Override
    public String toString(){
        return String.format("ID:%d Employee Name: %s Date Hired: %s Birth Date: %s Total Pieces Finished: %.2f Salary: %.2f/n", empID, empName, empDateHired.displayDate(), birthDate.displayDate(), totalSales, computeSalary(totalSales));
    }
}
