/*Desafio Pensionato*/

import java.util.Scanner;

public class DesafioPensionato {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    Estudante[] vect = new Estudante[10];

    System.out.print("Digite o número de estudantes que alugarão quartos: ");
    int N = leitor.nextInt();
    leitor.nextLine();

    if(N > 0) {
        for (int i = 0; i < N; i++) {
            System.out.println("Está sendo realizado o registro do estudante " + (i + 1));
            System.out.print("Digite o nome do estudante: ");
            String nome = leitor.nextLine();
            System.out.print("Digite o e-mail do estudante: ");
            String email = leitor.nextLine();
            System.out.print("Digite o quarto que deseja se hospedar: ");
            int numeroQuarto = leitor.nextInt();
            leitor.nextLine();
            vect[numeroQuarto] = new Estudante(nome,email);
        }
        for (int z = 0; z < 10; z++) {
            if (vect[z] != null) {
                System.out.print("Quarto "+z+ " ocupado por:");
                System.out.println(vect[z]);
            }
        }

    }
    leitor.close();
    }
}
