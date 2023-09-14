package employee.version1;

public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private myTime empDateHired;
    private myTime birthDate;
    private double totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee(){
    }

    public PieceWorkerEmployee(int empID, int totalPiecesFinished, int ratePerPiece){
        this.empID = empID;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName, myTime empDateHired, myTime birthDate, int totalPiecesFinished, float ratePerPiece){
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.birthDate = birthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public void setempID(int empID){
            this.empID = empID;
        }

    public int getempID(){
            return empID;
        }

    public void setempName(String empName){
            this.empName = empName;
        }

    public String getempName(){
            return empName;
        }

    public void setempDateHired(myTime empDateHired){
            this.empDateHired = empDateHired;
        }

    public myTime getempDateHired(){
            return empDateHired;
        }

    public void setbirthDate(myTime birthDate){
            this.birthDate = birthDate;
        }

    public myTime getbirthDate(){
            return birthDate;
        }

    public void settotalPiecesFinished(double totalPiecesFinished){
            this.totalPiecesFinished = totalPiecesFinished;
        }

    public double gettotalPiecesFinished(){
            return totalPiecesFinished;
        }

    public void setratePerPiece(float ratePerPiece){
            this.ratePerPiece = ratePerPiece;
        }

    public float getratePerPiece(){
            return ratePerPiece;
        }

    double computeSalary(double totalPiecesFinished, float ratePerPiece){
        double salary;
        if(totalPiecesFinished%100 >= 0){
            salary = totalPiecesFinished*(ratePerPiece*10);
        }else{
            salary = (totalPiecesFinished*ratePerPiece);
        }
        return salary;
    }

    void displayInfo(){
        System.out.printf("ID:%d Employee Name: %s Date Hired: %s Birth Date: %s Total Pieces Finished: %.2f  Rate Per Piece: %.2f Salary: %.2f/n", empID, empName, empDateHired.toString(), birthDate.toString(), totalPiecesFinished, ratePerPiece, computeSalary(totalPiecesFinished, ratePerPiece));
    }

    @Override
    public String toString(){
        return String.format("ID:%d Employee Name: %s Date Hired: %s Birth Date: %s Total Pieces Finished: %.2f  Rate Per Piece: %.2f Salary: %.2f/n", empID, empName, empDateHired.toString(), birthDate.toString(), totalPiecesFinished, ratePerPiece, computeSalary(totalPiecesFinished, ratePerPiece));
    }
}
