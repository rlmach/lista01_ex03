import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite outro número: ");
        double num2 = sc.nextDouble();
        sc.close();
        double soma = num1 + num2;

        System.out.println("A soma dos dois números foi de " + soma);
    }
}
