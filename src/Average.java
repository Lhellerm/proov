import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sisestus = new Scanner(System.in);
        int total = 0;
        int grade;
        int average;
        int counter =0;

        while(counter < 5){
            grade = sisestus.nextInt();
            total = total + grade;
            counter++;

        }
        average = total/5;
        System.out.println("Sinu keskmine on " + average);
    }
}
