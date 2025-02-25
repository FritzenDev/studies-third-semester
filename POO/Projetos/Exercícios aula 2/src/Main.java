
public class Main {
    public static void main(String[] args) {
        ArCondicionado a1 = new ArCondicionado();
        Cachorro c1 = new Cachorro();
        Circulo ci1 = new Circulo();
        Computador cp1 = new Computador();
        ContaBancaria cb1 = new ContaBancaria();
        Empresa e1 = new Empresa();
        Funcionario f1 = new Funcionario();
        Livro l1 = new Livro();
        Pessoa p1 = new Pessoa();
        Televisao t1 = new Televisao();
        
        a1.marca = "Electrolux";
        a1.modelo = "Springer";
        a1.potencia = "9000btu";
        a1.tipo = "Gelado";
        
        c1.cor = "Marrom";
        c1.idade = 8;
        c1.raca = "Poodle";
        
        ci1.raio = 10;
        
        cp1.hd = "Seagate 500gb";
        cp1.memoria = "Corsair 8gb";
        cp1.placaMae = "AsRock B360-M";
        cp1.processador = "i5 8400";
        cp1.video = "GTX 1060 6GB";
        
        cb1.proprietario = "Bruno";
        cb1.saldo = 9000;
        cb1.limite = 12000;
        
        e1.nome = "Epystemy";
        e1.areaAtuacao = "Softwares";
        e1.qtdFuncionarios = 2;
        
        f1.nome = "Kauã";
        f1.cargo = "Assistente da gerência";
        f1.salario = 1512;
        
        l1.autor = "Alyson";
        l1.nuPaginas = 300;
        l1.titulo = "As cronicas de LF";
        
        p1.nome = "Lucas";
        p1.altura = "1,70m";
        p1.idade = 19;
        p1.peso = "75kg";
        
        t1.marca = "Samsumg";
        t1.modelo = "Crystal 8800";
        t1.tamanho = 55;
        t1.tipoTela = "LED";
        
        a1.escreveDados();
        c1.escreveDados();
        ci1.escreveDados();
        cp1.escreveDados();
        cb1.escreveDados();
        e1.escreveDados();
        f1.escreveDados();
        l1.escreveDados();
        p1.escreveDados();
        t1.escreveDados();
    }
}
