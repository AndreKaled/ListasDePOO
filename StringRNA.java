public class StringRNA extends StringDNA {
	private static String RNA;

	public StringRNA(String conjunto) {
		super(conjunto);
		conjunto = getDNA();
		// alterando T por U
		conjunto = conjunto.replace('T', 'U');
		setRNA(conjunto);
	}

	// metodos de acesso
	public void setRNA(String RNA) {
		this.RNA = RNA;
	}

	public String getRNA() {
		return RNA;
	}

	// sobrescrevendo metodos da superclasse
	// metodo toString
	@Override
	public String toString() {
		return RNA;
	}

	@Override
	// metodo charAT
	public char charAt(int arg) {
		return RNA.charAt(arg);
	}

	// metodos quantos
	public static int quantosA() {
		int cont = 0;
		for (int i = 0; i < RNA.length(); i++) {
			if (RNA.charAt(i) == 'A')
				cont++;
		}
		return cont;
	}

	public static int quantosC() {
		int cont = 0;
		for (int i = 0; i < RNA.length(); i++) {
			if (RNA.charAt(i) == 'C')
				cont++;
		}
		return cont;
	}

	public static int quantosG() {
		int cont = 0;
		for (int i = 0; i < RNA.length(); i++) {
			if (RNA.charAt(i) == 'G')
				cont++;
		}
		return cont;
	}

	public static int quantosU() {
		int cont = 0;
		for (int i = 0; i < RNA.length(); i++) {
			if (RNA.charAt(i) == 'U')
				cont++;
		}
		return cont;
	}

	@Override
	// metodo length
	public int length() {
		return RNA.length();
	}

}