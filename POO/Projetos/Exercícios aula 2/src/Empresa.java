/* Classe para representar uma empresa: nome, área de atuação, qtd 
funcionários*/
public class Empresa {
    String nome;
    String areaAtuacao;
    int qtdFuncionarios;
    
    public void escreveDados(){
        System.out.println("\nEmpresa: " + "\n\tNome: " + nome + "\n\tÁrea de atuação: " + areaAtuacao + "\n\tQuantidade de funcionários: " + qtdFuncionarios);
    }
}
