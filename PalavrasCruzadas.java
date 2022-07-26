/*
 * Andr� Kaled Duarte - quest�o 21
 * Data: 18/07/2022 
 * */
import java.util.Scanner;

public class PalavrasCruzadas {
	public static void decora() {
		System.out.print("|");
		for (int i = 0; i < 25; i++)
			System.out.print("-");
		System.out.println("|");
	}

	public static void main(String[] args) {
		int maior = 0;
		int jogadorMaior = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a quantidade de jogadores que desejam jogar.");
		System.out.println("--> ");
		int quant = s.nextInt();
		s.nextLine();
		int[] ponto = new int[quant];
		int cont = 1;
		
		decora();
		System.out.println("|--- Palavras Cruzadas ---|");
		decora();
		
		while(cont <= 3){
			for(int i = 0; i < quant; i++){
				System.out.println();
				System.out.println("Sua vez jogador " +(i+1) +"!");
				System.out.println("Digite uma palavra para ver a pontua��o!");
				System.out.print("--> ");
				String a = s.nextLine();
				ponto[i] += pontuacaoDaPalavra(a);
				System.out.println("Sua pontua��o �: " + pontuacaoDaPalavra(a));
				System.out.print("aperte enter para continuar...");
				s.nextLine();
			}
			cont++;
			System.out.println();
			decora();
			System.out.println("|--- Pontua��o do jogo ---|");
			decora();
			for(int i = 0; i < quant; i++){
				System.out.println("Jogador " +(i+1) +" -> " +ponto[i]);
				if(maior < ponto[i]){
					maior = ponto[i];
					jogadorMaior = (i+1);
				}
			}
			System.out.print("aperte enter para continuar...");
			s.nextLine();
		}
		System.out.println("O vencedor � o jogador " +jogadorMaior +" com a pontua��o total de " +maior);
	}

	public static int pontuacaoDaPalavra(String palavra) {
		int pontos = 0;
		palavra = palavra.toUpperCase();
		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(i) == 'Q' || palavra.charAt(i) == 'Z') {
				pontos += 10;
			} else if (palavra.charAt(i) == 'J' || palavra.charAt(i) == 'X') {
				pontos += 8;
			} else if (palavra.charAt(i) == 'K') {
				pontos += 5;
			} else if (palavra.charAt(i) == 'F' || palavra.charAt(i) == 'H'
					|| palavra.charAt(i) == 'V' || palavra.charAt(i) == 'W'
					|| palavra.charAt(i) == 'Y') {
				pontos += 4;
			} else if (palavra.charAt(i) == 'B' || palavra.charAt(i) == 'C'
					|| palavra.charAt(i) == 'M' || palavra.charAt(i) == 'P') {
				pontos += 3;
			} else if (palavra.charAt(i) == 'D' || palavra.charAt(i) == 'G') {
				pontos += 2;
			} else {
				pontos++;
			}
		}
		return pontos;
	}
}