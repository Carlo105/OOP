/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version3;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee(){
    }

    public HourlyEmployee(int empID, float totalHoursWorked, float ratePerHour){
        super(empID);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, myName empName, myDate empDateHired, myDate birthDate, float totalHoursWorked, float ratePerHour){
        super(empID, empName, empDateHired, birthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }


    public float gettotalHoursWorked() {
        return totalHoursWorked;
    }

    public void settotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked > 0 || totalHoursWorked <= 168? totalHoursWorked: 0;
    }

    public float getratePerHour() {
        return ratePerHour;
    }

    public void setratePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour > 0 ? ratePerHour: 0;
    }

    public float computeSalary(float totalHoursWorked, float ratePerHour){
        float salary, overtime;
        if(totalHoursWorked > 40){
            overtime = totalHoursWorked-40;
            salary = (float) ((40.00*ratePerHour) + (overtime*ratePerHour*1.500));
        }else{
            salary = (totalHoursWorked*ratePerHour);
        }
        return salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Hourly Employee: \n");
        System.out.println(toString());
        System.out.printf("Salary: %.2f\n", computeSalary(totalHoursWorked, ratePerHour));
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Total hours worked: %.2f\nRate per Hour: %.2f", totalHoursWorked, ratePerHour);
    }
}

