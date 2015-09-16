public class Calculadora {
	

	public static long somar(int num1, int num2) {
		return num1+num2;
	}

	public static long subtrair(int num1, int num2) {
		return num1-num2;
	}

	public static void main(String[] args) {

		long soma = somar(100, 250);
		long subtracao = subtrair(23, 893);

		System.out.println("Soma eh: " + soma);
		System.out.println("Subracao eh: " + subtracao);

	}




}