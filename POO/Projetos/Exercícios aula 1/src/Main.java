/*
1. Escreva um algoritmo que leia 2 valores a e b. Logo após deve escrevêlos seguidos da mensagem "São múltiplos" ou "Não são múltiplos".

2. Escreva um algoritmo para repetir a leitura de um número enquanto o 
valor fornecido for diferente de 0. Para cada número fornecido, 
imprimir se ele é NEGATIVO ou POSITIVO. Quando o número 0 for 
fornecido a repetição de ser encerrada sem imprimir mensagem alguma.

3. Escreva um algoritmo para ler um valor X (validar para aceitar apenas 
valores entre 1(inclusive) e 10(inclusive) ). Escrever a tabuada de X no 
formato: X x 1 = n
 X x 2 = n

*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b;
        a = 10;
        b = 5;
        
        System.out.println("Exercício 1: ");
        if(a%b==0 || b%a==0){
            System.out.println("A e B são múltiplos");
        } else {
            System.out.println("A e B não são múltiplos");
        }
        
        int x = 5;
        System.out.println("\nExercício 2: ");
        for(int i = 5; x != 0; x--){
            System.out.println(x);
        }
        
        System.out.println("\nExercício 3: ");
        System.out.println("Digite a tabuada: ");
        int n = entrada.nextInt();
        System.out.println("\n");
        for(int i = 1; i < 11; i++){
            int resultado = n * i;
            System.out.println(resultado);
        }      
    }
}
