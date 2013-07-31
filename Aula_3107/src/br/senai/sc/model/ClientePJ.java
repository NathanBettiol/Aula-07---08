package br.senai.sc.model;

public class ClientePJ extends PessoaJuridica {
    
    private double limite;
    private int nrConta;
    private char categoria;
    private int qtVezesComprou;
    private double vlTotalGasto;

    public ClientePJ(double limite, int nrConta, char categoria, int qtVezesComprou, double vlTotalGasto, String cnpj, String razaoSocial, String nomeFantasia, int id, String endereco, String telefone, String dataCadastro) {
        super(cnpj, razaoSocial, nomeFantasia, id, endereco, telefone, dataCadastro);
        this.limite = limite;
        this.nrConta = nrConta;
        this.categoria = categoria;
        this.qtVezesComprou = qtVezesComprou;
        this.vlTotalGasto = vlTotalGasto;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getNrConta() {
        return nrConta;
    }

    public void setNrConta(int nrConta) {
        this.nrConta = nrConta;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getQtVezesComprou() {
        return qtVezesComprou;
    }

    public void setQtVezesComprou(int qtVezesComprou) {
        this.qtVezesComprou = qtVezesComprou;
    }

    public double getVlTotalGasto() {
        return vlTotalGasto;
    }

    public void setVlTotalGasto(double vlTotalGasto) {
        this.vlTotalGasto = vlTotalGasto;
    }
            
}