
public class NestedIf {
    public static void main(String[] args) {
        int age = 70;
        if (age < 60){
            System.out.println("Noor veel");
        }else {
            System.out.println("Tiba vana");
            if (age>70){
                System.out.println("Väga vana");
            }else{
                System.out.println("Pole hullu");

            }
        }
    }
}
