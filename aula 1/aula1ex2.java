import java.util.Scanner;

public class aula1ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota A1: ");
        double a1 = scanner.nextDouble();

        System.out.print("Digite a nota A2: ");
        double a2 = scanner.nextDouble();

        System.out.print("Digite a porcentagem de presença do aluno: ");
        double presenca = scanner.nextDouble();

        double media = (a1 + (2 * a2)) / 3;

        System.out.println("Média: " + media);
        System.out.println("Presença: " + presenca + "%");

        if (presenca >= 75) {
            if (media >= 5) {
                System.out.println("Aprovado");
            } else if (media >= 3) {
                System.out.println("RE");
            } else {
                System.out.println("Reprovado");
            }
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
