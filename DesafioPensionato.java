/*Desafio Pensionato*/

import java.util.Scanner;

public class DesafioPensionato {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int[] quartos = new int[10];

    System.out.print("Digite o número de estudantes que alugarão quartos: ");
    int N = leitor.nextInt();
    leitor.nextLine();
    Estudante[] student = new Estudante[N];
    for(int i =0;i<N;i++){
        System.out.println("Está sendo realizado o registro do estudante " + (i+1));
        student[i] = new Estudante();
        System.out.print("Digite o nome do estudante: ");
        student[i].setNome(leitor.nextLine());
        System.out.print("Digite o e-mail do estudante: ");
        student[i].setEmail(leitor.nextLine());
        System.out.print("Digite o quarto que deseja se hospedar: ");
        student[i].setQuarto(leitor.nextInt());
        leitor.nextLine();
        System.out.println(student[i]);
    }

    leitor.close();
    }
}
