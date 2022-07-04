import java.util.ArrayList;
import java.util.List;

public class Alunos {
	
	private String matricula;
	private String nome;
	private String CPF;
	private List<Avaliacao> avaliacoes = new ArrayList<>();
	
	public Alunos(String NumMatricula, String nome, String CPF) {
		this.NumMatricula = matricula;
		this.nome = nome;
		this.CPF = CPF;
	}
	
	public void addAvaliacoes(Avaliacoes avaliacoes) {
		this.avaliacoes.add(avaliacoes);
		avaliacoes.setAlunos(this);
	}
	
	public String getNumMatricula() {
		return matricula;
	}
	public void setNumMatricula(String NumMatricula) {
		this.NumMatricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	
	public Double mediaAlunos() {
		double sum = 0;
		int peso = 0;
		for (Avaliacao avaliacao : getAvaliacoes()) {
			sum += avaliacao.calculaNota();
			peso += avaliacao.getPeso();
		}
		return sum/peso;
	}
}
