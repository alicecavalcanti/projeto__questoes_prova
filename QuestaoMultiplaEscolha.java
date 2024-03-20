package BancoQuestoesME2;

public class QuestaoMultiplaEscolha extends Questao {
	private char opcaoCorreta;
	private char opcaoMarcada;
	
	public QuestaoMultiplaEscolha ( String enunciado,String opcaoA,
	String opcaoB, String opcaoC, double notaPadrao, char opcaoCorreta) {
		super(enunciado, opcaoA, opcaoB, opcaoC, notaPadrao);
		this.opcaoCorreta = opcaoCorreta;
	}
	
	public char getOpcaoCorreta() {
		return opcaoCorreta;
	}
	public void setOpcaoCorreta(char opcaoCorreta) {
		this.opcaoCorreta = opcaoCorreta;
	}
	public char getOpcaoMarcada() {
		return opcaoMarcada;
	}
	
	public void marcaOpcao(char opcaoMarcada) {
		this.opcaoMarcada = opcaoMarcada;
		
	}
	
	public double calculaNotaObtida() {
		if(opcaoMarcada == opcaoCorreta) {
			notaObtida = getNotaPadrao();
		}
		
		return notaObtida;
	}
	@Override
	public String toString() {
		return "\n\n*** Questão de Multipla Escolha ***\n\nNúmero               :"+ getIdQuestao()+
				"\n\nEnunciado  :"+getEnunciado()+
				"\n\nA - "+ getOpcaoA() 
				+ "\nB - " + getOpcaoB()
				+ "\nC - " + getOpcaoC()
				+ "\n\nNota da questão :" + getNotaPadrao()+ "\n";
				
				
	}

	
		
	
	
}
