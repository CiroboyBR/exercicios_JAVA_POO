package POO.conceitos;

public class Agenda {
	int tamanho;
	static final int MAX = 10;
	Pessoa[] pessoas;
	
	public Agenda() {
		tamanho = 0;
		pessoas = new Pessoa[MAX];
		for(int i = 0; i < MAX; i++){
			pessoas[i] = new Pessoa("", 0, 0);
		}	
	}
	
	public void armazenaPessoa(String nome, int idade, int altura){
		if (tamanho < MAX) {
			pessoas[tamanho].setNome(nome);
			pessoas[tamanho].setIdade(idade);
			pessoas[tamanho].setAltura(altura);
			
			tamanho = tamanho + 1;
		} else{
			System.out.println("Tamanho Maximo da agenda alcançado!");
		}
	}
	
	public void imprimeAgenda(){
		for(int i = 0; i < tamanho; i++){
			System.out.println("");
			pessoas[i].imprime();
			
		}
	}
	
	public void imprimePessoa(int index){
		if (index >= tamanho){
			System.out.println("\nIndice Inexistente!");
		} else {
			pessoas[index].imprime();
		}
	}
	
	public int buscaPessoa(String nome) {
		for(int i = 0; i < tamanho; i++){
			if (pessoas[i].getNome().equals(nome) ){
				return i;
			}
		}
		
		return -1;
	}
	
	public void removePessoa(String nome){
		int i = buscaPessoa(nome);
		if ( i == -1){
			System.out.println("\nPessoa não encontrada!");
		} else {
			for(int cont = i; cont < tamanho - 1; cont++){
				pessoas[cont].setNome(pessoas[cont+1].getNome());
				pessoas[cont].setIdade(pessoas[cont+1].getIdade());
				pessoas[cont].setAltura( pessoas[cont+1].getAltura());
			}
			
			tamanho = tamanho -1;
			System.out.println("\nPessoa Removida!");
		}
	}
	
	public int getTamanho() {
		return tamanho;
	}

}
