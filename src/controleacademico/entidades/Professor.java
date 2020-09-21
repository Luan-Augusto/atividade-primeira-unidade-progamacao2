package controleacademico.entidades;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

	private List<Turma> turmas;

	public Professor(String cpf, String nome, String telefone, String email) {
		super(cpf, nome, telefone, email);
		this.turmas = new ArrayList<Turma>();
	}

	public List<Turma> getTurma() {
		return turmas;
	}

	public void setTurma(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public void adicionarTurma(Turma turma) {
		turmas.add(turma);
	}
}
