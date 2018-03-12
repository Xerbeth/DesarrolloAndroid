public class Condicionales{

	public static int condicion = 3;
	public static char condicionDos = 'A';
	public static String Texto = "Hola";
	
	public static void main(String[] args){

		switch (Texto){

			case "Si": System.out.println("La variable condicionDos almaceno la letra A");
			break;

			case "Hola": System.out.println("La Variable Text almaceno la palabra Hola");
			break;

			case "No": System.out.println("La Variable condicion almaceno el numero 3");
			break;

			default: System.out.println("no se cumple la condicion");
		}

	}
 
}