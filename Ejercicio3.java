import java.util.Scanner;
import java.lang.Math;

public class Ejercicio3_1s22{ 
 public static void main(String[] args){
   
   java.util.Scanner teclado = new Scanner(System.in);
   double a;
   double b= 1.33;
   double resultado;
   System.out.println("calcular el volumen");

   System.out.println("escriba un radio: ");
   a = teclado.nextInt();
   resultado = b*Math.PI*Math.pow(a,3);

   System.out.println("el valor del volumen es: "+ resultado);
 }
}