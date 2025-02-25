/* Classe para representar um Funcionário: nome, cargo, salário*/
public class Funcionario {
    String nome;
    String cargo;
    int salario;
    
    public void escreveDados(){
        System.out.println("\nFuncionário: " + "\n\tNome: " + nome + "\n\tCargo: " + cargo + "\n\tSalário: " + salario);
    }
}
