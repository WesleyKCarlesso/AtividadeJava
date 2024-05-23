import java.util.Scanner;

public class OperacoesComVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();
        int[] vetor = new int[n];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        float media = (float) soma / n;

        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        System.out.print("Digite a primeira posição para substituir (0 a " + (n - 1) + "): ");
        int pos1 = scanner.nextInt();
        System.out.print("Digite o novo valor para a posição " + pos1 + ": ");
        vetor[pos1] = scanner.nextInt();

        System.out.print("Digite a segunda posição para substituir (0 a " + (n - 1) + "): ");
        int pos2 = scanner.nextInt();
        System.out.print("Digite o novo valor para a posição " + pos2 + ": ");
        vetor[pos2] = scanner.nextInt();

        soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }
        media = (float) soma / n;

        System.out.println("Nova soma dos valores: " + soma);
        System.out.println("Nova média dos valores: " + media);

        scanner.close();
    }
}
