package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data:");
		System.out.print("Name:");
		String name = sc.next();
		System.out.print("Price:");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock:");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", product.getName(), product.getPrice(), product.getQuantity(), product.totalValueInStock());
		
		System.out.print("Enter the number of products to be added in stock:");
		product.addProducts(sc.nextInt());

		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", product.getName(), product.getPrice(), product.getQuantity(), product.totalValueInStock());
		
		System.out.print("Enter the number of products to be removed from stock:");
		product.removeProducts(sc.nextInt());

		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f", product.getName(), product.getPrice(), product.getQuantity(), product.totalValueInStock());
		sc.close();
	}

}
