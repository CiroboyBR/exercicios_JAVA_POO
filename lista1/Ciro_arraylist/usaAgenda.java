package POO.arraylist;

import java.util.Scanner;

public class usaAgenda {

	public static void main(String[] args) {
		Agenda A = new Agenda();
		int op = 1, idade, altura;
		String nome;
		Scanner sc = new Scanner(System.in);
		
		
		// Loop do programa
		while (op != 0){
			System.out.println("\n1- Cadastrar");
			System.out.println("2- Listar Agenda");
			System.out.println("3- Imprime pessoa pelo indice");
			System.out.println("4- Imprime pos da pessoa pelo nome");
			System.out.println("5- Remove pessoa pelo nome");
			System.out.println("0- Sair");
			System.out.print("\nOpção: ");
			
			op = sc.nextInt();
			
			if (op == 1) {
				System.out.print("Nome: ");
				nome = sc.next();
				System.out.print("Idade: ");
				idade = sc.nextInt();
				System.out.print("Altura: ");
				altura = sc.nextInt();
				
				A.armazenaPessoa(nome, idade, altura);
			}else if (op == 2){
				A.imprimeAgenda();
			}else if (op == 3){
				System.out.print("Indice da Pessoa: ");
				int index = sc.nextInt();
				
				A.imprimePessoa(index);
			}else if (op == 4){
				System.out.print("Nome da Pessoa: ");
				nome = sc.next();
				
				System.out.print("Posição: " + A.buscaPessoa(nome) );
			}else if( op == 5) {
				System.out.print("Nome da Pessoa: ");
				nome = sc.next();
				
				A.removePessoa(nome);
			}
			
		}
		

	}

}
