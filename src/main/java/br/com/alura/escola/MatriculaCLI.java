package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricula.AlunoDto;
import br.com.alura.escola.aplicacao.aluno.matricula.MatriculaDeAluno;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatriculaCLI {
	
	private MatriculaCLI() {
	}

	public static void main(String[] args) {
		String nome = "Fulano";
		String cpf = "149.901.012-22";
		String email = "fulano@email.com";
		
		MatriculaDeAluno matricula = new MatriculaDeAluno(new RepositorioDeAlunosEmMemoria());
		matricula.matricular(new AlunoDto(nome, cpf, email));
	}
	
}
