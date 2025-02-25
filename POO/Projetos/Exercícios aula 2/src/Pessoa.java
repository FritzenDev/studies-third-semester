/* Classe para representar uma Pessoa: nome, idade, altura, peso */
public class Pessoa {

    String nome;
    int idade;
    String altura;
    String peso;

    public void escreveDados() {
        System.out.println("Pessoa: " + "\n\tNome: " + nome + "\n\tIdade: " + idade + "\n\tAltura: " + altura + "\n\tPeso: " + peso);
    }
}
