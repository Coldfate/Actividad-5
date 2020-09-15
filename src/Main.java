import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float x,y;
        float rSuma, rResta, rMulti, rDiv;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        x = sc.nextFloat();
        System.out.println("Introduce el segundo numero: ");
        y = sc.nextFloat();

        rSuma =  x + y;
        System.out.println("Suma: " + rSuma);
        rResta = x - y;
        System.out.println("Resta: " + rResta);
        rMulti = x * y;
        System.out.println("Multiplicación: " + rMulti);
        rDiv = x / y;
        System.out.println("División: " + rDiv);
    }
}
