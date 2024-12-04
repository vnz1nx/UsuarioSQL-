package ifgoiano.edu.br;

import java.util.Scanner;

public class Principal {
	
	public Principal() {
		Scanner s = new Scanner(System.in);
		int op = -1;
		while(true) {
			System.out.println("Digite uma opção:");
			System.out.println("1: Registrar");
			System.out.println("2: Excluir");
			System.out.println("0: Sair");
			op = s.nextInt();
			switch(op) {
				case 0:
					return;
				case 1:
					cadastrar();
					System.out.println("Cadastrado com sucesso!!!");
					break;
				case 2: 
					excluir();
					System.out.println("Excluído com sucesso!!!");
					break;
			}
		}
	}
	
	public void cadastrar() {
		Scanner s = new Scanner(System.in);
		Aluno a = new Aluno();
		System.out.println("Nome: ");
		a.setNome(s.nextLine());
		System.out.println("E-mail: ");
		a.setEmail(s.nextLine());
		System.out.println("Observação: ");
		a.setObservacao(s.nextLine());
		System.out.println("Idade: ");
		a.setIdade(s.nextInt());
		AlunoDAO dao = new AlunoDAO();
		dao.insert(a);
	}
	
	public void excluir() {
		Scanner s = new Scanner(System.in);
		Aluno a = new Aluno();
		System.out.println("Selecione o código do usuário");
		a.setId(s.nextInt());
		AlunoDAO dao = new AlunoDAO();
		dao.remove(a);
	}

	public static void main(String[] args) {
		new Principal();
	}

}
