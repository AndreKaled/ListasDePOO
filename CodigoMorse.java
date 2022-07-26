/*
 * Andr� Kaled Duarte - Quest�es 27, 28, 31 e 32
 * Data de publica��o: 14/07/2022 
 * */
import java.util.Scanner;

public class CodigoMorse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (1 == 1) {
			System.out.println("[1] frase.\n[2] morse.\n[3] fim...");
			System.out.print("Digite sua op��o: ");
			int op = s.nextInt();
			s.nextLine();
			if (op == 1) {
				System.out.print("Digite a frase:");
				String frase = s.nextLine();
				String a = codificaMorse(frase);
				System.out.println("Morse -----> " + a);
				System.out.println("Tradu��o --> " + decodificaMorse(a));
			} else if (op == 2) {
				System.out.print("Digite o c�digo:");
				String a = s.nextLine();
				System.out.println("Morse -----> " + a);
				System.out.println("Tradu��o --> " + decodificaMorse(a));
			} else {
				break;
			}
		}
	}

	public static String codificaMorse(String frase) {
		String codiguinho = "";
		String codigo;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
				codigo = ".-";
			} else if (frase.charAt(i) == 'b' || frase.charAt(i) == 'B') {
				codigo = "-...";
			} else if (frase.charAt(i) == 'c' || frase.charAt(i) == 'C') {
				codigo = "-.-.";
			} else if (frase.charAt(i) == 'd' || frase.charAt(i) == 'D') {
				codigo = "-..";
			} else if (frase.charAt(i) == 'e' || frase.charAt(i) == 'E') {
				codigo = ".";
			} else if (frase.charAt(i) == 'f' || frase.charAt(i) == 'F') {
				codigo = "..-.";
			} else if (frase.charAt(i) == 'g' || frase.charAt(i) == 'G') {
				codigo = "--.";
			} else if (frase.charAt(i) == 'h' || frase.charAt(i) == 'H') {
				codigo = "....";
			} else if (frase.charAt(i) == 'i' || frase.charAt(i) == 'I') {
				codigo = "..";
			} else if (frase.charAt(i) == 'j' || frase.charAt(i) == 'J') {
				codigo = ".---";
			} else if (frase.charAt(i) == 'k' || frase.charAt(i) == 'K') {
				codigo = "-.-";
			} else if (frase.charAt(i) == 'l' || frase.charAt(i) == 'L') {
				codigo = ".-..";
			} else if (frase.charAt(i) == 'm' || frase.charAt(i) == 'M') {
				codigo = "--";
			} else if (frase.charAt(i) == 'n' || frase.charAt(i) == 'N') {
				codigo = "-.";
			} else if (frase.charAt(i) == 'o' || frase.charAt(i) == 'O') {
				codigo = "---";
			} else if (frase.charAt(i) == 'p' || frase.charAt(i) == 'P') {
				codigo = ".--.";
			} else if (frase.charAt(i) == 'q' || frase.charAt(i) == 'Q') {
				codigo = "--.-";
			} else if (frase.charAt(i) == 'r' || frase.charAt(i) == 'R') {
				codigo = ".-.";
			} else if (frase.charAt(i) == 's' || frase.charAt(i) == 'S') {
				codigo = "...";
			} else if (frase.charAt(i) == 't' || frase.charAt(i) == 'T') {
				codigo = "-";
			} else if (frase.charAt(i) == 'u' || frase.charAt(i) == 'U') {
				codigo = "..-";
			} else if (frase.charAt(i) == 'v' || frase.charAt(i) == 'V') {
				codigo = "...-";
			} else if (frase.charAt(i) == 'w' || frase.charAt(i) == 'W') {
				codigo = ".--";
			} else if (frase.charAt(i) == 'x' || frase.charAt(i) == 'X') {
				codigo = "-..-";
			} else if (frase.charAt(i) == 'y' || frase.charAt(i) == 'Y') {
				codigo = "-.--";
			} else if (frase.charAt(i) == 'z' || frase.charAt(i) == 'Z') {
				codigo = "--..";
			} else if (frase.charAt(i) == '.') {
				codigo = ".-.-.-";
			} else if (frase.charAt(i) == ',') {
				codigo = "--..--";
			} else if(frase.charAt(i) == ' '){
				codigo = "/";//espa�o em morse
			} else{
				codigo = "?";
			}
			codiguinho += codigo.concat(" ");

		}
		return codiguinho;
	}

	public static String decodificaMorse(String codiguinho) {
		String descript = "";
		String pala;
		String[] cod = codiguinho.split(" ");
		for (int i = 0; i < cod.length; i++) {
			String p = cod[i];
			if (p.equals(".-")) {
				pala = "a";
			} else if (p.equals("-...")) {
				pala = "b";
			} else if (p.equals("-.-.")) {
				pala = "c";
			} else if (p.equals("-..")) {
				pala = "d";
			} else if (p.equals(".")) {
				pala = "e";
			} else if (p.equals("..-.")) {
				pala = "f";
			} else if (p.equals("--.")) {
				pala = "g";
			} else if (p.equals("....")) {
				pala = "h";
			} else if (p.equals("..")) {
				pala = "i";
			} else if (p.equals(".---")) {
				pala = "j";
			} else if (p.equals("-.-")) {
				pala = "k";
			} else if (p.equals(".-..")) {
				pala = "l";
			} else if (p.equals("--")) {
				pala = "m";
			} else if (p.equals("-.")) {
				pala = "n";
			} else if (p.equals("---")) {
				pala = "o";
			} else if (p.equals(".--.")) {
				pala = "p";
			} else if (p.equals("--.-")) {
				pala = "q";
			} else if (p.equals(".-.")) {
				pala = "r";
			} else if (p.equals("...")) {
				pala = "s";
			} else if (p.equals("-")) {
				pala = "t";
			} else if (p.equals("..-")) {
				pala = "u";
			} else if (p.equals("...-")) {
				pala = "v";
			} else if (p.equals(".--")) {
				pala = "w";
			} else if (p.equals("-..-")) {
				pala = "x";
			} else if (p.equals("-.--")) {
				pala = "y";
			} else if (p.equals("--..")) {
				pala = "z";
			} else if (p.equals(".-.-.-")) {
				pala = ".";
			} else if (p.equals("--..--")) {
				pala = ",";
			} else if (p.equals("/")) {
				pala = " ";
			} else {
				pala = "?";
			}
			descript = descript.concat(pala);
		}
		return descript;
	}
}
