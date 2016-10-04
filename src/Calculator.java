import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fnum, snum, vastus;
        System.out.println("Esimene nr: ");
        fnum=sc.nextDouble();
        System.out.println("Teine nr: ");
        snum=sc.nextDouble();
        vastus = fnum +snum;
        System.out.println(vastus);

    }

}
