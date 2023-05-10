package IFS;
import java.sql.SQLOutput;
import java.util.*;
public class Hipotenusa {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Introduzca la base del triangulo rectangulo: ");

        double base = scanner.nextDouble();

        System.out.println("Introduzca la altura del triangulo rectangulo: ");
        double altura = scanner.nextDouble();

        double hipotenusa = Math.sqrt(base * altura * altura);
        System.out.println("longitud de la hipotenusa es = " + hipotenusa);

        scanner.close();
    }
}
