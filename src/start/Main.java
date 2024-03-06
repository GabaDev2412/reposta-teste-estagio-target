package start;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha;

        do {
            System.out.println("\nMenu de resolução das questões\n");
            System.out.print("1 - Qual será o valor da variável soma?\n" +
                    "2 - Informe um número para saber se pertence a Fibonacci.\n" +
                    "3 - Descubra a lógica e complete o próximo elemento.\n" +
                    "4 - Descobrindo que interruptor controla cada lâmpada.\n" +
                    "5 - Invertendo os caracteres de um String.\n" +
                    "0 - SAIR\n" +
                    "Escolha: ");
            escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    //resolucao para saber o valor final da variavel soma
                    int indice = 13, soma = 0, k = 0;

                    while (k < indice){
                        k = k + 1;
                        soma = soma + k;
                    }

                    System.out.println("O valor final da variável soma é: " + soma);
                    break;

                case 2:
                    //resolucao da verificao se o numero informado pertence a sequencia de Fibonacci
                    System.out.println("Digite um número para verificar se pertence à Fibonnaci: ");
                    int numero = sc.nextInt();

                    boolean pertence = verificarPertencimento(numero);

                    if (pertence){
                        System.out.println("O número " + numero + " pertence à sequência de Fibonnaci.");
                    } else {
                        System.out.println("O número " + numero + " não pertence à sequência de Fibonnaci.");
                    }
                    break;

                case 3:
                    //Descobrindo o proximo elemento seguindo a logica
                    System.out.println("a) 1, 3, 5, 7, ___ é 9;\n" +
                            "b) 2, 4, 8, 16, 32, 64, ___ é 128;\n" +
                            "c) 0, 1, 4, 9, 16, 25, 36, ___ é 49;\n" +
                            "d) 4, 16, 36, 64, ___ é 100;\n" +
                            "e) 1, 1, 2, 3, 5, 8, ___ é 13;\n" +
                            "f) 2, 10, 12, 16, 17, 18, 19, ___ é 200;");
                    break;

                case 4:
                    //Lógicar para descobrir qual lampada cada interruptor controla
                    System.out.println("A lógica é um tando simples, em um primeiro momento enúmeros os interruptores em 1, 2 e 3\n" +
                            "deixamos ligado os interruptores 1 e 2, o 3 deixamos desligado, assim na primeira ida a sala já\n" +
                            "encontrariamos a lâmpada do interrupitor 3, em um segundo momento apagamos o interruptor 1 e deixamos\n" +
                            "ligados o 2 e o 3, assim na segunda ida já iremos saber a lâmpada do interruptor 1 e como já sabemos a\n" +
                            "lâmpada do interruptor 3, por eliminação encontrariamos a lâmpada do interruptor 2.");
                    break;

                case 5:
                    //Invertendo os caracteres de um String
                    sc.nextLine();
                    System.out.println("Digite uma string para inverter: ");
                    String textoOriginal = sc.nextLine();

                    System.out.println("String invertida: " + inverterString(textoOriginal));
                    break;

                default:
                    //erro opcao invalida
                    System.out.println("ERRO opção inválida!!!");
                    break;
            }
        }while(escolha != 0);
    }

    public static boolean verificarPertencimento(int numero) {
        int a = 0, b = 1;

        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            int aux = a + b;
            a = b;
            b = aux;
        }

        return false;
    }

    public static String inverterString(String nome){
        char[] caracteres = nome.toCharArray();
        int indiceIncial = 0, indiceFinal = caracteres.length -1;

        while (indiceIncial < indiceFinal){
            char aux = caracteres[indiceIncial];
            caracteres[indiceIncial] = caracteres[indiceFinal];
            caracteres[indiceFinal] = aux;

            indiceIncial++;
            indiceFinal--;
        }

        String stringInvertida = new String(caracteres);
        return stringInvertida;
    }
}