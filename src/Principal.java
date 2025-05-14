import br.com.gilvaneidemedeiros.conversor.Conversor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String apiKey = "f0e4deff2a999da269935510";
        Conversor conversor = new Conversor(apiKey);

        System.out.println("******************************************");
        System.out.println("---- BEM VINDO AO CONVERSOR DE MOEDAS ----");
        System.out.println("******************************************");

        boolean continuar = true;

        Scanner leitura = new Scanner(System.in);

        while (continuar) {
            System.out.println("\nEscolha uma opção");

            String menu = """
                    1 - Real =>> Dólar
                    2 - Real =>> Peso Argentino
                    3 - Real =>> Euro
                    4 - Real =>> Libra Esterlina
                    5 - Real =>> Peso uruguaio
                    6 - Real =>> Guarani paraguaio
                    7 - Real =>> Peso Chileno
                    8 - Real =>> Dólar Canadense
                    9 - Real =>> Kwanza angolano
                    10 - Real =>> Coroa dinamarquesa
                    0 - Sair
                    """;

            System.out.println("\n" + menu);

            try {
                System.out.println("\nDigite a opção desejada: ");
                int opcao = leitura.nextInt();

                if (opcao == 0) {
                    System.out.println("Saindo...");
                    continuar = false;
                    break;
                }

                System.out.println("\nDigite o valor a ser convertido: ");
                double valorAConverter = leitura.nextDouble();

                if (valorAConverter <= 0) {
                    System.out.println("Valor inválido!");
                    continue;
                }

                String baseCurrency = "";
                String targetCurrency = "";

                switch (opcao) {
                    case 1:
                        baseCurrency = "BRL";
                        targetCurrency = "USD";
                        break;
                    case 2:
                        baseCurrency = "BRL";
                        targetCurrency = "ARS";
                        break;
                    case 3:
                        baseCurrency = "BRL";
                        targetCurrency = "EUR";
                        break;
                    case 4:
                        baseCurrency = "BRL";
                        targetCurrency = "GBP";
                        break;
                    case 5:
                        baseCurrency = "BRL";
                        targetCurrency = "UYU";
                        break;
                    case 6:
                        baseCurrency = "BRL";
                        targetCurrency = "PYG";
                        break;
                    case 7:
                        baseCurrency = "BRL";
                        targetCurrency = "CLP";
                        break;
                    case 8:
                        baseCurrency = "BRL";
                        targetCurrency = "CAD";
                        break;
                    case 9:
                        baseCurrency = "BRL";
                        targetCurrency = "AOA";
                        break;
                    case 10:
                        baseCurrency = "BRL";
                        targetCurrency = "DKK";
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        leitura.close();
                        return;
                    default:
                        System.out.println("Opção inválida! Tente novamente!");
                        continue;
                }

                double valorConvertido = conversor.converte(baseCurrency, targetCurrency, valorAConverter);
                if (valorConvertido != 0.0) {
                    System.out.printf("\nValor convertido: %.2f %s", valorConvertido, targetCurrency);
                    System.out.println("\n");
                }

            } catch (InputMismatchException e) {
                System.out.println("\nErro! Valor inválido! Digite um numero. ");
                leitura.nextLine();
            }

        }

    }

}

