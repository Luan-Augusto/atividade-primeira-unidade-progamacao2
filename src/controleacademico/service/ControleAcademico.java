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

	public ControleAcademico() {
		super();
	}

	public void matricular(Aluno aluno) {
		alunos.add(aluno);
	}

	public void cadastrarCurso(Curso curso) {
		cursos.add(curso);
	}

	public void cadastrarProfessor(Professor professor) {
		professores.add(professor);
	}

//	Cadastrar uma turma
	public void cadastrarTurma(int ano, int semestre, String disciplina, String nomeCurso, String cpfProfessor) {
		Curso curso = null;
		for (Curso c : cursos) {
			if (c.getNome().equals(nomeCurso)) {
				curso = c;
				break;
			}
		}
		Professor pf = null;
		for (Professor p : professores) {
			if (p.getCpf().equals(cpfProfessor)) {
				pf = p;
				break;
			}
		}

		Turma t = new Turma(ano, semestre, disciplina, curso, pf);
//		t.setAno(ano);
//		t.setSemestre(semestre);
//		t.setDisciplina(disciplina);
//		t.setCurso(curso);
//		t.setProfessor(pf);
		turmas.add(t);
	}

	public void matricularAluno(Aluno aluno, Turma turma) {
		alunos.add(aluno);
	}

	public List<Aluno> getTodosOsAluno(Turma turma) {
		List<Aluno> alunosDataTurma = null;
		for (Turma t : turmas) {
			if (t.equals(turma)) {
				alunosDataTurma = t.getAlunos();
			}
		}
		return alunosDataTurma;
	}

	public List<Aluno> getTodosOsAlunosDaTurma(int ano, int semestre, String disciplina, String nomeCurso) {
		return alunos;
	}

	public Professor getProfessorDaTurma(Turma turma) {
		Professor professorRetorno = null;
		for (Turma t : turmas) {
			if (t.equals(turma)) {
				professorRetorno = t.getProfessor();
			}
		}
		return professorRetorno;
	}

	public static void main(String[] args) {

		ControleAcademico controle = new ControleAcademico();

		// Coloco as String sempre sem acentos ou caracteres UTF-8 pois
		// eles mudam de IDE para IDE
		Curso curso = new Curso("Sistemas de Informacao");
		controle.cadastrarCurso(curso);

		Professor professor = new Professor("000.000.000-00", "Girafalez", "3333-3333", "12343224");
		controle.cadastrarProfessor(professor);

//		TODO - Implementando os testes
	}

}
