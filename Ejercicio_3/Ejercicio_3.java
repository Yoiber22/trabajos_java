package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    // Crear un programa que solicite un nombre, edad y altura. Mostrar en pantalla.
        
        datos_personales();
        
    // Crear un programa que solicite un número y calcule el doble del mismo.
    System.out.println("\nDoble de un numero");
        System.out.print("\nIngrese numero: ");
        int numero = input.nextInt();
        int resultado = doble_num(numero);
        System.out.println("El doble del numero "+numero+" es "+resultado);

        
        // Crear un programa que solicite dos números y retorne su suma.
        System.out.println("\nSuma");
        System.out.print("\nIngrese numero 1 a sumar: ");
        int n1 = input.nextInt();
        System.out.print("Ingrese numero 2 a sumar: ");
        int n2 = input.nextInt();
        int resultado_sum = sumar(n1,n2);
        System.out.println("La suma "+n1+" + "+n2+" = "+resultado_sum);
        
        // Crear un programa que solicite dos números enteros y retorne la división entre estos.
        System.out.println("\nDivicion");
        System.out.print("\nIngrese dividendo: ");
        int dividendo = input.nextInt();
        System.out.print("Ingrese divisor: ");
        int divisor = input.nextInt();
        int resultado_div = dividir(dividendo,divisor);
        System.out.println("La divicion "+dividendo+" / "+divisor+" = "+resultado_div);

        // Crear un programa que solicite dos números enteros y retorne el RESTO la división entre estos.
        System.out.println("\nResto");
        System.out.print("\nIngrese numero 1: ");
        int n1_resto = input.nextInt();
        System.out.print("Ingrese numero 2: ");
        int n2_resto = input.nextInt();
        int resultado_resto = sumar(n1,n2);
        System.out.println("El resto de "+n1_resto+" / "+n2_resto+" = "+resultado_resto);

        input.close();
        
    }   

    public static int sumar(int n1, int n2) {
        int resultado = n1 + n2;
        return resultado;
    }

    public static int dividir(int n1, int n2) {
        int resultado = n1 / n2;
        return resultado;
    }

    public static int reto(int n1, int n2) {
        int resultado = n1 % n2;
        return resultado;
    }

    public static int doble_num(int n1) {
        int resultado = n1 * 2;
        return resultado;
    }

    
    public static void datos_personales(){
        Scanner input = new Scanner(System.in);

        System.out.println("Datos Personales\n");

        System.out.print("Ingrese nombre: ");
        String nombre = input.nextLine();

        System.out.print("Ingrese Edad: ");
        int edad = input.nextInt();

        System.out.print("Ingrese Altura: ");
        float altura = input.nextFloat();

        System.out.println("\nInformacion deL Usuario");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad  : "+edad);
        System.out.println("Altura: "+altura);

        input.close();
    }


}

