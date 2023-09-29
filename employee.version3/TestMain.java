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
public class TestMain {
    public static void main(String[] args) {
        HourlyEmployee emp1 = new HourlyEmployee(1, new myName("Joe", "Rosette", "Hans") , new myDate(23,2,2023), new myDate(3,3,2001), 45.20F, 100.20F);
        emp1.displayInfo();
        
        HourlyEmployee emp2 = new HourlyEmployee(2, 32.5F, 100.2F);
        emp2.setempName(new myName("Mister" ,"Joe", "Rosette", "Hans"));
        emp2.setempDateHired(new myDate(11,11,2012));
        emp2.setbirthDate(new myDate(2,2,2001));
        emp2.displayInfo();
        
        HourlyEmployee emp3 = new HourlyEmployee();
        emp3.setempID(3);
        emp3.setempName(new myName("Mr.", "Joe", "Rosette", "Hans", "PhD."));
        emp3.setempDateHired(new myDate(2,2,2002));
        emp3.setbirthDate(new myDate(4,4,1942));
        emp3.settotalHoursWorked(40.00F);
        emp3.setratePerHour(100.2F);
        emp3.displayInfo();
        
        PieceWorkerEmployee emp4 = new PieceWorkerEmployee();
        emp4.setempID(4);
        emp4.setempName(new myName("Ms.", "Steffany", "Rosette", "Smith", "II."));
        emp4.setempDateHired(new myDate(3,3,2003));
        emp4.setbirthDate(new myDate(5,5,1945));
        emp4.settotalPiecesFinished(100.00F);
        emp4.setratePerPiece(100.2F);
        emp4.displayInfo();
        
        PieceWorkerEmployee emp5 = new PieceWorkerEmployee (5, 132.5F, 100.2F);
        emp5.setempName(new myName("Ms.", "Steffany", "Rosette", "Smith"));
        emp5.setempDateHired(new myDate(9,9,2009));
        emp5.setbirthDate(new myDate(6,6,1946));
        emp5.displayInfo();
        
        PieceWorkerEmployee emp6 = new PieceWorkerEmployee (6, new myName("Steffany", "Rosette", "Smith") , new myDate(6,6,2020), new myDate(19,11,2000), 40.00F, 100.2F);
        emp6.displayInfo();

        ComissionEmployee emp7 = new ComissionEmployee (7, new myName("Ricky", "Bartlett", "Rosette") , new myDate(7,7,2007), new myDate(8,8,1998), 40000.00);
        emp7.displayInfo();
        
        ComissionEmployee emp8 = new ComissionEmployee (8, 75000.00);
        emp8.setempName(new myName("Sr.", "Ricky", "Bartlett", "Rosette"));
        emp8.setempDateHired(new myDate(10,10,2010));
        emp8.setbirthDate(new myDate(7,7,1947));
        emp8.displayInfo();
        
        ComissionEmployee emp9 = new ComissionEmployee ();
        emp9.setempID(9);
        emp9.setempName(new myName("Sr.", "Ricky", "Bartlett", "Rosette", "III"));
        emp9.setempDateHired(new myDate(11,11,2011));
        emp9.setbirthDate(new myDate(9,9,1949));
        emp9.settotalSales(150000.00);
        emp9.displayInfo();

        BasePlusComissionEmployee emp10 = new BasePlusComissionEmployee (5, new myName( "Gertrude", "Bartlett", "Rosette") , new myDate(6,6,2020), new myDate(19,11,2000), 40.5, 100.2);
        emp10.displayInfo();

        BasePlusComissionEmployee emp11 = new BasePlusComissionEmployee (6, 40.5, 100.2);
        emp11.setempName(new myName("Mam.", "Gertrude", "Bartlett", "Rosette"));
        emp11.setempDateHired(new myDate(10,10,2010));
        emp11.setbirthDate(new myDate(7,7,1947));
        emp11.displayInfo();
        
        BasePlusComissionEmployee emp12 = new BasePlusComissionEmployee ();
        emp12.setempID(9);
        emp12.setempName(new myName("Mam.", "Gertrude", "Bartlett", "Rosette", "I"));
        emp12.setempDateHired(new myDate(11,11,2011));
        emp12.setbirthDate(new myDate(9,9,1949));
        emp12.settotalSales(150000.00);
        emp12.displayInfo();
        
    }
}
