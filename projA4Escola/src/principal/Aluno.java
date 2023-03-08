package principal;

public class Aluno extends Pessoa{
	
	private boolean bolsista;
	private int ra;
	private String curso;
	public Aluno(String nome, int idade, double peso, double altura, boolean bolsista, int ra, String curso) {
		super(nome, idade, peso, altura);
		this.bolsista = bolsista;
		this.ra = ra;
		this.curso = curso;
	}
	public Aluno() {
		super();
	}
	public boolean isBolsista() {
		return bolsista;
	}
	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
	
	

}
