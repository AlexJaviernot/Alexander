import java.util.Scanner;
public class P13_1s22{ 
	public static void main(String[] args){ 
	Scanner teclado = new Scanner(System.in);
    String operacion;
    int num1, num2;
    int resultado;

	System.out.println("Programa que realiza operaciones basicas");
	System.out.println("que operacion desea: Suma, Resta, Division, Multiplicacion?");
	operacion = teclado.nextLine();
	if(operacion.equals("Suma")){
	System.out.println("aqui debemos realizar una suma");
	System.out.println("ingresa el primer numero");
	operacion = teclado.nextLine();
    num1 = Integer.parseInt(operacion);
    System.out.println("ingresa el segundo numero");
	operacion = teclado.nextLine();
    num2 = Integer.parseInt(operacion);
    resultado = num1+num2;
    System.out.println("La suma es:" + resultado);

}
    if(operacion.equals("Resta")){
	System.out.println("aqui debemos realizar una resta");
	System.out.println("ingresa el primer numero");
	operacion = teclado.nextLine();
    num1 = Integer.parseInt(operacion);
    System.out.println("ingresa el segundo numero");
	operacion = teclado.nextLine();
    num2 = Integer.parseInt(operacion);
    resultado = num1-num2;
    System.out.println("La resta es:" + resultado);
}
    if(operacion.equals("Division")){
	System.out.println("aqui debemos realizar una Division");
	System.out.println("ingresa el primer numero");
	operacion = teclado.nextLine();
    num1 = Integer.parseInt(operacion);
    System.out.println("ingresa el segundo numero");
	operacion = teclado.nextLine();
    num2 = Integer.parseInt(operacion);
    resultado = num1/num2;
    System.out.println("La Division es:" + resultado);
}
    if(operacion.equals("Multiplicacion")){
	System.out.println("aqui debemos realizar una Multiplicacion");
	System.out.println("ingresa el primer numero");
	operacion = teclado.nextLine();
    num1 = Integer.parseInt(operacion);
    System.out.println("ingresa el segundo numero");
	operacion = teclado.nextLine();
    num2 = Integer.parseInt(operacion);
    resultado = num1*num2;
    System.out.println("La Multiplicacion es:" + resultado);
}
}
}

