/*Classe para representar um Ar-condicionado: marca, modelo, tipo, 
potência*/
public class ArCondicionado {
    String marca;
    String modelo;
    String tipo;
    String potencia;
    
    public void escreveDados(){
        System.out.println("\nAr condicionado: " + "\n\tMarca: " + marca + "\n\tModelo: " + modelo + "\n\tTipo: " + tipo + "\n\tPotência: " + potencia);
    }
}
