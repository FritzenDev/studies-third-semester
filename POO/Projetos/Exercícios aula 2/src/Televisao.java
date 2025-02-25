/*Classe para representar uma Televisão: marca, modelo, tamanho, tipo de 
tela*/
public class Televisao {
    
    String marca;
    String modelo;
    int tamanho;
    String tipoTela;
    
    public void escreveDados() {
        System.out.println("\nTelevisão: " + "\n\tMarca: " + marca + "\n\tModelo: " + modelo + "\n\tTamanho: " + tamanho + "\n\tTipo de tela: " + tipoTela);
    }
}
