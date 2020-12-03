class Operação {

	public static int multiplicação(int n1, int n2) {
		return (n1 * n2);
	}
	
	public static int divisão(int n1, int n2) {
		return (n1 / n2);
	}

}

public class funcao_MultDiv {
	
	public static void main(String[] args) {
		int n1 = 25, n2 = 5;
		
		System.out.println("O resultado de " +n1+ " X " +n2+ " é: " +Operação.multiplicação(n1,n2));
		System.out.println("O resultado de " +n1+ " ÷ " +n2+ " é: " +Operação.divisão(n1,n2));
	}
}
