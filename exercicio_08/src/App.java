import java.util.Scanner;

public class App {

    public static void main(String[] args) {
//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
        double salariohora;
        double horatrabalhada;
        double salariomensal;

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Quanto você ganha por hora?");

            salariohora = teclado.nextDouble();

            System.out.println("Quantas horas você trabalha no mês?");

            horatrabalhada = teclado.nextDouble();

            salariomensal = salariohora * horatrabalhada;

            System.out.printf("Seu sálario mensal é de:%.1f", salariomensal);

        }

    }

}