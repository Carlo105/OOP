/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version4;

import java.util.Objects;

import employee.version4.BasePlusComissionEmployee;
import employee.version4.ComissionEmployee;
import employee.version4.Employee;
import employee.version4.HourlyEmployee;
import employee.version4.PieceWorkerEmployee;

/**
 *
 * @author User
 */
public class EmployeeRoster {
    private Employee empList[];
    private int count = 0;
    private int max;

    public EmployeeRoster() {
        this.max = 10;
        empList = new Employee[10];
    }

    public EmployeeRoster(int max) {
        this.max = max;
        empList = new Employee[max];
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public int getMax() {
        return max;
    }

    public int getCount(){
        return count;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    public void displayAllEmployee(){
        double salary;
        System.out.printf("%-10s\t||\t%-20s\t||\t%-20s\t||\t%s", "ID", "NAME", "TYPE", "SALARY");
        for(int i=0; i<this.count; i++){
            if(empList[i] instanceof HourlyEmployee){
                salary = ((HourlyEmployee)empList[i]).computeSalary();
            }else if(empList[i] instanceof PieceWorkerEmployee){
                salary = ((PieceWorkerEmployee)empList[i]).computeSalary();
            }else if(empList[i] instanceof ComissionEmployee){
                salary = ((ComissionEmployee)empList[i]).computeSalary();
            }else if(empList[i] instanceof BasePlusComissionEmployee){
                salary = ((BasePlusComissionEmployee)empList[i]).computeSalary();
            }else{
                salary = 0.00;
            }
            System.out.printf("%-10d\t||\t%-20s\t||\t%-20s\t||\t%.2f", empList[i].getempID(), empList[i].displayFullName(), empList[i].getClass().getSimpleName(), salary);
        }
    }
    
    public int countHE(){
        int countHE=0, i;
        for(i=0; i<this.count; i++){
           if(empList[i] instanceof HourlyEmployee){
               countHE++;
           }
        }
        return countHE;
    }
    
    public int countPWE(){
        int countPWE=0, i;
        for(i=0; i<this.count; i++){
           if(empList[i] instanceof PieceWorkerEmployee){
               countPWE++;
           }
        }
        return countPWE;
    }
    
    public int countCE(){
        int countCE=0, i;
        for(i=0; i<this.count; i++){
           if(empList[i] instanceof ComissionEmployee){
               countCE++;
           }
        }
        return countCE;
    }
    
    public int countBCE(){
        int countBCE=0, i;
        for(i=0; i<this.count; i++){
           if(empList[i] instanceof BasePlusComissionEmployee){
               countBCE++;
           }
        }
        return countBCE;
    }
    
    public void displayAllHE(){
        for(int i=0; i<this.count; i++){
            if(empList[i] instanceof HourlyEmployee){
                empList[i].displayInfo();
            }
        }
    }
    
    public void displayAllPWE(){
        for(int i=0; i<this.count; i++){
            if(empList[i] instanceof PieceWorkerEmployee){
                empList[i].displayInfo();
            }
        }
    }
    
    public void displayAllCE(){
        for(int i=0; i<this.count; i++){
            if(empList[i] instanceof ComissionEmployee){
                empList[i].displayInfo();
            }
        }
    }
    
    public void displayAllBCE(){
        for(int i=0; i<this.count; i++){
            if(empList[i] instanceof BasePlusComissionEmployee){
                empList[i].displayInfo();
            }
        }
    }

    public boolean addEmployee(Employee e){
        if(count >= max){
            return false;
        }else{
            empList[count] = e;
            count++;
            return true;
        }
    }

    public boolean deleteEmployee(int id){
        for(int i = 0; i <= count; i++){
            if(id == empList[i].getEmpId()){
                for(int j = i; j <= count - 1; j++){
                    empList[j] = empList[j+1];
                }
                empList[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public EmployeeRoster getEmployee(String word){
        EmployeeRoster list = new EmployeeRoster(this.count);
        word = word.toUpperCase();
        for(int i = 0; i < this.count; i++){
            String longName = empList[i].getempID() + empList[i].gettitle().toUpperCase + empList[i].getempName().getfirstName().toUpperCase()
                    + empList[i].getempName().getlastName().toUpperCase()
                    +  empList[i].getempName().getmiddleName().toUpperCase() + empList[i].getarticle().toUpperCase();
            if(longName.contains(word)){
                list.addEmployee(empList[i]);
            }
        }
        return list;
    }

    public boolean updateEmployee(int id, myName newName, double totalSales) {
        boolean changes = false;
        for (int i = 0; i < this.count; i++) {
            if (id == empList[i].getempID()) {
                if(newName != empList[i].getname()){
		    ((ComissionEmployee) empList[i]).setempName(newName);
		    changes = true;
		}
                if(totalSales != ((CommissionEmployee) empList[i]).gettotalSales()){
                    ((CommissionEmployee) empList[i]).settotalSales(totalSales);
                    changes = true;
                }
                return changes;
            }
        }
        return changes;
    }

    public boolean updateEmployee(int id, myName newName, double rateOrSales, double additionalInfo) {
        boolean changes = false;
        for (int i = 0; i < this.count; i++) {
            if(id == empList[i].getempID()){
                if(empList[i].getempName() != newName){
		            empList[i].setempName(newName);
		            changes = true;
		        }
                if (empList[i] instanceof HourlyEmployee) {
                    if(rateOrSales != ((HourlyEmployee) empList[i]).getratePerHour()){
                        ((HourlyEmployee) empList[i]).setratePerHour((float)rateOrSales);
                        changes = true;
                    }
                    if(additionalInfo != ((HourlyEmployee) empList[i]).gettotalHoursWorked()){
                        ((HourlyEmployee) empList[i]).settotalHoursWorked((float)additionalInfo);
                        changes = true;
                    }
                } else if (empList[i] instanceof BasePlusCommissionEmployee) {
                    if(rateOrSales !=  ((BasePlusCommissionEmployee) empList[i]).gettotalSales()){
                        ((BasePlusCommissionEmployee) empList[i]).settotalSales(rateOrSales);
                        changes = true;
                    }
                    if(additionalInfo != ((BasePlusCommissionEmployee) empList[i]).getbaseSalary()){
                        ((BasePlusCommissionEmployee) empList[i]).setbaseSalary(additionalInfo);
                        changes = true;
                    }
                } else if (empList[i] instanceof PieceWorkerEmployee) {
                    if( rateOrSales != ((PieceWorkerEmployee) empList[i]).getratePerPiece()){
                        ((PieceWorkerEmployee) empList[i]).setratePerPiece((float)rateOrSales);
                        changes = true;
                    }
                    if(additionalInfo !=  ((PieceWorkerEmployee) empList[i]).gettotalPiecesFinished()){
                        ((PieceWorkerEmployee) empList[i]).settotalPiecesFinished((int) additionalInfo);
                        changes = true;
                    }
                }
                return changes;
            }
        }
        return changes;
    }

