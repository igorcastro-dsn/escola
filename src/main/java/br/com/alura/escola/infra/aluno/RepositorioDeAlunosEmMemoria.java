package br.com.alura.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.exceptions.AlunoNaoEncontradoException;

/**
 * Implementação do respositório de alunos utilizando uma estrutura de dados em memória
 * @author igorcastro.dsn
 */
public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

	private List<Aluno> alunos = new ArrayList<>();
	
	@Override
	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
	}

	@Override
	public Aluno buscarPorCpf(CPF cpf) {
		return alunos.stream()
					 .filter(aluno -> aluno.getCpf().equals(cpf.getNumero()))
					 .findFirst()
					 .orElseThrow(() -> new AlunoNaoEncontradoException(cpf));
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		return this.alunos;
	}

}
