import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        // VARIABLES

        int nbr1;
        int nbr2;
        int inter;


        //DEBUT DU CODE

        System.out.println("Veuillez entrez vos deux nombres à comparez");
        Scanner sc = new Scanner(System.in);
        nbr1 = sc.nextInt();
        nbr2 = sc.nextInt();

        inter = nbr1;
        nbr1 = nbr2;
        nbr2 = inter;

        System.out.println(" Vos nombres sont "+nbr1+" et "+nbr2);






    }
}
