import java.util.*;

public class CDU {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero de 3 digitos: ");
		int num = scanner.nextInt();
		
		int c = num/100;
		int d = num % 100/10;
		int u = num % 10;
		
		//int numInv = c+ u*100 + d*10;
		System.out.println("Formato CDU: "+num);
		System.out.println("Formato UCD: "+u+c+d);
		
		//nao sei se era pra fazer assim, mas ta feito
	}

}
