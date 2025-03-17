
public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("Luz", 200, false);
        Filme f1 = new Filme("Senhor dos pastéis", 2025);
        System.out.println(c1);
        System.out.println(f1);
        
        Ponto p1 = new Ponto(10, 10);
        p1.baixo(5);
        p1.esquerda(2);
        System.out.println(p1);
    }
}
