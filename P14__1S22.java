import java.util Scanner;
class P14_1S22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String opc;
		byte num1, num2;
		int resultado;

		System.out.println("\n Suma");
		System.out.println("\n Resta");
		System.out.println("\n multiplicacion");
		System.out.println("\n Division");
		System.out.println("\n Que opcion desea?");
		opc = teclado.nextLine();

		switch(opc){
		case "Suma":
			System.out.println("Aqui va la suma");
			System.out.println("ingresa el rimer numero");
		case "Resta":
			System.out.println("Aqui va la resta");
		case "Multiplicacion":
			System.out.println("Aqui va la multiplicacion");
		case "Division":
			System.out.println("Aqui va la Division");
		default: System.out.println("No existe la operacion");
		}
}