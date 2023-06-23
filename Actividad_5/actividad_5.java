package Actividad_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class actividad_5 {
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        triangulos();
    }
    
    public static void triangulos(){
        while (true){
            try{

                System.out.println("Programa de Triangulos");
                System.out.print("Ingrese el 1er lado: ");
                int lado_1 = input.nextInt();
                System.out.print("Ingrese el 2er lado: ");
                int lado_2 = input.nextInt();
                System.out.print("Ingrese el 3er lado: ");
                int lado_3 = input.nextInt();
            }catch (InputMismatchException e){
                System.out.println("\nError la opcion es numerica\n");
                input.nextInt();
            }
        }

    }

}
