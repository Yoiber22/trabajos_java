package calculadora;

import java.util.Scanner;

public class principal {
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        int opcion;
        do{

            System.out.println("Calculadora");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Divicion");
            System.out.println("0. Salir");
            System.out.print("Ingrese opcion: ");
            opcion = input.nextInt();
    
            switch(opcion){
                case 1:
                    operaciones.sumar();
                    break;
                case 2:
                    operaciones.restar();
                    break;
                case 3:
                    operaciones.multiplicar();
                    break;
                case 4:
                    operaciones.dividir();
                    break;
                case 0:
                    System.out.println("Gracias por usar mi programa");
                    break;
                default:
                    System.out.println("Opcion invalida. Repita...");
                    break;                    
            }

            
        }while (opcion != 0);


        input.close();
    }
    
}
