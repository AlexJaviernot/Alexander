import java.util.Scanner;
import java.lang.Math;

public class Ejercicio4_1s22{ 
 public static void main(String[] args){

  java.util.Scanner teclado = new Scanner(System.in);
  double radio;
  double area;
  double longitud;
  System.out.println("escribe un radio: ");
  radio = teclado.nextInt();
  area = Math.PI*Math.pow(radio,2);
  longitud = 2*Math.PI*radio;

  System.out.println("el resutlado del area es: "+ area);
  System.out.println("el resultado de la longitud es: "+ longitud);
 }
}