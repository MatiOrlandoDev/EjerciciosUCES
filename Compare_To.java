package IFS;
import java.util.Scanner;

public class Compare_To {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir primer dato s1: ");
        String s1 = sc.nextLine();

        System.out.println("Introducir segundo dato s2");

        String s2 = sc.nextLine();
        if (s1.compareTo(s2) < 0){
            System.out.println("es negativo s1 es menor a s2");
        } else if (s1.compareTo(s2) > 0 ){
            System.out.println("es positivo s1 es mayor a s2");
        } else if (s1.compareTo(s2) == 0 ){
            System.out.println("s1 y s2 son iguales.");
        }
    }
}
