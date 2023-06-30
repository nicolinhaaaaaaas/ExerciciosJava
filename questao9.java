import java.util.*;

public class carta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nomeCarta = null;
		String nomeNaipe = null;
		
		System.out.print("Escreva o numero da carta: ");
		int carta = scanner.nextInt();
		System.out.print("Escolha o naipe da carta (1 = ouros ; 2 = paus ; 3 = copas ; 4 = espadas): ");
		int naipe = scanner.nextInt();
		
		if(carta == 1) {
			nomeCarta = "As";
		} else if(carta == 2) {
			nomeCarta = "Dois";
		} else if(carta == 3) {
			nomeCarta = "Tres";
		} else if(carta == 4) {
			nomeCarta = "Quatro";
		} else if(carta == 5) {
			nomeCarta = "Cinco";
		} else if(carta == 6) {
			nomeCarta = "Seis";
		} else if(carta == 7) {
			nomeCarta = "Sete";
		} else if(carta == 8) {
			nomeCarta = "Oito";
		} else if(carta == 9) {
			nomeCarta = "Nove";
		} else if(carta == 10) {
			nomeCarta = "Dez";
		} else if(carta == 11) {
			nomeCarta = "Valete";
		} else if(carta == 12) {
			nomeCarta = "Rainha";
		} else if(carta == 13) {
			nomeCarta = "Rei";
		} else {
			System.out.println("Carta nao existente");
		}
		
		if(naipe == 1) {
			nomeNaipe = "Ouros";
		} else if(naipe == 2) {
			nomeNaipe = "Paus";
		} else if(naipe == 3) {
			nomeNaipe = "Copas";
		} else if(naipe == 4) {
			nomeNaipe = "Espadas";
		} else {
			System.out.println("Naipe nao existente");
		}
		
		System.out.println("A sua carta eh "+nomeCarta+" de "+nomeNaipe);
		
	}
}
