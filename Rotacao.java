/*
 * Andr� Kaled Duarte - Quest�o 6
 * Data: 20/07/2022 18:08
 * */
import java.util.Scanner;

public class Rotacao {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Rotacionando palavras...");
		System.out.print("Digite algo: ");
		String palavra = s.nextLine();
		for(int i = 0; i <= palavra.length(); i++){
			System.out.print(palavra.substring(i,palavra.length()));
			if(i != 0)
				System.out.print(palavra.substring(0, i));
			System.out.println();
		}
	}

}
