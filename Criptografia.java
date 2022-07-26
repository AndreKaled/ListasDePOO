/*
 * Andr� Kaled Duarte - Quest�es 27, 28, 31, 32 e 34.
 * Data de publica��o: 14/07/2022 
 * obs: foi realizado antes da data mas completado no mesmo.
 * */

public class Criptografia {

	// Questao 27 algoritmo rot13
	public static String codificaRot13(String le) {
		char c;
		int i;
		char code;
		String code1 = "";
		String frase = "";

		for (i = 0; i < le.length(); i++) {
			c = le.charAt(i);
			// reinicia com um valor "vazio"
			code1 = "";

			// caso a letra seja minuscula
			if (c > 96 && c < 123) {
				// soma 13 para que percorra 13 letras a frente (de A at� Z)
				code = (char) (c + 13);
				if ((char) (code) > 122) {
					// caso seja maior que z, retorna 26 letras
					code = (char) (code - 26);
				}

				// transfere para String
				code1 += code;

				// zera a String para transferencia de concat
			} else if (c > 64 && c < 91) {// caso seja letra maiuscula

				// soma 13 para que percorra 13 letras a frente (de A at� Z)
				code = (char) (c + 13);
				if ((char) (code) > 90) {
					// caso seja maior que z, retorna 26 letras
					code = (char) (code - 26);
				}

				// transfere para String
				code1 += code;
				// zera a String para transferencia de concat
			} else {
				// em todos os outros casos, permanece inalterado o caractere
				code1 += c;
			}
			// concatena com parte da frase codificada
			frase = frase.concat(code1);
		}

		// retorna a frase codificada ou decodificada se executar novamente
		return frase;
	}

	// metodo decodificador do Rot 13
	public static String decodificaRot13(String pala) {
		// executa novamente o metodo codificador, pois a frase retorna ao
		// estado anterior
		return codificaRot13(pala);
	}

	// quest�o 28
	// metodo para codificar
	public static String codificaCesar(String frase, int chave) {
		char c;
		char p = 32;
		String cripto = "";
		for (int i = 0; i < frase.length(); i++) {
			c = frase.charAt(i);

			// caso minuscula
			if (c > 96 && c < 123) {
				p = (char) (c + chave);
				if ((char) p > 122) {
					p = (char) (p - 26);
				}
			} else if (c > 64 && c < 91) { // caso maiuscula
				p = (char) (c + chave);
				if ((char) p >= 65) {
					p = (char) (p - 26);
				}
			} else { // todos os outros casos
				p = c;
			}

			String letra = "";
			letra += p;
			cripto = cripto.concat(letra);
		}
		return cripto;
	}

	public static String descriptografiaDeCesar(String codigo, int chave) {
		char c;
		char p = 32;
		String descript = "";
		for (int i = 0; i < codigo.length(); i++) {
			c = codigo.charAt(i);

			if (c > 96 && c < 123) { // caso minuscula
				p = (char) (c - chave);
				if ((char) p <= 96) {
					p = (char) (p + 26);
				}
			} else if (c > 64 && c < 91) { // caso maiuscula
				p = (char) (c - chave);
				if ((char) p <= 64) {
					p = (char) (p + 26);
				}
			} else { // todos os outros caso permanecem com seus caracteres
						// constantes
				p = c;
			}
			String letra = "";
			letra += p;
			descript = descript.concat(letra);
		}
		return descript;
	}

	// quest�o 31 O algoritmo das pontas
	public static String codificaPontas(String palavra) {
		String codigo = "";
		int tamMax = palavra.length() - 1;
		double meio;
		// define a metade do tamanho
		if (tamMax % 2 == 0) {
			meio = tamMax / 2;
		} else {
			meio = tamMax / 2 + 0.5;
		}
		// percorre a string encriptografando
		for (int i = 0; i <= meio; i++) {
			String a = "";
			a += palavra.charAt(i);
			String b = "";
			b += palavra.charAt(tamMax);
			tamMax--;
			if (tamMax == meio) {
				codigo = codigo.concat(a);
			} else {
				tamMax--;
				codigo = codigo.concat(a).concat(b);
			}
		}
		return codigo;
	}

	public static String decodificaPontas(String codigo) {
		String decodificado = "";
		String a = "";
		String b = "";
		String c = "";
		for (int i = 0; i < codigo.length(); i++) {
			if (i % 2 == 0) {
				// recebe os caracteres impares, ou pares em logica de vetor
				a += codigo.charAt(i);
			} else {
				// os pares, ou impares em l�gica de vetor
				b += codigo.charAt(i);
			}
		}
		// inverte a leitura de b
		for (int i = (b.length() - 1); i >= 0; i--)
			c += b.charAt(i);
		return decodificado = a.concat(c);
	}

	// Quest�o 32
	static int M;

	public static String codificaFatias(String palavra, int N) {
		// incrementando espa�o caso a quant. n�o seja divis�vel por N
		while (palavra.length() % N != 0) {
			// incrementando
			palavra = palavra.concat(" ");
		}

		// variaveis locais
		// variavel do comprimento da string dividido por N
		M = (palavra.length() / N);

		// variavel para concatena��o da criptogafia
		String criptConcatenada = "";
		int p = 0;

		// encriptando a string
		System.out.print("|");
		for (int i = 0; i < M; i++)
			System.out.print("-");
		System.out.print("|");
		for (int i = 0; i < N; i++) {
			if (p >= (palavra.length() - 1)) {
				p = i;
			}
			String fatia = "";
			while (p <= (palavra.length() - 1)) {
				String aux = "";
				aux += palavra.charAt(p);
				fatia = fatia.concat(aux);
				p += N;
			}
			criptConcatenada = criptConcatenada.concat(fatia);
			System.out.print("\n|" + fatia + "|");
		}
		System.out.println();
		System.out.print("|");
		for (int i = 0; i < M; i++)
			System.out.print("-");
		System.out.print("|");
		System.out.println("\nFatias concatenadas: " + criptConcatenada);
		return criptConcatenada;
	}

	public static void decodificaFatias(String palavra, int fatias) {
		codificaFatias(codificaFatias(palavra, fatias), M);
	}

	// Quest�o 34
	public static String codificaCesarMelhorado(String frase, String chave) {
		String codificado = "";
		char letra;
		int j = 0;
		while (j < frase.length()) {
			for (int i = 0; i < chave.length()&&j < frase.length(); i++) {
				int key;
				switch (chave.charAt(i)) {
				case 'a':
					key = 1;
					break;
				case 'b':
					key = 2;
					break;
				case 'c':
					key = 3;
					break;
				case 'd':
					key = 4;
					break;
				case 'e':
					key = 5;
					break;
				case 'f':
					key = 6;
					break;
				case 'g':
					key = 7;
					break;
				case 'h':
					key = 8;
					break;
				case 'i':
					key = 9;
					break;
				case 'j':
					key = 10;
					break;
				case 'k':
					key = 11;
					break;
				case 'l':
					key = 12;
					break;
				case 'm':
					key = 13;
					break;
				case 'n':
					key = 14;
					break;
				case 'o':
					key = 15;
					break;
				case 'p':
					key = 16;
					break;
				case 'q':
					key = 17;
					break;
				case 'r':
					key = 18;
					break;
				case 's':
					key = 19;
					break;
				case 't':
					key = 20;
					break;
				case 'u':
					key = 21;
					break;
				case 'v':
					key = 22;
					break;
				case 'w':
					key = 23;
					break;
				case 'x':
					key = 24;
					break;
				case 'y':
					key = 25;
					break;
				case 'z':
					key = 26;
					break;
				default:
					key = 0;
				}
				//caso maiuscula
				if(frase.charAt(j) > 64 && frase.charAt(j) < 91){
					letra = (char) (frase.charAt(j) + key);
					if(letra > 91)
						letra -= 26;
				}else if(frase.charAt(j) > 96 && frase.charAt(j) < 123){
					//caso minuscula
					letra = (char) (frase.charAt(j) + key);
					if(letra > 122)
						letra -= 26;
				}else{
					//qualquer outro caso
					letra = frase.charAt(j);
				}
				codificado += letra;
				j++;
			}
		
		}
		return codificado;
	}
	//decodifica��o 
	public static String decodificaCesarMelhorado(String frase, String chave) {
		String decodificado = "";
		char letra;
		int j = 0;
		while (j < frase.length()) {
			for (int i = 0; i < chave.length()&&j < frase.length(); i++) {
				int key;
				switch (chave.charAt(i)) {
				case 'a':
					key = 1;
					break;
				case 'b':
					key = 2;
					break;
				case 'c':
					key = 3;
					break;
				case 'd':
					key = 4;
					break;
				case 'e':
					key = 5;
					break;
				case 'f':
					key = 6;
					break;
				case 'g':
					key = 7;
					break;
				case 'h':
					key = 8;
					break;
				case 'i':
					key = 9;
					break;
				case 'j':
					key = 10;
					break;
				case 'k':
					key = 11;
					break;
				case 'l':
					key = 12;
					break;
				case 'm':
					key = 13;
					break;
				case 'n':
					key = 14;
					break;
				case 'o':
					key = 15;
					break;
				case 'p':
					key = 16;
					break;
				case 'q':
					key = 17;
					break;
				case 'r':
					key = 18;
					break;
				case 's':
					key = 19;
					break;
				case 't':
					key = 20;
					break;
				case 'u':
					key = 21;
					break;
				case 'v':
					key = 22;
					break;
				case 'w':
					key = 23;
					break;
				case 'x':
					key = 24;
					break;
				case 'y':
					key = 25;
					break;
				case 'z':
					key = 26;
					break;
				default:
					key = 0;
				}
				//caso maiuscula
				if(frase.charAt(j) > 64 && frase.charAt(j) < 91){
					letra = (char) (frase.charAt(j) - key);
					if(letra < 64)
						letra += 26;
				}else if(frase.charAt(j) > 96 && frase.charAt(j) < 123){
					//caso minuscula
					letra = (char) (frase.charAt(j) - key);
					if(letra < 96)
						letra += 26;
				}else{
					//qualquer outro caso
					letra = frase.charAt(j);
				}
				decodificado += letra;
				j++;
			}
		
		}
		return decodificado;
	}
}
