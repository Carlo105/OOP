package employee.version1;

public class TestMain {
    public static void main(String[] args) {
        HourlyEmployee emp = new HourlyEmployee(1, "Joe" , new myTime(23,2,2023), new myTime(3,3,2001), 45.2, 100.2);
        emp.displayInfo();
        HourlyEmployee emp2 = new HourlyEmployee(2, "Bob" , new myTime(22,5,2018), new myTime(1,1,1991), 32.5, 100.2);
        emp2.displayInfo();

        PieceWorkerEmployee emp3 = new PieceWorkerEmployee (3, "James" , new myTime(2,4,2018), new myTime(3,11,2000), 132.5, 100.2);
        emp3.displayInfo();
        PieceWorkerEmployee emp4 = new PieceWorkerEmployee (4, "Juan" , new myTime(6,6,2020), new myTime(19,11,2000), 40.5, 100.2);
        emp4.displayInfo();

        ComissionEmployee emp5 = new ComissionEmployee (4, "Juan" , new myTime(6,6,2020), new myTime(19,11,2000), 40.5, 100.2);
    }
}
