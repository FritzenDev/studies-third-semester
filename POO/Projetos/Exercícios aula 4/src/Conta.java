/*
 Crie a classe Conta a qual deve ser composta pelos atributos titulo, valor e 
paga. O atributo “paga” deve ser do tipo boolean, A classe deve possuir 
seus atributos privados, pelo menos um construtor que inicialize todos os 
atributos e o método toString. Ao imprimir um objeto do tipo “conta” a 
exibição do resultado deve ser semelhante à vista abaixo:
Crie uma classe Principal, instancie um objeto e o imprima para cada 
uma das classes criadas acima.
*/
public class Conta {
    private String titulo;
    private double valor;
    private boolean paga;  

    public Conta(String titulo, double valor, boolean paga) {
        this.titulo = titulo;
        this.valor = valor;
        this.paga = paga;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }
    
    @Override
    public String toString() {
        return "Conta:" + "\n\tTitulo: " + titulo + "\n\tValor: " + valor + "\n\tPaga: " + (paga ? "Sim" : "Não");
    }    
}
