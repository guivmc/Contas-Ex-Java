package com.company;

public class ContaInvestimento extends ContaCorrente {

    private float taxaDeJuros;

    public ContaInvestimento(String nomeCorrentista, String numeroConta, float saldo, float taxaDeJuros) {
        super(nomeCorrentista, numeroConta, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public ContaInvestimento(String nomeCorrentista, String numeroConta) {
        super(nomeCorrentista, numeroConta);
        this.taxaDeJuros = 0;
    }

    public void AdicionaJuros()
    {
        this.taxaDeJuros = 300.f;
        super.Deposito( super.getSaldo() * this.taxaDeJuros );
    }
}
