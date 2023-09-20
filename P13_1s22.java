import java.util.Scanner;
public class P13_1s22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String operacion;

		System.out.println("Programa que realiza operaciones basicas");
		System.out,println("Que operacion desea: Suma, Resta, Division, Multiplicacion")
			operacion = teclado.nextLine();
		if(operacion.equals("Suma")){
			System.out.println("Aqui debemos realizar una suma");
		}
		if(operacion.equals("Resta")){
			System.out.println("Aqui debemos realizar una resta");
		}else{
			System.out.println("No existe opcion a realizar");
		}

			}
}