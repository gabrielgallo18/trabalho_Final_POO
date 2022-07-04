import java.util.ArrayList;
import java.util.List;

public class Materia {
	
	private String id;
	private String nome;
	private List<Aluno> alunos = new ArrayList<>();
	

	public Materia(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Alunos> getAlunos() {
		return alunos;
	}
	
	public void mediaMateria() {
		double sum = 0;
		int cont = 0;
		for (Alunos alunos : getAlunos()) {
			sum += alunos.mediaAlunos();
			cont++;
		}
		System.out.println("Essas são as medias dos alunos na Materia: " + sum/cont);
	}
}
