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
public class ComissionEmployee extends Employee{
    private double totalSales;

    public ComissionEmployee(){
    }

    public ComissionEmployee(int empID, double totalSales){
        super(empID);
        this.totalSales = totalSales;
    }

    public ComissionEmployee(int empID, String empName, myDate empDateHired, myDate birthDate, double totalSales){
        super(empID, empName, empDateHired, birthDate);
        this.totalSales = totalSales;
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
    @Override
    public void displayInfo() {
        System.out.println("Hourly Employee: \n");
        System.out.println(toString());
        System.out.printf("Salary: %.2f\n", computeSalary(totalSales));
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Total Sales Completed: %.2f\n", totalSales);
    }
}
