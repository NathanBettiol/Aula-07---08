package br.senai.sc.model;

public class Fornecedor {
    private String tipoProduto;

    public Fornecedor(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
}
