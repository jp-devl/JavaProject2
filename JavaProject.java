/*
 * Aula 04 - Atividade Prática 03 - POO
 * Laço de Repetição
 *
 * Nome: João Pedro Moreira
 * Problema:
 * Problema clássico para verificar se uma palavra é um palíndromo.
 * Palíndromo é uma palavra, frase ou número que permanece igual
 * quando lida de trás para diante.
 *
 * Fonte: Problema clássico disponível em
 * https://pt.wikipedia.org/wiki/Pal%C3%ADndromo
 *
 */

import java.util.Scanner;

public class JavaProject {
    public static boolean verificarPalindromo(String palavra) {
        // Início de sua solução

        // Converte a palavra para minúsculas e remove espaços
        palavra = palavra.toLowerCase().replaceAll("\\s", "");

        // Obtém o tamanho da palavra
        int tamanho = palavra.length();

        // Usa dois ponteiros: um no início e outro no fim
        int inicio = 0;
        int fim = tamanho-1;

        // Verifica os caracteres do início ao fim usando laço
        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false; // Se encontrar diferença, não é palíndromo
            }
            inicio++;
            fim--;
        }


        // Fim de sua solução
        return true;
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra para verificar se e um palindromo: ");
        String palavra = entrada.nextLine();

        boolean resultado = verificarPalindromo(palavra);

        if(resultado)
            System.out.println("A palavra '" + palavra + "' e palindromo :)");
        else
            System.out.println("A palavra '" + palavra + "' nao e palindromo :(");

        entrada.close();
    }

}