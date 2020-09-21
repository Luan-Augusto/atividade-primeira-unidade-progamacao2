package controleacademico.entidades;

public class Aluno extends Pessoa {

	private static int nextRegistration = 0;
	private String matricula;

	public Aluno(String cpf, String nome, String telefone, String email, String matricula) {
		super(cpf, nome, telefone, email);
		this.matricula = matricula;
	}

	public static int getNextRegistration() {
		return nextRegistration;
	}

	public static void setNextRegistration(int nextRegistration) {
		Aluno.nextRegistration = nextRegistration;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
