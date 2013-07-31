package br.senai.sc.model.negocio;

public class ClientePF extends PessoaFisica{
    private double nrConta;
    private double limiteCompra;
    private char categoria;
    private int qtVezesComprou;
    private double vlTotalGasto;

    public ClientePF(double nrConta, double limiteCompra, char categoria, int qtVezesComprou, double vlTotalGasto, String cpf, String nome, String dataNascimento, String rg, int id, String endereco, String telefone, String dataCadastro) {
        super(cpf, nome, dataNascimento, rg, id, endereco, telefone, dataCadastro);
        this.nrConta = nrConta;
        this.limiteCompra = limiteCompra;
        this.categoria = categoria;
        this.qtVezesComprou = qtVezesComprou;
        this.vlTotalGasto = vlTotalGasto;
    }

    public double getNrConta() {
        return nrConta;
    }

    public void setNrConta(double nrConta) {
        this.nrConta = nrConta;
    }

    public double getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(double limiteCompra) {
        this.limiteCompra = limiteCompra;
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