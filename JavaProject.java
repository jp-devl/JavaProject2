/*
 Aula04 - POO
 Laço de Repetição - Palmas-TO, 14/03/2025
 Nome: João Pedro Moreira
 
 */


import java.util.Scanner;

public class JavaProject {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int anoAtual = 2025; //Você pode alterar o ano atual
	char continuar;
	

while (true) {
	//Solicita o ano de Nascimento
	System.out.print("Digite o ano de nascimento: ");
	int anoNascimento = scanner.nextInt();
	
	
	//Calcula a Idade
	int idade = anoAtual - anoNascimento;
	
	//Verifica se o ano de Nascimento é válido
	if(idade >=0 && idade <=150) {
	System.out.println("A idade da pessoa é: " +idade + " anos.");
	} else {
	System.out.println("Ano de Nascimento inválido! A idade calculada seria " + idade + ".");
	
	}
	
	//Pergunta se o usuário quer continuar
	System.out.println("Deseja calcular outra idade?(s/n): ");
	continuar = scanner.next().charAt(0);
	
	//Condição para sair do laço
	if (continuar =='n'||continuar == 'N'){
		break;
		}
	}
	System.out.println("Programa encerrado!");
	scanner.close();
	}
}

