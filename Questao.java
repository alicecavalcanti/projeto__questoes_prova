package BancoQuestoesME2;

public class Questao implements IQuestao {
	static private int ultimoId =0;
	private int idQuestao;
	private String enunciado;
	private String opcaoA;
	private String opcaoB;
	private String opcaoC;
	private double notaPadrao;
	protected double notaObtida = 0;
	public Questao(String enunciado,String opcaoA, String opcaoB, String opcaoC, double notaPadrao) {
		ultimoId++;
		idQuestao = ultimoId;
		this.enunciado = enunciado;
		this.opcaoA = opcaoA;
		this.opcaoB = opcaoB;
		this.opcaoC = opcaoC;
		this.notaPadrao = notaPadrao;
		
	}
	public int getIdQuestao() {
		return idQuestao;
	}
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String getOpcaoA() {
		return opcaoA;
	}
	public void setOpcaoA(String opcaoA) {
		this.opcaoA = opcaoA;
	}
	public String getOpcaoB() {
		return opcaoB;
	}
	public void setOpcaoB(String opcaoB) {
		this.opcaoB = opcaoB;
	}
	public String getOpcaoC() {
		return opcaoC;
	}
	public void setOpcaoC(String opcaoC) {
		this.opcaoC = opcaoC;
	}
	public double getNotaPadrao() {
		return notaPadrao;
	}
	public void setNotaPadrao(double notaPadrao) {
		this.notaPadrao = notaPadrao;
	}
	@Override
	public double calculaNotaObtida() {
		return 0;
	}
	
}
