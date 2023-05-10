package IFS;
import java.util.*;
public class mayor3 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a, b, c;
        System.out.println("Introduzca primer numero: ");
        a = sc.nextInt();
        System.out.println("Introduzca segundo numero: ");
        b = sc.nextInt();
        System.out.println("Introduzca tercer numero ");
        c = sc.nextInt();

        if (a > b) {
            if (a > c){
                System.out.println("El mayor es a: " + a);
            }else {
                System.out.println("El mayor es c: " + c);
            }
        } else {
            if (b > c){
                System.out.println("El mayor es: " + b);
            } else {
                System.out.println("El mayor es: " + c);
            }
        }
    }
}
