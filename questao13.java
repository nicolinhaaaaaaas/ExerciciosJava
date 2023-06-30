import java.util.*;

public class megasena {

	public static void main(String[] args) {
		 //sinceramente, não entendi o que a questão queria, então ai vai qualquer coisa
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cartao da mega-sena:");
		System.out.println("01 02 03 04 05 06 07 08 09 10");
		System.out.println("11 12 13 14 15 16 17 18 19 20");
		System.out.println("21 22 23 24 25 26 27 28 29 30");
		System.out.println("31 32 33 34 35 36 37 38 39 40");
		System.out.println("41 42 43 44 45 46 47 48 49 50");
		System.out.println("51 52 53 54 55 56 57 58 59 60");
		
		System.out.println("");
		System.out.print("Escolha o primeiro numero: ");
		int nmr1 = scanner.nextInt();
		System.out.print("Escolha o segundo numero: ");
		int nmr2 = scanner.nextInt();
		System.out.print("Escolha o terceiro numero: ");
		int nmr3 = scanner.nextInt();
		System.out.print("Escolha o quarto numero: ");
		int nmr4 = scanner.nextInt();
		System.out.print("Escolha o quinto numero: ");
		int nmr5 = scanner.nextInt();
		System.out.print("Escolha o sexto numero: ");
		int nmr6 = scanner.nextInt();
		
		Random random = new Random();
        Set<Integer> numeros = new HashSet<>();
        
        while (numeros.size() < 6) {
            int numeroAleatorio = random.nextInt(60) + 1;
            numeros.add(numeroAleatorio);
        }
        
        System.out.println("Numeros que cairam na mega-sena: " + numeros);
        
        //não era isso que eu queria fazer, mas não consegui de outra forma, por enquanto.
	}
}
