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
public class TestMain {
    public static void main(String[] args) {

        EmployeeRoster list = new EmployeeRoster(20);
        boolean isAdded, isDeleted, isUpdated;

        HourlyEmployee emp1 = new HourlyEmployee(1, new myName("Joe", "Rosette", "Hans") , new myDate(23,2,2023), new myDate(3,3,2001), 45.20F, 100.20F);
        isAdded = list.addEmployee(emp1);
        if(isAdded == true){
            printf("Employee Successfully Added\n");
            emp1.displayInfo();
        }else{
            printf("Employee Failed to be Added\n");
        }
        
        HourlyEmployee emp2 = new HourlyEmployee(2, 32.5F, 100.2F);
        emp2.setempName(new myName("Mister" ,"Joe", "Rosette", "Hans"));
        emp2.setempDateHired(new myDate(11,11,2012));
        emp2.setbirthDate(new myDate(2,2,2001));
        isAdded = list.addEmployee(emp2);
        if(isAdded == true){
            printf("Employee Successfully Added\n");
            emp2.displayInfo();
        }else{
            printf("Employee Failed to be Added\n");
        }
        
        HourlyEmployee emp3 = new HourlyEmployee();
        emp3.setempID(3);
        emp3.setempName(new myName("Mr.", "Joe", "Rosette", "Hans", "PhD."));
        emp3.setempDateHired(new myDate(2,2,2002));
        emp3.setbirthDate(new myDate(4,4,1942));
        emp3.settotalHoursWorked(40.00F);
        emp3.setratePerHour(100.2F);
        isAdded = list.addEmployee(emp3);
        if(isAdded == true){
            printf("Employee Successfully Added\n");
            emp3.displayInfo();
        }else{
            printf("Employee Failed to be Added\n");
        }
        
        PieceWorkerEmployee emp4 = new PieceWorkerEmployee();
        emp4.setempID(4);
        emp4.setempName(new myName("Ms.", "Steffany", "Rosette", "Smith", "II."));
        emp4.setempDateHired(new myDate(3,3,2003));
        emp4.setbirthDate(new myDate(5,5,1945));
        emp4.settotalPiecesFinished(100.00F);
        emp4.setratePerPiece(100.2F);
        isAdded = list.addEmployee(emp4);
        if(isAdded == true){
            printf("Employee Successfully Added\n");
            emp4.displayInfo();
        }else{
            printf("Employee Failed to be Added\n");
        }
        
        PieceWorkerEmployee emp5 = new PieceWorkerEmployee (5, 132.5F, 100.2F);
        emp5.setempName(new myName("Ms.", "Steffany", "Rosette", "Smith"));
        emp5.setempDateHired(new myDate(9,9,2009));
        emp5.setbirthDate(new myDate(6,6,1946));
        isAdded = list.addEmployee(emp5);
        if(isAdded == true){
            printf("Employee Successfully Added\n");
            emp5.displayInfo();
        }else{
            printf("Employee Failed to be Added\n");
        }
        
        PieceWorkerEmployee emp6 = new PieceWorkerEmployee (6, new myName("Steffany", "Rosette", "Smith") , new myDate(6,6,2020), new myDate(19,11,2000), 40.00F, 100.2F);
        isAdded = list.addEmployee(emp6);
        if(isAdded == true){
            printf("Employee Successfully Added\n");
            emp6.displayInfo();
        }else{
            printf("Employee Failed to be Added\n");
        }

        ComissionEmployee emp7 = new ComissionEmployee (7, new myName("Ricky", "Bartlett", "Rosette") , new myDate(7,7,2007), new myDate(8,8,1998), 40000.00);
        isAdded = list.addEmployee(emp7);
        if(isAdded == true){
            printf("Employee Successfully Added\n");
            emp7.displayInfo();
        }else{
            printf("Employee Failed to be Added\n");
        }
        
        ComissionEmployee emp8 = new ComissionEmployee (8, 75000.00);
        emp8.setempName(new myName("Sr.", "Ricky", "Bartlett", "Rosette"));
        emp8.setempDateHired(new myDate(10,10,2010));
        emp8.setbirthDate(new myDate(7,7,1947));
        isAdded = list.addEmployee(emp8);
        if(isAdded == true){
            printf("Employee Successfully Added\n");
            emp8.displayInfo();
        }else{
            printf("Employee Failed to be Added\n");
        }
        
        ComissionEmployee emp9 = new ComissionEmployee ();
        emp9.setempID(9);
        emp9.setempName(new myName("Sr.", "Ricky", "Bartlett", "Rosette", "III"));
        emp9.setempDateHired(new myDate(11,11,2011));
        emp9.setbirthDate(new myDate(9,9,1949));
        emp9.settotalSales(150000.00);
        isAdded = list.addEmployee(emp9);
        if(isAdded == true){
            printf("Employee Successfully Added\n");
            emp9.displayInfo();
        }else{
            printf("Employee Failed to be Added\n");
        }

        BasePlusComissionEmployee emp10 = new BasePlusComissionEmployee (5, new myName( "Gertrude", "Bartlett", "Rosette") , new myDate(6,6,2020), new myDate(19,11,2000), 40.5, 100.2);
        isAdded = list.addEmployee(emp10);
        if(isAdded == true){
            printf("Employee Successfully Added\n");
            emp10.displayInfo();
        }else{
            printf("Employee Failed to be Added\n");
        }

        BasePlusComissionEmployee emp11 = new BasePlusComissionEmployee (6, 40.5, 100.2);
        emp11.setempName(new myName("Mam.", "Gertrude", "Bartlett", "Rosette"));
        emp11.setempDateHired(new myDate(10,10,2010));
        emp11.setbirthDate(new myDate(7,7,1947));
        isAdded = list.addEmployee(emp11);
        if(isAdded == true){
            printf("Employee Successfully Added\n");
            emp11.displayInfo();
        }else{
            printf("Employee Failed to be Added\n");
        }
        
        BasePlusComissionEmployee emp12 = new BasePlusComissionEmployee ();
        emp12.setempID(9);
        emp12.setempName(new myName("Mam.", "Gertrude", "Bartlett", "Rosette", "I"));
        emp12.setempDateHired(new myDate(11,11,2011));
        emp12.setbirthDate(new myDate(9,9,1949));
        emp12.settotalSales(150000.00);
        isAdded = list.addEmployee(emp12);
        if(isAdded == true){
            printf("Employee Successfully Added\n");
            emp12.displayInfo();
        }else{
            printf("Employee Failed to be Added\n");
        }
        
        System.out.println("DISPLAY ALL EMPLOYEE\n");
        list.displayAllEmployee();
        System.out.println("Max number of employees = " + list.getMax());
        System.out.println("Current Count of total employees = " + list.getCount() + "\n");

        System.out.println("Hourly Employees: \n");
        list.displayHE();
        System.out.println("Count Hourly Employee = " + list.countHE() + "\n");
        System.out.println("Piece Worker Employees: \n");
        list.displayPWE();
        System.out.println("Count Piece Worker Employee = " + list.countPWE() + "\n");
        System.out.println("Comission Employees: \n");
        list.displayCE();
        System.out.println("Count Commission Employee = " + list.countCE() + "\n");
        System.out.println("Base Plus Comission Employees: \n");
        list.displayBPCE();
        System.out.println("Count Base Plus Commission Employee = " + list.countBPEC() + "\n");

        isDeleted = list.deleteEmployee(3);
        if(isDeleted == true){
            System.out.println("Is deleted = " + isDeleted);
            System.out.println("DISPLAY ALL EMPLOYEE AFTER DELETE Employee ID = 3");
            list.displayAllEmployee();
            System.out.println("Count of total employees after delete Employee = " + list.getCount() + "\n");
        }else{
            System.out.println("There was an error during the deletion process!\n");
        }

        isUpdated = list.updateEmployee(1, new myName("Juan", "Dela", "Cruz"),new myDate(11,3,2003), new myDate(4,10,2001), 10, 100.2);
        System.out.println("Is Updated = " + isUpdated);
        isUpdated = list.updateEmployee(4, new myName("Joshua", "Nico", "Llido"), new myDate(4,3,1999), new myDate(19,3,2003), 800000, 250000);
        System.out.println("Is Updated = " + isUpdated);
        isUpdated = list.updateEmployee(7, new myName("Alfonso Josh", "Inot", "Atienza"), new myDate(19,7,2003), new myDate(3,3,2008), 100, 312);
        System.out.println("Is Updated = " + isUpdated);
        isUpdated = list.updateEmployee(10, new myName("Nigeria", "Nayga", "Kneegur"), new myDate(29,8,2003), new myDate(9,9,2020), 500000);
        System.out.println("Is Updated = " + isUpdated);
        System.out.println("DISPLAY ALL EMPLOYEE AFTER Update Employee IDs : 1, 4, 7, 10");
        list.displayAllEmployee();

        EmployeeRoster findEmpList = list.getEmployee("Joshua");
        System.out.println("\nAll Employees with Twice in there name");
        findEmpList.displayAllEmployee();
        System.out.println("Count of max employees in TwiceEmpList = " + findEmpList.getMax());
        System.out.println("Count of total employees with 'Twice' in there name = " + findEmpList.getCount() + "\n");
    }
}