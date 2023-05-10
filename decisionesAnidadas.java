package IFS;

public class decisionesAnidadas {
    public static void main(String[] args){
int scan = 3;
int num1 = 8;
int num2 =4;
int resultado = 0;

if( scan ==1){
    resultado= num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    } else if (scan == 2){
    resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
    } else if (scan == 3){
    resultado= num1 * num2;
    System.out.println("El resultado de la multiplicacion es: " + resultado);
    }else if(scan == 4){
    resultado=num1 / num2;
        System.out.println("El resultado de la division es: ");
        }

    }
}
