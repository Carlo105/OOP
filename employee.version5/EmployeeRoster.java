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

    public ArrayList<Employee> getempList() {
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

    public EmployeeRoster getEmployee(String name){
        EmployeeRoster list = new EmployeeRoster();
        name = name.toLowerCase();
        for(Employee employee : empList){
            String fullName = employee.getEmpName().getFirstName().toLowerCase() + " " +
                    employee.getEmpName().getMiddleName().toLowerCase() + " " +
                    employee.getEmpName().getLastName().toLowerCase();

            if (fullName.contains(name)) {
                list.addEmployee(employee);
            }
        }
        return list;
    }


    public boolean updateEmployee(int id, Name newName, myDate bDate, myDate dateHired, double totalSales) {
        for (Employee employee : empList) {
            if (id == employee.getEmpId() && employee instanceof CommissionEmployee) {
                employee.ComissionEmployee(id, newName, bDate, dateHired, totalSales);
                return true;
            }
        }
        return false;
    }

    public boolean updateEmployee(int id, Name newName, myDate bDate, myDate dateHired, double rate, double total) {
        for (Employee employee : empList) {
            if (id == employee.getEmpId()) {
                if(employee instanceof HourlyEmployee){
                    employee.HourlyEmployee(id, newName, bDate, dateHired, totalSales);
                }else if(employee instanceof PieceWorkerEmployee){
                    employee.PieceWorkerEmployee(id, newName, bDate, dateHired, totalSales);
                }else if(employee instanceof BasePlusComissionEmployee){
                    employee.BasePlusComissionEmployee(id, newName, bDate, dateHired, totalSales);
                }
                return true;
            }
        }
        return false;
    }
}
