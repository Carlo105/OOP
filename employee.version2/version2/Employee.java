/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version2;

/**
 *
 * @author User
 */
public class Employee {
    private int empID;
    private String empName;
    private myDate empDateHired;
    private myDate birthDate;

    public Employee() {
    }
    
    public Employee(int empID) {
        this.empID = empID;
    }
    
    public Employee(int empID, String empName, myDate empDateHired, myDate birthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.birthDate = birthDate;
    }

    public int getempID() {
        return empID;
    }

    public void setempID(int empID) {
        this.empID = empID;
    }

    public String getempName() {
        return empName;
    }

    public void setempName(String empName) {
        this.empName = empName;
    }

    public myDate getempDateHired() {
        return empDateHired;
    }

    public void setempDateHired(myDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public myDate getbirthDate() {
        return birthDate;
    }

    public void setbirthDate(myDate birthDate) {
        this.birthDate = birthDate;
    }  
    
    public void displayInfo(){
         System.out.println(toString());
    }
    
    @Override
    public String toString(){
        return "Employee Details: \n" + "ID: " + empID + "\nName: " + empName + "\nDate Hired: " + empDateHired.toString() + "\nBirthDate: " + birthDate.toString();
    }
}
