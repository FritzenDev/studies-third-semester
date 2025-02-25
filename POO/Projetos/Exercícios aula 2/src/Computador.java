/*Classe para representar um Computador: processador, placa-mãe, 
memória, hd, vídeo*/
public class Computador {
    String processador;
    String placaMae;
    String memoria;
    String hd;
    String video;
    
    public void escreveDados(){
        System.out.println("\nComputador: " + "\n\tProcessador: " + processador + "\n\tPlaca mãe: " + placaMae + "\n\tMemória ram: " + memoria
        + "\n\tHD: " + hd + "\n\tVídeo: " + video);
    }
}
