package br.senai.sc.model.negocio;

public class Funcionario {
    private double salario;
    private String dataAdmissao;
    private String ctps;
    private String cargo;

    public Funcionario(double salario, String dataAdmissao, String ctps, String cargo) {
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.ctps = ctps;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
            
}