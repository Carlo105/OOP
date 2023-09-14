package employee.version1;

public class BasePlusComissionEmployee {
    private int empID;
    private String empName;
    private myTime empDateHired;
    private myTime birthDate;
    private double totalSales;
    private double baseSalary;

    public BasePlusComissionEmployee(){
    }

    public BasePlusComissionEmployee(int empID, double totalSales, double baseSalary){
        this.empID = empID;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }

    public BasePlusComissionEmployee(int empID, String empName, myTime empDateHired, myTime birthDate, double totalSales){
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

    public void setbaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public double getbaseSalary(){
        return baseSalary;
    }

    double computeSalary(double totalPiecesFinished, double baseSalary){
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
        comission += baseSalary;
        return comission;
    }

    void displayInfo(){
        System.out.printf("ID:%d Employee Name: %s Date Hired: %s Birth Date: %s Total Sales Finished: %.2f Base Salary: %.2f Salary: %.2f/n", empID, empName, empDateHired.toString(), birthDate.toString(), totalSales, baseSalary, computeSalary(totalSales, baseSalary));
    }

    @Override
    public String toString(){
        return String.format("ID:%d Employee Name: %s Date Hired: %s Birth Date: %s Total Sales Finished: %.2f Base Salary: %.2f Salary: %.2f/n", empID, empName, empDateHired.toString(), birthDate.toString(), totalSales, baseSalary, computeSalary(totalSales, baseSalary));
    }
}
