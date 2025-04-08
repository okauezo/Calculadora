import java.util.Scanner;

    public class Calculadora { public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System .out.print("Digite o Primeiro numero: ");
        double n1 =scanner.nextDouble();

        System .out.print("Digite o Segundo numero: ");
        double n2 =scanner.nextDouble();

        System .out.print("Digite a opecao que deseja utilizar: ( +, -, *, / ): ");
        char opcao = scanner.next().charAt(0);

        double resultado = 0;

        switch (opcao) {
            case '+':
                resultado = n1 + n2;
                break;

            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;

            case '/':
                if (n2 == 0) {
                    System.out.println("Erro: Divisão por 0");
                    return;
                }
                resultado = n1 / n2;
                break;
            default:
                System.out.println("Operação não suportada");
                return;
        }

        System.out.println("Resultado do Calculo efetuado: " + resultado);
    }
}
