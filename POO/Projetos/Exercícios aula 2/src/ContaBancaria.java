/*Classe para representar uma conta bancária: saldo, limite, proprietário*/
public class ContaBancaria {
    int saldo;
    int limite;
    String proprietario;
    
    public void escreveDados(){
        System.out.println("\nConta bancária: " + "\n\tSaldo: " + saldo + "\n\tLimite: " + limite + "\n\tProprietário: " + proprietario);
    }
}
