import java.util.*;

public class temperatura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma temperatura em graus Centigrados: ");
		double grau = scanner.nextDouble();
		
		double far = (grau*1.8)+32;
		
		System.out.println("A temperatura "+grau+" Celsius, em Farenheight, eh: "+far+" F.");
	}
}
