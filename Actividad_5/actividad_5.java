package Actividad_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class actividad_5 {
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        triangulos();
    }
    
    public static void triangulos(){

        boolean condicion = true;
        System.out.println("Programa de Triangulos\n");
        while (condicion){
            try{
                System.out.print("Ingrese el 1er lado: ");
                int lado_1 = input.nextInt();
                System.out.print("Ingrese el 2er lado: ");
                int lado_2 = input.nextInt();
                System.out.print("Ingrese el 3er lado: ");
                int lado_3 = input.nextInt();

                if (lado_1 == lado_2){
                    if (lado_1 == lado_2 && lado_2 == lado_3){
                        System.out.println("\nTriangulo Equilatero");
                        
                    }else{
                        System.out.println("\nTriangulo Isosceles");
                    } 
                } else{
                    System.out.println("\nTriangulo Escaleno");
                }   
                triangulo_rectangulo(lado_1, lado_2, lado_3);
                condicion = false;

            }catch (InputMismatchException e){
                System.out.println("\nError la opcion es numerica\n");
                input.nextLine();
            }
        }

    }
    public static void triangulo_rectangulo(int a, int b, int c){
        String es_rectangulo;
        if (a*a == b*b + c*c || b*b == a*a + b*b || c*c == a*a + b*b){
            es_rectangulo = "Es Rectangulo\n";
        }else{
            es_rectangulo = "No es rectangulo\n";
        }
        System.out.println(es_rectangulo);
    }


    


}
