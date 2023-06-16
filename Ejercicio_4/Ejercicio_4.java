import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio_4 {

  static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

      menu();
    }

    public static void menu(){
      while (true){
        System.out.println("Que progaram desea ejecutar?");
        System.out.println("1. Dias perdidos");
        System.out.println("2. Alquiler de autos");
        System.out.println("0. Salir");
        System.out.print("Ingrese Opcion: ");
        try{
          int opcion = input.nextInt();

          if (opcion == 0){
            System.out.println("Gracias por usar mi programa");
            break;
          }

          if (opcion == 1){
            dias_perdidos();
          }

          if (opcion == 2){
            alquiler_autos();
          }
          else{
            System.out.println("\nOpcion no encontrada\n");
          }
        }catch (InputMismatchException e){
          System.out.println("\nError: La opcion es numerica\n");
          input.nextLine();

        }
      }
      input.close();
      
      

    }

    public static void dias_perdidos(){

      // MSP - Días perdidos.
      // -Escriba un programa para calcular la reducción en la vida útil de un fumador. 
      // Pregunte cuántos cigarrillos fumaba por día y cuántos años ha fumado. 
      // Suponga que un fumador pierde 10 minutos de vida con cada cigarrillo. 
      // Calcula cuántos días de vida perderá un fumador y muestra el total en días.

      System.out.println("\nPrograma Dias Perdidos");
      
      System.out.print("Ingrese la cantidad de cigarrillos que fuma por dia: ");
      int cigarrillos_dia = input.nextInt();

      try{
        System.out.print("Ingrese la cantidad de años que tiene fumando: ");
        int anios_fumando = input.nextInt();
        
        int resultado_minutos = (cigarrillos_dia * 10)*(anios_fumando * 365);
        int resultado_dias = resultado_minutos / (60*24);
        
        System.out.println("Usted perdera "+resultado_dias+" dias de vida\n");
        
      }catch (InputMismatchException e){
        System.out.println("Error: Solo se pueden ingresar numeros");
      }
      input.close();

    }
      // Alquiler: de coches:
      // -La empresa de alquiler de coches necesita tu ayuda para cobrar por sus servicios.
      //  Escriba un programa que pregunte la cantidad de kilómetros recorridos por un automóvil alquilado
      //  y la cantidad de días que estuvo alquilado.
      //  Calcule el precio total a pagar, sabiendo que el automóvil cuesta US$ 90 por día y US$ 30 por km recorrido.
    
    
    public static void alquiler_autos(){

      System.out.println("\nProgarama Alquiler de Autos");
    
      try{

        System.out.print("Ingrese la cantidad de km que recorrio el auto: ");
        float km_recorridos = input.nextFloat();

        System.out.print("ingrese la cantidad de dias que uso el auto: ");
        int dias_usado = input.nextInt();

        float toltal_pagar = (km_recorridos *20 ) + (dias_usado * 90);
        System.out.println("El total a pagar es "+toltal_pagar+" pesos");
        
      }catch (InputMismatchException e){
        System.out.println("");
      }
      input.close();

    }
      
}
