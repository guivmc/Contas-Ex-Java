package com.company;

public class ContaCorrente {
    private String nomeCorrentista;
    private String numeroConta;
    private float saldo;

    public ContaCorrente(String nomeCorrentista, String numeroConta, float saldo) {
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaCorrente(String nomeCorrentista, String numeroConta) {
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public void AlterarNome(String newName)
    {
        this.nomeCorrentista = newName;
    }

    public void Deposito(float valor)
    {
        this.saldo += valor;
    }

    public void Saque(float valor)
    {
        this.saldo -= valor;
    }

    public float getSaldo()
    {
        return this.saldo;
    }
}
