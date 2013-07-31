package br.senai.sc.model.negocio;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    public PessoaJuridica(String cnpj, String razaoSocial, String nomeFantasia, int id, String endereco, String telefone, String dataCadastro) {
        super(id, endereco, telefone, dataCadastro);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
}