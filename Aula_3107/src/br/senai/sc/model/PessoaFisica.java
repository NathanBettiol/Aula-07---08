package br.senai.sc.model;

public class PessoaFisica extends Pessoa{
    private String cpf;
    private String nome;
    private String dataNascimento;
    private String rg;

    public PessoaFisica(String cpf, String nome, String dataNascimento, String rg, int id, String endereco, String telefone, String dataCadastro) {
        super(id, endereco, telefone, dataCadastro);
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}