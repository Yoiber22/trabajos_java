package calculadora;

import java.util.Scanner;

public class operaciones {

    static Scanner input = new Scanner(System.in);

    public static void sumar(){
        System.out.println("\nSumar");
        System.out.print("Ingrese numero 1 a sumar: ");
        float n1 = input.nextFloat();
        System.out.print("Ingrese numero 2 a sumar: ");
        float n2 = input.nextFloat();
        float resultado = n1 + n2;
        System.out.println("El resultado de "+n1+" + "+n2+" = "+resultado+"\n");
    }

    public static void restar(){
        System.out.println("\nRestar");
        System.out.print("Ingrese numero 1 a restar: ");
        float n1 = input.nextFloat();
        System.out.print("Ingrese numero 2 a restar: ");
        float n2 = input.nextFloat();
        float resultado = n1 - n2;
        System.out.println("El resultado de "+n1+" - "+n2+" = "+resultado+"\n");
    }

    public static void multiplicar(){
        System.out.println("\nMultiplicar");
        System.out.print("Ingrese numero 1 a multiplicar: ");
        float n1 = input.nextFloat();
        System.out.print("Ingrese numero 2 a multiplicar: ");
        float n2 = input.nextFloat();
        float resultado = n1 * n2;
        System.out.println("El resultado de "+n1+" x "+n2+" = "+resultado+"\n");
    }
    public static void dividir(){
        System.out.println("\nDividir");
        System.out.print("Ingrese dividendo: ");
        float n1 = input.nextFloat();
        System.out.print("Ingrese divisor: ");
        float n2 = input.nextFloat();
        float resultado = n1 / n2;
        System.out.println("El resultado de "+n1+" / "+n2+" = "+resultado+"\n");
    }
}
