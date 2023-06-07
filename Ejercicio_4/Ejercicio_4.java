import java.util.Scanner;


public class Ejercicio_4 {

    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      System.out.println("Programa Dias Perdidos");

      System.out.print("Ingrese la cantidad de cigarrillos que fuma por dia: ");
      int cigarrillos_dia = input.nextInt();
      
      System.out.print("Ingrese la cantidad de años que tiene fumando: ");
      int anios_fumando = input.nextInt();

      int resultado_minutos = (cigarrillos_dia * 10)*(anios_fumando * 365);
      int resultado_dias = resultado_minutos / (60*24);
        
      System.out.println("Usted perdera "+resultado_dias+" dias de vida\n");

      
      System.out.println("Progarama Alquiler de Autos");

      System.out.print("Ingrese la cantidad de km que recorrio el auto: ");
      float km_recorridos = input.nextFloat();

      System.out.print("ingrese la cantidad de dias que uso el auto: ");
      int dias_usado = input.nextInt();

      float toltal_pagar = (km_recorridos *20 ) + (dias_usado * 90);
      System.out.println("El total a pagar es "+toltal_pagar+" pesos");
      
      input.close();
      
    



      

    
    }

}
