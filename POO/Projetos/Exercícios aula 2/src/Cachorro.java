/*Classe para representar um Cachorro: raça, cor, idade, peso.*/
public class Cachorro {
    String raca;
    String cor;
    int idade;
    String peso;
    
    public void escreveDados(){
        System.out.println("\nCachorro: " + "\n\tRaça: " + raca + "\n\tCor: " + cor + "\n\tIdade: " + idade + "\n\tPeso(kg): " + peso);
    }
}
