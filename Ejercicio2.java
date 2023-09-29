import java.util.Scanner;
import java.lang.Math;

public class Ejercicio2_1s22{ 
 public static void main(String[] args){

    java.util.Scanner teclado = new Scanner(System.in);
    double a;
    double resultado;
    System.out.println("calcular el angulo en radiones");

    System.out.println("introducir un angulo: ");
    a = teclado.nextInt();
    resultado = Math.PI*a/180;
    System .out.println("el resultadoen radianes es: "+ resultado);
 }
}

