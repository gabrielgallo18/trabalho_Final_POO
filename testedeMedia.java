import java.time.LocalDate;
import java.util.List;

public class TestedeMedia {

	public static void main(String[] args) {
				
		Aluno aluno1 = new Aluno("111aaa", "Matheus Zeferino", "999.555.111-88");
		Aluno aluno2 = new Aluno("222bbb", "Rafael Lima", "777.999.444-33");
		Aluno aluno3 = new Aluno("444ddd", "Gabriel Gallo", "001.000.000-00");
		
		aluno1.addAvaliacoes(prova1);
		System.out.println("Media do Aluno 1: "+aluno1.mediaAluno());
		
		aluno2.addAvaliacoes(prova2);
		System.out.println("Media do Aluno 2: "+aluno2.mediaAluno());

		aluno3.addAvaliacoes(prova3);
		System.out.println("Media do Aluno 3: "+aluno3.mediaAluno());

		
		Materia md = new Materia("matematica discreta", 70);
		md.getAlunos().addAll(List.of(aluno1, aluno2, aluno3));
		
		md.mediaMateria();
	}

}
