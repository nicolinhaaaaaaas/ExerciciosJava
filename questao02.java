import java.util.*;

public class media {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int nmr1 = scanner.nextInt();
		System.out.print("Digite o segundo numero: ");
		int nmr2 = scanner.nextInt();
		System.out.print("Digite o terceiro numero: ");
		int nmr3 = scanner.nextInt();
		
		int soma = nmr1 + nmr2 + nmr3;
		int media = soma/3;
		
		System.out.println("A soma dos numeros eh: "+soma);
		System.out.println("A media dos numeros eh: "+media);
	}
}
