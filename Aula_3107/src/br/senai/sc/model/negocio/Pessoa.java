package br.senai.sc.model.negocio;

/**
 * Essa classe representa as pessoas do software
 * @version 1.0 31/07/13
 * @author gustavo_agustinho
 */
public class Pessoa {
    private int id;
    private String endereco;
    private String telefone;
    private String dataCadastro;

    public Pessoa(int id, String endereco, String telefone, String dataCadastro) {
        this.id = id;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
    }
       
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
}