/*
 * Andr� Kaled Duarte -  Quest�o 10
 * Data: 21/07/2022 
 * */
public class TesteRetornoWith {

	public static void main(String[] args) {
		System.out.println("Tremblay".startsWith("T"));//true
		System.out.println("Tremblay".endsWith("Y"));//false
		System.out.println("Tremblay".toLowerCase().startsWith("tre"));//true
		System.out.println("Tremblay".startsWith("tre".toUpperCase()));//false
		System.out.println("Tremblay".trim().startsWith("re"));//false
		//As respostas que retornam true s�o: a) e c).
	}

}
