package br.com.caelum.ingresso.controller;

import java.math.BigDecimal;

public class BigDecimalExemplo {

	public static void main(String[] args) {
		System.out.println("INICIO - Exemplo de Double e BigDecimal \n");
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		System.out.println(valor1 + valor2);
		
		/* Calculo com Double */
		calculoComDouble();
		
		/* Calculo com BigDecimal */
		calculoComBigDecimal();
	}
	
	public static void calculoComDouble() {
		System.out.println("\n INICIO - calculoComDouble - Forma incorreta!! \n");
		
		System.out.println(2.00 - 1.1);
		System.out.println(2.00 - 1.2);
		System.out.println(2.00 - 1.3);
		System.out.println(2.00 - 1.4);
		System.out.println(2.00 - 1.5);
		System.out.println(2.00 - 1.6);
		System.out.println(2.00 - 1.7);
		System.out.println(2.00 - 1.8);
		System.out.println(2.00 - 1.9);
		System.out.println(2.00 - 2);
	}
	
	public static void calculoComBigDecimal() {
		System.out.println("\n INICIO - calculoComBigDecimal - Forma correta! \n");
		
		BigDecimal big1 = new BigDecimal("0.1");
        BigDecimal big2 = new BigDecimal("0.2");
        
        BigDecimal bigResult = big1.add(big2);
        
        System.out.println(bigResult.toString() + "\n");
        
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.1")));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.2")));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.3")));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.4")));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.5")));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.6")));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.7")));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.8")));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.9")));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("2")));
        
        System.out.println("\n");
        
        System.out.println(new BigDecimal("2.00").multiply(new BigDecimal("2")));
        
	}

}
