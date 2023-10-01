/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version5;

/**
 *
 * @author User
 */
public class BasePlusComissionEmployee extends ComissionEmployee{
    private double baseSalary;

    public BasePlusComissionEmployee(){
    }

    public BasePlusComissionEmployee(int empID, double totalSales, double baseSalary){
        super(empID, totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusComissionEmployee(int empID, myName empName, myDate empDateHired, myDate birthDate, double totalSales, double baseSalary){
        super(empID, empName, empDateHired, birthDate, totalSales);
    }

    public void setbaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public double getbaseSalary(){
        return baseSalary;
    }

    public double computeSalary(double totalSales, double baseSalary){
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
    @Override
    public void displayInfo() {
        System.out.println("Hourly Employee: \n");
        System.out.println(toString());
        System.out.printf("Salary: %.2f\n", computeSalary(gettotalSales(), baseSalary));
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Total Sales Completed: %.2f\nBase Salary: %.2f", gettotalSales(), baseSalary);
    }
}