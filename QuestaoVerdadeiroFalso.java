package BancoQuestoesME2;

public class QuestaoVerdadeiroFalso extends Questao {
	private char respostaCorretaA;
	private char respostaCorretaB;
	private char respostaCorretaC;
	private char respostaMarcadaA;
	private char respostaMarcadaB;
	private char respostaMarcadaC;
	
	public QuestaoVerdadeiroFalso (String enunciado,String opcaoA, String opcaoB, 
	String opcaoC, double notaPadrao, char respostaCorretaA,char respostaCorretaB,
	char respostaCorretaC) {
		super(enunciado, opcaoA, opcaoB, opcaoC, notaPadrao);
		this.respostaCorretaA = respostaCorretaA;
		this.respostaCorretaB = respostaCorretaB;
		this.respostaCorretaC = respostaCorretaC;
	}
	public char getRespostaCorretaA() {
		return respostaCorretaA;
	}
	public void setRespostaCorretaA(char respostaCorretaA) {
		this.respostaCorretaA = respostaCorretaA;
	}
	public char getRespostaCorretaB() {
		return respostaCorretaB;
	}
	public void setRespostaCorretaB(char respostaCorretaB) {
		this.respostaCorretaB = respostaCorretaB;
	}
	public char getRespostaCorretaC() {
		return respostaCorretaC;
	}
	public void setRespostaCorretaC(char respostaCorretaC) {
		this.respostaCorretaC = respostaCorretaC;
	}
	
	public void marcaOpcao(char opcao, char respostaMarcada) {
		if(opcao == 'A') {
			this.respostaMarcadaA = respostaMarcada;
		}else if(opcao == 'B') {
			this.respostaMarcadaB = respostaMarcada;
		}else {
			this.respostaMarcadaC = respostaMarcada; 
		}
	}
	
	public double calculaNotaObtida() {
		if(respostaMarcadaA == respostaCorretaA) {
			notaObtida += (getNotaPadrao() /3);
			
		}
		if (respostaMarcadaB == respostaCorretaB) {
			notaObtida += getNotaPadrao() /3;
			
		}
		if(respostaMarcadaC == respostaCorretaC) {
			notaObtida += getNotaPadrao() / 3;
		
		}
		return notaObtida;
	}
	
	@Override
	public String toString() {
		return "\n\n*** Questão Verdadeiro ou Falso ***\n\nNúmero               :"+ getIdQuestao()+
				"\n\nEnunciado  :"+getEnunciado()+
				"\n\nA - "+ getOpcaoA() 
				+ "\nB - " + getOpcaoB()
				+ "\nC - " + getOpcaoC()
				+ "\n\nNota da questão :" + getNotaPadrao()+ "\n";
				
				
	}
	
}
