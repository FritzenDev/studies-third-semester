/*Classe para representar um Livro: autor, nº de páginas, título*/
public class Livro {
    String autor;
    int nuPaginas;
    String titulo;
    
    public void escreveDados(){
        System.out.println("\nLivro: " + "\n\tAutor: " + autor + "\n\tN° de páginas: " + nuPaginas + "\n\tTítulo: " + titulo);
    }
}
