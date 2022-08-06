package CtoJava;
import java.util.Scanner;
public class AtaaGob3 {
    public static void main(String[] args) {
        System.out.println("\n***Welcome To Ataa Gob3 Joint....***");
Scanner sc = new Scanner(System.in);
        double GB ,RP ,PR , EGG, Disc,Sub_Total,Amnt_disc,Amnt_payb;
        System.out.print("\nEnter the amount of Gari and Beans(GHC):");
        GB = sc.nextDouble();

        System.out.print("\nEnter the amount of Ripe Plantain(GHC):");
        RP = sc.nextDouble();

        System.out.print("\nEnter the amount of Plain Rice(GHC):");
        PR = sc.nextDouble();

        System.out.print("\nEnter the amount of EGG(GHC):");
        EGG = sc.nextDouble();

        System.out.print("\nEnter your percentage discount(%):");
        Disc= sc.nextDouble();

        sc.nextLine();
        System.out.print("-----------------------------------");
        Sub_Total = GB + RP + PR + EGG;
        Amnt_disc = (Sub_Total * (Disc/100));
        Amnt_payb= Sub_Total - Amnt_disc;
        
        System.out.printf("\nSub Total(GHC)\t: %.2f\n",Sub_Total);
        System.out.print("-----------------------------------");
        System.out.printf("\nDiscount(GHC)\t: %.2f\n",Amnt_disc);
        System.out.print("-----------------------------------");
        System.out.printf("\nTotal(GHC)\t: %.2f\n",Amnt_payb);
        System.out.print("-----------------------------------\n");

    }
}
