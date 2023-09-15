package employee.version1;

public class TestMain {
    public static void main(String[] args) {
        HourlyEmployee emp = new HourlyEmployee(1, "Joe" , new myTime(23,2,2023), new myTime(3,3,2001), 45.2, 100.2);
        emp.displayInfo();
        HourlyEmployee emp2 = new HourlyEmployee(2, 32.5, 100.2);
        emp2.displayInfo();
        HourlyEmployee emp3 = new HourlyEmployee();
        
        PieceWorkerEmployee emp4 = new PieceWorkerEmployee();
        emp4.displayInfo();
        PieceWorkerEmployee emp5 = new PieceWorkerEmployee (3, 132.5, 100.2);
        emp5.displayInfo();
        PieceWorkerEmployee emp6 = new PieceWorkerEmployee (4, "Juan" , new myTime(6,6,2020), new myTime(19,11,2000), 40.5, 100.2);
        emp6.displayInfo();

        ComissionEmployee emp7 = new ComissionEmployee (5, "Juan" , new myTime(6,6,2020), new myTime(19,11,2000), 40.5, 100.2);
        ComissionEmployee emp8 = new ComissionEmployee (6, 40.5, 100.2);
        ComissionEmployee emp9 = new ComissionEmployee ();

        BasePlusComissionEmployee emp10 = new BasePlusComissionEmployee (5, "Juan" , new myTime(6,6,2020), new myTime(19,11,2000), 40.5, 100.2);
        BasePlusComissionEmployee emp11 = new BasePlusComissionEmployee (6, 40.5, 100.2);
        BasePlusComissionEmployee emp12 = new BasePlusComissionEmployee ();
    }
}
