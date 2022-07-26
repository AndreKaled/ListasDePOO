/*
 * Andr� Kaled Duarte - Quest�o 35
 * Data: 25/07/2022
 * */
public class StringAminoAcidos {
	// variavel para encapsular os aminoacidos do dna
	private String aminoAcidos;

	// construtor da classe com argumento do tipo StringRNA
	public StringAminoAcidos(StringRNA obj) {
		String amino = "";
		String RNA = obj.getRNA();
		if(RNA.length()%3!=0){
			for(int i = 0; RNA.length()%3 != 0; i++)
				RNA += " ";
		}
		for (int cont = 0; cont < RNA.length(); cont += 3) {
			if (RNA.substring(cont, (cont + 3)).equals("GAU")
					|| RNA.substring(cont, (cont + 3)).equals("GAC"))
				amino += "D";
			else if (RNA.substring(cont, (cont + 3)).equals("GAA")
					|| RNA.substring(cont, (cont + 3)).equals("GAG"))
				amino += "E";
			else if (RNA.substring(cont, (cont + 3)).equals("GCU")
					|| RNA.substring(cont, (cont + 3)).equals("GCC")
					|| RNA.substring(cont, (cont + 3)).equals("GCA")
					|| RNA.substring(cont, (cont + 3)).equals("GCG"))
				amino += "A";
			else if (RNA.substring(cont, (cont + 3)).equals("CGU")
					|| RNA.substring(cont, (cont + 3)).equals("CGC")
					|| RNA.substring(cont, (cont + 3)).equals("CGA")
					|| RNA.substring(cont, (cont + 3)).equals("CGG")
					|| RNA.substring(cont, (cont + 3)).equals("AGA")
					|| RNA.substring(cont, (cont + 3)).equals("AGG"))
				amino += "R";
			else if (RNA.substring(cont, (cont + 3)).equals("AAU")
					|| RNA.substring(cont, (cont + 3)).equals("AAC"))
				amino += "N";
			else if (RNA.substring(cont, (cont + 3)).equals("UGU")
					|| RNA.substring(cont, (cont + 3)).equals("UGC"))
				amino += "C";
			else if (RNA.substring(cont, (cont + 3)).equals("UUU")
					|| RNA.substring(cont, (cont + 3)).equals("UUC"))
				amino += "F";
			else if (RNA.substring(cont, (cont + 3)).equals("GGA")
					|| RNA.substring(cont, (cont + 3)).equals("GGC")
					|| RNA.substring(cont, (cont + 3)).equals("GGU")
					|| RNA.substring(cont, (cont + 3)).equals("GGG"))
				amino += "G";
			else if (RNA.substring(cont, (cont + 3)).equals("CAA")
					|| RNA.substring(cont, (cont + 3)).equals("CAG"))
				amino += "Q";
			else if (RNA.substring(cont, (cont + 3)).equals("CAU")
					|| RNA.substring(cont,(cont + 3)).equals("CAC"))
				amino += "H";
			else if (RNA.substring(cont, (cont + 3)).equals("AUU")
					|| RNA.substring(cont, (cont + 3)).equals("AUA")
					|| RNA.substring(cont, (cont + 3)).equals("AUC"))
				amino += "I";
			else if (RNA.substring(cont, (cont + 3)).equals("UUA")
					|| RNA.substring(cont, (cont + 3)).equals("UUG")
					|| RNA.substring(cont, (cont + 3)).equals("CUU")
					|| RNA.substring(cont, (cont + 3)).equals("CUC")
					|| RNA.substring(cont, (cont + 3)).equals("CUG")
					|| RNA.substring(cont, (cont + 3)).equals("CUA"))
				amino += "L";
			else if (RNA.substring(cont, (cont + 3)).equals("AAA")
					|| RNA.substring(cont, (cont + 3)).equals("AAG"))
				amino += "K";
			else if (RNA.substring(cont, (cont + 3)).equals("AUG"))
				amino += "M";
			else if (RNA.substring(cont, (cont + 3)).equals("CCU")
					|| RNA.substring(cont, (cont + 3)).equals("CCA")
					|| RNA.substring(cont, (cont + 3)).equals("CCC")
					|| RNA.substring(cont, (cont + 3)).equals("CCG"))
				amino += "P";
			else if (RNA.substring(cont, (cont + 3)).equals("AGU")
					|| RNA.substring(cont, (cont + 3)).equals("AGC")
					|| RNA.substring(cont, (cont + 3)).equals("UCA")
					|| RNA.substring(cont, (cont + 3)).equals("UCU")
					|| RNA.substring(cont, (cont + 3)).equals("UCC")
					|| RNA.substring(cont, (cont + 3)).equals("UCG"))
				amino += "S";
			else if (RNA.substring(cont, (cont + 3)).equals("UAU")
					|| RNA.substring(cont, (cont + 3)).equals("UAC"))
				amino += "X";
			else if (RNA.substring(cont, (cont + 3)).equals("ACA")
					|| RNA.substring(cont, (cont + 3)).equals("ACC")
					|| RNA.substring(cont, (cont + 3)).equals("ACU")
					|| RNA.substring(cont, (cont + 3)).equals("ACG"))
				amino += "T";
			else if (RNA.substring(cont, (cont + 3)).equals("UGG"))
				amino += "W";
			else if (RNA.substring(cont, (cont + 3)).equals("GUA")
					|| RNA.substring(cont, (cont + 3)).equals("GUU")
					|| RNA.substring(cont, (cont + 3)).equals("GUC")
					|| RNA.substring(cont, (cont + 3)).equals("GUG"))
				amino += "V";
			else if (RNA.substring(cont, (cont + 3)).equals("UAA")
					|| RNA.substring(cont, (cont + 3)).equals("UAG")
					|| RNA.substring(cont, (cont + 3)).equals("UGA"))
				amino += ".";
		}
		setAminoAcidos(amino);
	}
	
	//metodos de acesso
	public void setAminoAcidos(String aminoAcidos){
		this.aminoAcidos = aminoAcidos;
	}
	public String getAminoAcidos(){
		return aminoAcidos;
	}
}
