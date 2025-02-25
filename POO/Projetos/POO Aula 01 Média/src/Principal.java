
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        double nota1, nota2, media;
	Scanner s = new Scanner(System.in);
	
	System.out.println("Digite a nota 1");
	nota1 = s.nextDouble();
	System.out.println("Digite a nota 2");
	nota2 = s.nextDouble();
        
        media = (nota1 + nota2) / 2;
        System.out.println("A média é: "+media);
    }
}
