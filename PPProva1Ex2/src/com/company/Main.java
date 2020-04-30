package com.company;

public class Main {

    public static void main(String[] args) {
	    ContaCorrente cc = new ContaCorrente("Pobre", "00000", -10.f);

	    ContaInvestimento ci = new ContaInvestimento("Rico", "999999", 1000.f, 10.f);
	    ci.AdicionaJuros();
        ci.AdicionaJuros();
        ci.AdicionaJuros();
        ci.AdicionaJuros();
        ci.AdicionaJuros();
        System.out.println("Saldo: " + ci.getSaldo());
    }
}
