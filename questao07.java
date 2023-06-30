import java.util.*;

public class maior {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int nmr1 = scanner.nextInt();
		System.out.print("Digite o segundo valor: ");
		int nmr2 = scanner.nextInt();
		System.out.print("Digite o terceiro valor: ");
		int nmr3 = scanner.nextInt();
		
		int maior1 = Math.max(nmr1, nmr2);
		int maior2 = Math.max(nmr2, nmr3);
		
		int maiorfinal = Math.max(maior1, maior2);
		
		System.out.println("O maior valor é: "+maiorfinal);
		
		//se era assim, não sei, mas ta ai
	}
}
