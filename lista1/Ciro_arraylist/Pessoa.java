package POO.arraylist;

public class Pessoa {
  private String nome;
  private int altura;
  private int idade;
  
  
  // construtor
  public Pessoa(String Nome, int Idade, int Altura){
	  nome = Nome;
	  idade = Idade;
	  altura = Altura;
  }
  
  public Pessoa() {
	// TODO Auto-generated constructor stub
  }

public void imprime(){
	  System.out.println("Nome: " + nome);
	  System.out.println("Idade: " + idade);
	  System.out.println("Altura: " + altura);
  }
  
  
  
  // Gets e Sets
  public int getAltura() {
	  return altura;
  }
  
  public int getIdade(){
	  return idade;
  }
  
  public String getNome(){
	  return nome;
  }
  
  public void setAltura(int Altura){
	  altura = Altura;
  }
  
  public void setIdade(int Idade){
	  idade = Idade;
  }
  
  public void setNome(String Nome){
	  nome = Nome;
  }
  
}
