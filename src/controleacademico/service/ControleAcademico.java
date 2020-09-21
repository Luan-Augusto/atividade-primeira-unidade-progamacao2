package controleacademico.service;

import java.util.ArrayList;
import java.util.List;

import controleacademico.entidades.Aluno;
import controleacademico.entidades.Curso;
import controleacademico.entidades.Professor;
import controleacademico.entidades.Turma;

// Classe responsavel por inicializar o programa
public class ControleAcademico {

	private List<Aluno> alunos;
	private List<Professor> professores;
	private List<Curso> cursos;
	private List<Turma> turmas;

	public ControleAcademico(List<Aluno> alunos, List<Professor> professores, List<Curso> cursos, List<Turma> turmas) {
		this.alunos = new ArrayList<>();
		this.professores = new ArrayList<>();
		this.cursos = new ArrayList<>();
		this.turmas = new ArrayList<>();
	}

	public void cadastrarCurso(Curso curso) {
		cursos.add(curso);
	}

	public void cadastrarProfessor(Professor professor) {
		professores.add(professor);
	}

	public void cadastrarTurma(int ano, int semestre, String disciplina, String nomeCurso, String cpfProfessor) {
//		TODO - Implementar
		Curso curso = null;
		for (Curso c : cursos) {
			if (c.getNome().equals(nomeCurso)) {
				curso = c;
			}
		}
		Professor pf = null;
		for (Professor p : professores) {
			if (p.getCpf().equals(cpfProfessor)) {
				pf = p;
			}
		}

		Turma t = new Turma();
		t.setCurso(curso);
		t.setAno(ano);
		t.setSemestre(semestre);
		t.setDisciplina(disciplina);
		t.setCurso(curso);
		t.setProfessor(pf);
		turmas.add(t);
	}

	public void matricularAluno(Aluno aluno, int ano, int semestre, String disciplina, String nomeCurso) {
//		TODO - Implementar
		alunos.add(aluno);
	}

	public List<Aluno> getTodosOsAluno() {
		return alunos;
	}

	public List<Aluno> getTodosOsAlunosDaTurma(int ano, int semestre, String disciplina, String nomeCurso) {
//		TODO - Implementar
		return alunos;
	}

	public Professor getProfessorDaTurma(int ano, int semestre, String disciplina, String nomeCurso) {
//		TODO - Implementar
		for (Professor p : professores) {

		}
		return null;
	}

	public static void main(String[] args) {

	}

}
