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
public class PieceWorkerEmployee extends Employee{
    private double totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee(){
    }

    public PieceWorkerEmployee(int empID, double totalPiecesFinished, float ratePerPiece){
        super(empID);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName, myDate empDateHired, myDate birthDate, double totalPiecesFinished, float ratePerPiece){
        super(empID, empName, empDateHired, birthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    public double computeSalary(double totalPiecesFinished, float ratePerPiece){
        double salary;
        if(totalPiecesFinished%100 >= 0){
            salary = totalPiecesFinished*(ratePerPiece*10);
        }else{
            salary = (totalPiecesFinished*ratePerPiece);
        }
        return salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Hourly Employee: \n");
        System.out.println(toString());
        System.out.printf("Salary: %.2f\n", computeSalary(totalPiecesFinished, ratePerPiece));
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Total Pieces Made: %.2f\nRate per Piece: %.2f", totalPiecesFinished, ratePerPiece);
    }
}
