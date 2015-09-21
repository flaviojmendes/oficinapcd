/**
 * Created by flavio.mendes on 21/09/2015.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {

        int quantidadeFuncionarios = 0;

        float totalSalarios = 0;
        float mediaSalarial = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade de funcionarios?");
        quantidadeFuncionarios = sc.nextInt();


        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        // Inserir o salário de cada funcionário.
        for(int i=0 ; i<quantidadeFuncionarios ; i++) {
            System.out.println("Digite o salario do funcionario " + i);
            Funcionario funcionario = new Funcionario();
            funcionario.setSalario(sc.nextFloat());
            funcionarios.add(funcionario);
        }

        // Calcular a média de salário dos funcionários.
        for(Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.getSalario();
        }

        mediaSalarial = totalSalarios / quantidadeFuncionarios;
        System.out.println("Media Salarial = " + mediaSalarial);

    }

}