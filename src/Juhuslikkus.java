import java.util.Random;

public class Juhuslikkus {
    public static void main(String[] args) {

        Random dice = new Random();
        int number;

         for(int counter = 1; counter<=11; counter++) {
         number = 1 + dice.nextInt(6);//väljastab arve 0-5; 1+ liidab juurde 1
         System.out.println(number + "");
    }
    }
}
