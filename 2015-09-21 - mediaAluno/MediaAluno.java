/**
 * Created by flavio.mendes on 21/09/2015.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {

        int quantidadeAlunos = 0;

        float totalSalarios = 0;
        float mediaSalarial = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade de alunos?");
        quantidadeAlunos = sc.nextInt();


        List<Aluno> alunos = new ArrayList<Aluno>();

        // Inserir o salário de cada funcionário.
        for(int i=0 ; i<quantidadeAlunos ; i++) {

            Aluno aluno = new Aluno();
            System.out.println("Digite o nome do aluno");
            aluno.setNome(sc.next());
            System.out.println("Digite a nota do 1 bimestre");
            aluno.setNota1(sc.nextFloat());
            System.out.println("Digite a nota do 2 bimestre");
            aluno.setNota2(sc.nextFloat());
            System.out.println("Digite a nota do 3 bimestre");
            aluno.setNota3(sc.nextFloat());
            System.out.println("Digite a nota do 4 bimestre");
            aluno.setNota4(sc.nextFloat());


            alunos.add(aluno);
        }

        
        for(Aluno aluno : alunos) {
            float nota = aluno.getNota1() +
                        aluno.getNota2() +
                        aluno.getNota3() +
                        aluno.getNota4();

            float media = nota/4;

            if(media >= 5) {
                System.out.println(aluno.getNome() + " passou!");
            } else {
                System.out.println(aluno.getNome() + " nao passou!");
            }

        }




    }

}