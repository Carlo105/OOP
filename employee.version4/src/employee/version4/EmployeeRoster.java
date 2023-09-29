/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version4;

/**
 *
 * @author User
 */
public class EmployeeRoster {
    private Employee empList[];
    private int count = 0;
    private int max;

    public EmployeeRoster() {
    }

    public EmployeeRoster(Employee[] empList) {
        this.empList = empList;
    }

    public EmployeeRoster(Employee[] empList, int max) {
        this.empList = empList;
        this.max = max;
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    public void displayAllEmployee(){
        int i;
        System.out.printf("ID\t||\tEmployee Name\t||\tType\t||\tSalary");
        for(i=0; i<count; i++){
            System.out.printf("%d\t||\t%s\t||\t%s\t||\t%.2f", empList[i].getempID(), empList[i].getempName(), empList[i].getempType(), empList[i].displaySalary());
        }
    }
    
    public int countHE(){
        int countHE=0, i;
        for(i=0; i<count; i++){
           if(empList[i].type == 1){
               countHE++;
           }
        }
        return countHE;
    }
    
    public int countPWE(){
        int countPWE=0, i;
        for(i=0; i<count; i++){
           if(empList[i].type == 2){
               countPWE++;
           }
        }
        return countPWE;
    }
    
    public int countCE(){
        int countCE=0, i;
        for(i=0; i<count; i++){
           if(empList[i].type == 3){
               countCE++;
           }
        }
        return countCE;
    }
    
    public int countBCE(){
        int countBCE=0, i;
        for(i=0; i<count; i++){
           if(empList[i].type == 4){
               countBCE++;
           }
        }
        return countBCE;
    }
    
    public void displayAllHE(){
        int i;
        for(i=0; i<count; i++){
            if(empList[i].type == 1){
            System.out.printf("%d\t||\t%s\t||\t%s\t||\t%.2f", empList[i].getempID(), empList[i].getempName(), empList[i].getempType(), empList[i].displaySalary());
            }
        }
    }
    
    public void displayAllPWE(){
        int i;
        for(i=0; i<count; i++){
            if(empList[i].type == 2){
            System.out.printf("%d\t||\t%s\t||\t%s\t||\t%.2f", empList[i].getempID(), empList[i].getempName(), empList[i].getempType(), empList[i].displaySalary());
            }
        }
    }
    
    public void displayAllCE(){
        int i;
        for(i=0; i<count; i++){
            if(empList[i].type == 3){
            System.out.printf("%d\t||\t%s\t||\t%s\t||\t%.2f", empList[i].getempID(), empList[i].getempName(), empList[i].getempType(), empList[i].displaySalary());
            }
        }
    }
    
    public void displayAllBCE(){
        int i;
        for(i=0; i<count; i++){
            if(empList[i].type == 4){
            System.out.printf("%d\t||\t%s\t||\t%s\t||\t%.2f", empList[i].getempID(), empList[i].getempName(), empList[i].getempType(), empList[i].displaySalary());
            }
        }
    }
}
