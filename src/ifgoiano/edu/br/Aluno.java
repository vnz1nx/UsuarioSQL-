package ifgoiano.edu.br;

public class Aluno {

	private int id;
	private String nome;
	private int idade;
	private String email;
	private String observacao;

	public Aluno(String nome, int idade, String email, String observacao) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.observacao = observacao;
	}
	
	public Aluno() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
