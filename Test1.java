public  class Test1 {

	public static String TextoDivision = "Resultado de la Division";
	public static String TextoSuma = "Resultado de la Suma";
	public static float operandoUno = 3;
	public static float OperandoDos = 4;
	public static float ResultadoDivision;
	public static boolean EsNoche = false;

	public static int numeroUno = 20;
	public static int numeroDos = 30;
	public static int ResultadoSuma = 0;

	public static void main(String[] args) {
		ResultadoDivision = (operandoUno/OperandoDos);
		ResultadoSuma = numeroUno + numeroDos;
		System.out.println(TextoSuma);
		System.out.println(ResultadoSuma);
		System.out.println(TextoDivision);
		System.out.println(ResultadoDivision);	

		if(EsNoche == false){
			System.out.println("Es de Dia");
		}
		else{
			System.out.println("Es de Noche");
		}			
	}

}