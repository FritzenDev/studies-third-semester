
public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome = "Maria";
        p1.idade = 30;
        p1.cpf = "009.432.676-30";
        
        p2.nome = "José";
        p2.idade = 27;
        p2.cpf = "059.532.61-90";
        
        p1.escreveDados();
        p2.escreveDados();
    }
}
