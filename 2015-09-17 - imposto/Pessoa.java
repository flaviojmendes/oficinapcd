public class Pessoa {
	
	static int salario = 6000;

	public static double calcularImposto(double aliquota) {
		return salario * aliquota;
	}


	public static void main(String[] args) {

		double irpf = calcularImposto(0.27);
		double dizimo = calcularImposto(0.10);

		double impostoAnual = 0;
		for(int i=0 ; i < 12 ; i++) {
			impostoAnual += irpf+dizimo; 
		}

		System.out.println("IRPF " + irpf);
		System.out.println("DIZIMO " + dizimo);
		System.out.println("IMPOSTO ANUAL : " + impostoAnual);


	}

}