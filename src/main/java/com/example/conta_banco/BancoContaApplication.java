package com.example.conta_banco;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoContaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoContaApplication.class, args);
		Scanner scanner  = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite seu nome");
		String name = scanner.next();
		System.out.println("Digite seu sobrenome");
		String nextName = scanner.next();
		
		System.out.println("Conta");
		String conta = scanner.next();
		System.out.println("Agencia");
		String agencia = scanner.next();

		System.out.println("Quanto gostaria de depositar?");
		Double saldo = scanner.nextDouble();
		
		System.out.println("Olá " + name + " " + nextName + ", obrigado por uma conta em nosso banco, sua agencia é " + 
				agencia + ", conta: " + conta + " e seu saldo é de " + saldo + " disponível para saque ");
		
	}

}
