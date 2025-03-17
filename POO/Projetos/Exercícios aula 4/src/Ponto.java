
public class Ponto {
    int x;
    int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void cima(int valor){
        y -= valor;
    }
    public void baixo(int valor){
        y += valor;
    }
    public void esquerda(int valor){
        x -= valor;
    }
    public void direita(int valor){
        x += valor;
    }

    @Override
    public String toString() {
        return "Ponto: " + "\n\tx: " + x + "\n\ty: " + y;
    }
}
