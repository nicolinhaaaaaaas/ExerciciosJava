import java.util.*;

public class loja {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double preco;
		
		System.out.println("Seja muito bem-vindo a loja mais foda da cidade");
		System.out.println("Temos promocoes nos setores de Eletros, e no setor de Cama mesa e banho.");
		System.out.print("Para escolher o setor basta digitar seu codigo (111) para CMB e (222) para Eletros: ");
		int codigo = scanner.nextInt();
		
		switch(codigo) {
			case 111:
				System.out.println("Bem vindo ao setor de Cama Mesa e Banho");
				System.out.print("Digite o valor da sua compra: ");
				double valor = scanner.nextDouble();
				
				if(valor >= 100.00) { // as contas não tão funcionando, n sei pq
					preco = valor - valor*(40/100);
					System.out.println("Preco original: "+valor+" ; Preco final, com 40% de desconto: "+preco);
				} else if(valor >= 50.00 && valor <100.00) {
					preco = valor - valor*(20/100);
					System.out.println("Preco original: "+valor+" ; Preco final, com 20% de desconto: "+preco);
				} else if(valor < 50.00) {
					preco = valor - valor*(10/100);
					System.out.println("Preco original: "+valor+" ; Preco final, com 10% de desconto: "+preco);
				} else {
					System.out.println("Bagayaya");
				}
				break;
				
			case 222:
				System.out.println("Bem vindo ao setor de Eletros");
				System.out.print("Digite o valor da sua compra: ");
				valor = scanner.nextDouble();
				
				if(valor >= 500.00) {
					preco = valor - valor*(10/100);
					System.out.println("Preco original: "+valor+" ; Preco final, com 10% de desconto: "+preco);
				} else {
					System.out.println("Valor da sua compra: "+valor);
				}
				break;
				
			default:
				System.out.println("Setor invalido");
				break;
		}
	}
}
