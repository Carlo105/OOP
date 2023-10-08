/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version5;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class EmployeeRoster {
    private ArrayList<Employee> empList = new ArrayList<Employee>();

    public EmployeeRoster() {
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }
    
    public void displayAllEmployee(){
        double salary;
        System.out.printf("%-10s\t||\t%-20s\t||\t%-20s\t||\t%s", "ID", "NAME", "TYPE", "SALARY");
        for(Employee employee : empList){
            if(employee instanceof HourlyEmployee){
                salary = employee.computeSalary();
            }else if(employee instanceof PieceWorkerEmployee){
                salary = employee.computeSalary();
            }else if(employee instanceof ComissionEmployee){
                salary = employee.computeSalary();
            }else if(employee instanceof BasePlusComissionEmployee){
                salary = employee.computeSalary();
            }else{
                salary = 0.00;
            }
            System.out.printf("%-10d\t||\t%-20s\t||\t%-20s\t||\t%.2f", employee.getempID(), employee.displayFullName(), employee.getClass().getSimpleName(), salary);
        }
    }
    
    public int countHE(){
        int countHE=0;
        for(Employee employee : empList){
           if(employee instanceof HourlyEmployee){
               countHE++;
           }
        }
        return countHE;
    }
    
    public int countPWE(){
        int countPWE=0;
        for(Employee employee : empList){
           if(employee instanceof PieceWorkerEmployee){
               countPWE++;
           }
        }
        return countPWE;
    }
    
    public int countCE(){
        int countCE=0, i;
        for(Employee employee : empList){
           if(employee instanceof ComissionEmployee){
               countPWE++;
           }
        }
        return countCE;
    }
    
    public int countBCE(){
        int countBCE=0, i;
        for(Employee employee : empList){
           if(employee instanceof BasePlusComissionEmployee){
               countPWE++;
           }
        }
        return countBCE;
    }
    
    public void displayAllHE(){
        for(Employee employee : empList){
            if(employee instanceof HourlyEmployee){
                employee.displayInfo();
            }
        }
    }
    
    public void displayAllPWE(){
        for(Employee employee : empList){
            if(employee instanceof PieceWorkerEmployee){
                employee.displayInfo();
            }
        }
    }
    
    public void displayAllCE(){
        for(Employee employee : empList){
            if(employee instanceof ComissionEmployee){
                employee.displayInfo();
            }
        }
    }
    
    public void displayAllBCE(){
        for(Employee employee : empList){
            if(employee instanceof BasePlusComissionEmployee){
                employee.displayInfo();
            }
        }
    }

    public boolean addEmployee(Employee e){
        return (empList.add(e)) ? true : false;
    }

    public boolean deleteEmployee(int id){
        return empList.removeIf(employee -> employee.getEmpId() == id);
    }

       public EmployeeRoster getEmployee(String word){
        EmployeeRoster list = new EmployeeRoster(this.count);
        word = word.toUpperCase();
        for(Employee employee : empList){
            String longName = employee.getEmpId() + employee.gettitle().toUpperCase + employee.getEmpName().getFirstName().toUpperCase()
                    + employee.getempName().getlastName().toUpperCase()
                    +  employee.getempName().getmiddleName().toUpperCase() + employee.getarticle().toUpperCase();
            if(longName.contains(word)){
                list.addEmployee(employee);
            }
        }
        return list;
    }

    public boolean updateEmployee(int id, myName newName, double totalSales) {
        boolean changes = false;
        for (Employee employee : empList) {
            if (id == employee.getempID()) {
                if(newName != employee.getempName()){
		    employee.getempName().setempName(newName);
		    changes = true;
		}
                if(totalSales != ((CommissionEmployee) employee).gettotalSales()){
                    ((CommissionEmployee)employee).settotalSales(totalSales);
                    changes = true;
                }
                return changes;
            }
        }
        return changes;
    }

    public boolean updateEmployee(int id, myName newName, double rateOrSales, double additionalInfo) {
        boolean changes = false;
        for (Employee employee : empList) {
            if(id == employee.getempID()){
                if(employee.getempName() != newName){
		            empList[i].setempName(newName);
		            changes = true;
		        }
                if (employee instanceof HourlyEmployee) {
                    if(rateOrSales != ((HourlyEmployee) employee).getratePerHour()){
                        ((HourlyEmployee) employee).setratePerHour((float)rateOrSales);
                        changes = true;
                    }
                    if(additionalInfo != ((HourlyEmployee) employee).gettotalHoursWorked()){
                        ((HourlyEmployee) employee).settotalHoursWorked((float)additionalInfo);
                        changes = true;
                    }
                } else if (employee instanceof BasePlusCommissionEmployee) {
                    if(rateOrSales !=  ((BasePlusCommissionEmployee) employee).gettotalSales()){
                        ((BasePlusCommissionEmployee) employee).settotalSales(rateOrSales);
                        changes = true;
                    }
                    if(additionalInfo != ((BasePlusCommissionEmployee) employee).getbaseSalary()){
                        ((BasePlusCommissionEmployee) employee).setbaseSalary(additionalInfo);
                        changes = true;
                    }
                } else if (employee instanceof PieceWorkerEmployee) {
                    if( rateOrSales != ((PieceWorkerEmployee) employee).getratePerPiece()){
                        ((PieceWorkerEmployee) employee).setratePerPiece((float)rateOrSales);
                        changes = true;
                    }
                    if(additionalInfo !=  ((PieceWorkerEmployee) employee).gettotalPiecesFinished()){
                        ((PieceWorkerEmployee) employee).settotalPiecesFinished((int) additionalInfo);
                        changes = true;
                    }
                }
                return changes;
            }
        }
        return changes;
    }
