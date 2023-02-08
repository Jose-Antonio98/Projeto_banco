package banco;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("============= BEM VINDO=============");
		System.out.print("Insira o numero da conta: ");
		int nunAcc = ler.nextInt();
		ler.nextLine();
		System.out.print("\nInforme seu nome: ");
		String nome = ler.nextLine();
		System.out.print("\nInforme sua idade: ");
		int idade = ler.nextInt();
		while (idade < 18) {
			System.out.println("Não é possivel abrir uma conta para menores de 18 anos, tente novamente:");
			idade = ler.nextInt();
		}
		Conta c1 = new Conta(nunAcc, nome, idade);

		System.out.print("\nGostaria de efetuar um deposito inicial? (s/n)");
		String resp = ler.next();
		if (resp.equals("s")) {
			System.out.print("\nInsira o valor do deposito: ");
			double deposito = ler.nextDouble();
			c1.deposito(deposito);
		}
		System.out.println();
		System.out.println("Status da conta: " + c1.toString());
		System.out.println();

		System.out.print("Gostaria de realizar um deposito? (s/n)");
		resp = ler.next();
		if (resp.equals("s")) {
			do {
				System.out.print("\nInsira o valor do deposito: ");
				double deposito = ler.nextDouble();
				c1.deposito(deposito);
				System.out.println("Status da conta: " + c1.toString());
				System.out.print("\nGostaria de repetir a operação? (s/n)");
				resp = ler.next();
			} while (resp.equals("s"));
		}

		System.out.print("\nGostaria de realizar um saque? (s/n)");
		resp = ler.next();
		if (resp.equals("s")) {
			do {
				System.out.print("\nInsira o valor do saque: ");
				double saque = ler.nextDouble();
				c1.saque(saque);
				System.out.println("Status da conta: " + c1.toString());
				System.out.print("\nGostaria de repetir a operação? (s/n)");
				resp = ler.next();
			} while (resp.equals("s"));
		}
		System.out.println("Obrigado por utilizar nossos serviços! =)");
		ler.close();
	}
}
