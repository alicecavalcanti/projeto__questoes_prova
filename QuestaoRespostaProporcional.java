package BancoQuestoesME2;

public class QuestaoRespostaProporcional extends Questao {
	int percentualOpcaoA;
	int percentualOpcaoB;
	int percentualOpcaoC;
	char opcaoMarcada;
	
	public QuestaoRespostaProporcional(String enunciado,String opcaoA, String opcaoB, String opcaoC, 
	double notaPadrao, int percentualOpcaoA,  int percentualOpcaoB,  int percentualOpcaoC) {
		super(enunciado,opcaoA, opcaoB, opcaoC, notaPadrao);
		this.percentualOpcaoA = percentualOpcaoA;
		this.percentualOpcaoB = percentualOpcaoB;
		this.percentualOpcaoC = percentualOpcaoC;
	}
	
	public int getPercentualOpcaoA() {
		return percentualOpcaoA;
	}
	public void setPercentualOpcaoA(int percentualOpcaoA) {
		this.percentualOpcaoA = percentualOpcaoA;
	}
	public int getPercentualOpcaoB() {
		return percentualOpcaoB;
	}
	public void setPercentualOpcaoB(int percentualOpcaoB) {
		this.percentualOpcaoB = percentualOpcaoB;
	}
	public int getPercentualOpcaoC() {
		return percentualOpcaoC;
	}
	public void setPercentualOpcaoC(int percentualOpcaoC) {
		this.percentualOpcaoC = percentualOpcaoC;
	}
	
	public void opcaoMarcada(char opcaoMarcada) {
		this.opcaoMarcada = opcaoMarcada;
	}
	public double calculaNotaObtida() {
		if(opcaoMarcada == 'A') {
			notaObtida =   getNotaPadrao() * percentualOpcaoA/100;
		}else if (opcaoMarcada == 'B') {
			notaObtida =  getNotaPadrao() * percentualOpcaoB/100;
		}else {
			notaObtida =  getNotaPadrao() * percentualOpcaoC/100;
		}
		return notaObtida;
	}
	
	@Override
	public String toString() {
		return "\n\n*** Questao Resposta Proporcional ***\n\n Pontuacao das alternativas: 25%, 50% e 100% \n\nNúmero               :"+ getIdQuestao()+
				"\n\nEnunciado  :"+getEnunciado()+
				"\n\nA - "+ getOpcaoA() 
				+ "\nB - " + getOpcaoB()
				+ "\nC - " + getOpcaoC()
				+ "\n\nNota da questao :" + getNotaPadrao()+ "\n";
				
				
	}
	
}
