package employee.version1;

public class TestMain {
    public static void main(String[] args) {
        HourlyEmployee emp = new HourlyEmployee(1, "Joe" , new myTime(23,2,2023), new myTime(3,3,2001), 45.2, 100.2);
        emp.displayInfo();
        
        HourlyEmployee emp2 = new HourlyEmployee(2, 32.5, 100.2);
        emp2.setempName("Scaler");
        emp2.setempDateHired(new myTime(12,12,2012));
        emp2.setbirthDate(new myTime(1,1,2001));
        emp2.displayInfo();
        
        HourlyEmployee emp3 = new HourlyEmployee();
        emp3.setempID(3);
        emp3.setempName("Bob");
        emp3.setempDateHired(new myTime(2,2,2002));
        emp3.setbirthDate(new myTime(4,4,1942));
        emp3.settotalHoursWorked(40.00);
        emp3.setratePerHour(100.2);
        emp3.displayInfo();
        
        PieceWorkerEmployee emp4 = new PieceWorkerEmployee();
        emp4.setempID(4);
        emp4.setempName("Steve");
        emp4.setempDateHired(new myTime(3,3,2003));
        emp4.setbirthDate(new myTime(5,5,1945));
        emp4.settotalPiecesFinished(100.00);
        emp4.setratePerPiece(100.2);
        emp4.displayInfo();
        
        PieceWorkerEmployee emp5 = new PieceWorkerEmployee (5, 132.5, 100.2);
        emp5.setempName("Juan");
        emp5.setempDateHired(new myTime(9,9,2009));
        emp5.setbirthDate(new myTime(6,6,1946));
        emp5.displayInfo();
        
        PieceWorkerEmployee emp6 = new PieceWorkerEmployee (6, "Mello" , new myTime(6,6,2020), new myTime(19,11,2000), 40.00, 100.2);
        emp6.displayInfo();

        ComissionEmployee emp7 = new ComissionEmployee (7, "Keong" , new myTime(7,7,2007), new myTime(8,8,1998), 40000.00);
        emp7.displayInfo();
        
        ComissionEmployee emp8 = new ComissionEmployee (8, 75000.00);
        emp8.setempName("Sui");
        emp8.setempDateHired(new myTime(10,10,2010));
        emp8.setbirthDate(new myTime(7,7,1947));
        emp8.displayInfo();
        
        ComissionEmployee emp9 = new ComissionEmployee ();
        emp9.setempID(9);
        emp9.setempName("Bobby");
        emp9.setempDateHired(new myTime(11,11,2011));
        emp9.setbirthDate(new myTime(9,9,1949));
        emp9.settotalSales(150000.00);
        emp9.displayInfo();

        BasePlusComissionEmployee emp10 = new BasePlusComissionEmployee (5, "Juan" , new myTime(6,6,2020), new myTime(19,11,2000), 40.5, 100.2);
        
        BasePlusComissionEmployee emp11 = new BasePlusComissionEmployee (6, 40.5, 100.2);
        emp8.setempName("Sui");
        emp8.setempDateHired(new myTime(10,10,2010));
        emp8.setbirthDate(new myTime(7,7,1947));
        emp8.displayInfo();
        
        BasePlusComissionEmployee emp12 = new BasePlusComissionEmployee ();
        emp9.setempID(9);
        emp9.setempName("Bobby");
        emp9.setempDateHired(new myTime(11,11,2011));
        emp9.setbirthDate(new myTime(9,9,1949));
        emp9.settotalSales(150000.00);
        emp9.displayInfo();
        
    }
}
