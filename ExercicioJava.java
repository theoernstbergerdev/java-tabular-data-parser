import java.util.Scanner;

public class ExercicioJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] dados = new int[4][3];
        int valor;
        int acimaMedia = 0;

        for (int i = 0; i < dados.length; i++) {
            System.out.println("Pessoa " + (i + 1));
            for (int j = 0; j < dados[i].length; j++) {

                if (j == 0){
                    System.out.print("Digite o seu id: ");
                    valor = input.nextInt();
                }
                else if (j == 1) {
                    System.out.print("Digite a sua idade: ");
                    valor = input.nextInt();

                    while (valor < 0 || valor > 110) {
                        System.out.println("Idade inválida! Digite uma idade entre 0 e 110: ");
                        valor = input.nextInt();
                    }
                }

                else {
                    System.out.print("Digite o seu salario: ");
                    valor = input.nextInt();
                }

                dados[i][j] = valor;
            }
        }

        int maiorSalario = dados[0][2];
        int menorSalario = dados[0][2];
        int somaSalario = 0;

        for (int[] linha : dados) {

            int salario = linha[2];

            somaSalario += salario;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
            if (salario < menorSalario) {
                menorSalario = salario;
            }
        }
        double media = (double) somaSalario / dados.length;

        for (int[] linha : dados) {
            int salario = linha[2];

            if (salario > media) {
                acimaMedia++;
            }
        }

        System.out.println("\nPessoas com salário acima da média: " + acimaMedia);
        System.out.println("Maior Salário: " + maiorSalario);
        System.out.println("Menor Salário: " + menorSalario);
        System.out.println("Média dos salários: " + media);

        input.close();
    }
}
