package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Circulo;
import br.senai.sp.jandira.model.Retangulo;

import java.util.Scanner;

public class GerenciadorFormas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executar = true;

        while (executar) {
            System.out.println("Escolha a forma geométrica: ");
            System.out.println("1. Círculo");
            System.out.println("2. Retângulo");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    System.out.println("Área do círculo: " + circulo.calcularArea());
                    System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Digite o comprimento do retângulo: ");
                    double comprimento = scanner.nextDouble();
                    System.out.print("Digite a largura do retângulo: ");
                    double largura = scanner.nextDouble();
                    Retangulo retangulo = new Retangulo(comprimento, largura);
                    System.out.println("Área do retângulo: " + retangulo.calcularArea());
                    System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    executar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}
