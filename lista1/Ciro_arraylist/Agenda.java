package POO.arraylist;

import java.util.ArrayList;

public class Agenda {
	int tamanho;
	static final int MAX = 10;
	ArrayList<Pessoa> pessoasArray;
	Pessoa[] pessoas;
	
	public Agenda() {
		tamanho = 0;
		
		pessoasArray = new ArrayList<Pessoa>();
		pessoas = new Pessoa[MAX];
		for(int i = 0; i < MAX; i++){
			pessoas[i] = new Pessoa("", 0, 0);
		}	
	}
	
	public void armazenaPessoa(String nome, int idade, int altura){
		if (tamanho < MAX) {
			Pessoa P = new Pessoa(nome, idade, altura);
			pessoasArray.add(P);

			tamanho = tamanho + 1;
		} else{
			System.out.println("Tamanho Maximo da agenda alcançado!");
		}
	}
	
	public void imprimeAgenda(){	
		for (Pessoa i: this.pessoasArray) {
			i.imprime();
		}
			
	}
	
	public void imprimePessoa(int index){
		if (index >= tamanho){
			System.out.println("\nIndice Inexistente!");
		} else {
			int j = 0;
			for (Pessoa i: this.pessoasArray) {
				if(j == index)
					i.imprime();
				else
					j++;
			}	
		}
	}
	
	public int buscaPessoa(String nome) {
		int j = 0;
		for (Pessoa i: this.pessoasArray) {
			if(i.getNome().equals(nome))
				return j;
			else
			  j++;
		}
		
		return -1;
	}
	
	public void removePessoa(String nome){
		int i = buscaPessoa(nome);
		
		if ( i == -1){
			System.out.println("\nPessoa não encontrada!");
		} else {
			this.pessoasArray.remove(i);
			
			tamanho = tamanho -1;
			System.out.println("\nPessoa Removida!");
		}
	}
	
	public int getTamanho() {
		return tamanho;
	}

}
