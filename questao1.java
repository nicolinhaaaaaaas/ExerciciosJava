import java.util.*;

public class area {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do lado deste quadrado: ");
		int lado = scanner.nextInt();
		
		int area = lado*lado;
		
		System.out.println("A area do quadrado eh: "+area);
	}
}
