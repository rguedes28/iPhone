package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        iPhone iphone = new iPhone();
        int opcao;

        do {
            System.out.println("\n=== MENU IPHONE ===");
            System.out.println("1 - Reprodutor Musical");
            System.out.println("2 - Aparelho Telefônico");
            System.out.println("3 - Navegador Internet");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int subOpcaoMusica;
                    do {
                        System.out.println("\n--- REPRODUTOR MUSICAL ---");
                        System.out.println("1 - Tocar");
                        System.out.println("2 - Pausar");
                        System.out.println("3 - Selecionar Música");
                        System.out.println("4 - Voltar");
                        System.out.print("Escolha uma opção: ");
                        subOpcaoMusica = scanner.nextInt();

                        switch (subOpcaoMusica) {
                            case 1 -> iphone.tocar();
                            case 2 -> iphone.pausar();
                            case 3 -> {
                                System.out.print("Digite o nome da música: ");
                                scanner.nextLine(); // limpar buffer
                                String musica = scanner.nextLine();
                                iphone.selecionarMusica(musica);
                            }
                            case 4 -> System.out.println("Voltando ao menu principal...");
                            default -> System.out.println("Opção inválida!");
                        }
                    } while (subOpcaoMusica != 4);
                    break;

                case 2:
                    int subOpcaoTelefone;
                    do {
                        System.out.println("\n--- APARELHO TELEFÔNICO ---");
                        System.out.println("1 - Ligar");
                        System.out.println("2 - Atender");
                        System.out.println("3 - Correio de Voz");
                        System.out.println("4 - Voltar");
                        System.out.print("Escolha uma opção: ");
                        subOpcaoTelefone = scanner.nextInt();

                        switch (subOpcaoTelefone) {
                            case 1 -> {
                                System.out.print("Digite o número para ligar: ");
                                scanner.nextLine();
                                String numero = scanner.nextLine();
                                iphone.ligar(numero);
                            }
                            case 2 -> iphone.atender();
                            case 3 -> iphone.iniciarCorreioVoz();
                            case 4 -> System.out.println("Voltando ao menu principal...");
                            default -> System.out.println("Opção inválida!");
                        }
                    } while (subOpcaoTelefone != 4);
                    break;

                case 3:
                    int subOpcaoNavegador;
                    do {
                        System.out.println("\n--- NAVEGADOR INTERNET ---");
                        System.out.println("1 - Exibir Página");
                        System.out.println("2 - Adicionar Nova Aba");
                        System.out.println("3 - Atualizar Página");
                        System.out.println("4 - Voltar");
                        System.out.print("Escolha uma opção: ");
                        subOpcaoNavegador = scanner.nextInt();

                        switch (subOpcaoNavegador) {
                            case 1 -> {
                                System.out.print("Digite a URL: ");
                                scanner.nextLine();
                                String url = scanner.nextLine();
                                iphone.exibirPagina(url);
                            }
                            case 2 -> iphone.adicionarNovaAba();
                            case 3 -> iphone.atualizarPagina();
                            case 4 -> System.out.println("Voltando ao menu principal...");
                            default -> System.out.println("Opção inválida!");
                        }
                    } while (subOpcaoNavegador != 4);
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        scanner.close();
    }
}