package CtoJava;

public class MrHanson{
    public static void main(String[] args) {
        double mon = calculatePayableDailySales(120, 1200);
        System.out.printf("\nTotal sales on Monday: %.2f\n",mon);

        double tue = calculatePayableDailySales(110, 1350);
        System.out.printf("\nTotal sales on Tuesday: %.2f\n",tue);

        double wed = calculatePayableDailySales(95, 1100);
        System.out.printf("\nTotal sales on Wednesday: %.2f\n",wed);

        double thurs = calculatePayableDailySales(125, 1400);
        System.out.printf("\nTotal sales on Thursday: %.2f\n",thurs);

        double fri = calculatePayableDailySales(114, 1300);
        System.out.printf("\nTotal sales on Friday: %.2f\n",fri);
        System.out.print("---------------------------------------");

        double grandTotal = mon + tue + wed + thurs + fri ;
        System.out.printf("\nTotal Weekly Payable Amount: %.2f\n",grandTotal);
        System.out.print("---------------------------------------\n\n");
        

        
    }
    static double calculatePayableDailySales(double D,double Avg){
        double Sales =0.3*D*Avg;
        return Sales;
        
    }
}