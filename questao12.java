import java.util.*;
public class fevereiro {

	public static void main(String[] args) {
		//só pra avisar que não se era assim
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha algum dia do mes de fevereiro de 2015 (1 a 28): ");
		int data = scanner.nextInt();
		
		switch(data) {
		case 1:
		case 8:
		case 15:
		case 22:
			System.out.println("O dia "+data+" era um Domingo");
		break;
		
		case 2:
		case 9:
		case 16:
		case 23:
			System.out.println("O dia "+data+" era uma Segunda-Feira");
		break;
		
		case 3:
		case 10:
		case 17:
		case 24:
			System.out.println("O dia "+data+" era uma Terca-Feira");
		break;
		
		case 4:
		case 11:
		case 18:
		case 25:
			System.out.println("O dia "+data+" era uma Quarta-Feira");
		break;
		
		case 5:
		case 12:
		case 19:
		case 26:
			System.out.println("O dia "+data+" era uma Quinta-Feira");
		break;
		
		case 6:
		case 13:
		case 20:
		case 27:
			System.out.println("O dia "+data+" era uma Sexta-Feira");
		break;
		
		case 7:
		case 14:
		case 21:
		case 28:
			System.out.println("O dia "+data+" era um Sabado");
		break;
		}
	}
}
