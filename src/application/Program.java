package application;

import java.util.Locale;
import java.util.Scanner;

import bill.Bar;



public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bar bar = new Bar();

		System.out.print("Sexo: ");
		bar.gender = sc.next().charAt(0);

		System.out.print("Quantidade de cervejas: ");
		bar.beer = sc.nextInt();

		System.out.print("Quantidade de refrigerantes: ");
		bar.softDrink = sc.nextInt();

		System.out.print("Quantidade de espetinhos: ");
		bar.barbecue = sc.nextInt();

		System.out.println();
		System.out.println("RELATÓRIO: ");
		System.out.printf("Consumo = R$ %.2f%n", bar.feeding());

		if (bar.feeding() > 30.00) {
			System.out.println("Isento de Couvert");
		} else {
			System.out.printf("Couvert = R$ %.2f%n", bar.cover());
		}

		System.out.printf("Ingresso = R$ %.2f%n", bar.ticket());

		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n", bar.total());

		sc.close();
	}

}
