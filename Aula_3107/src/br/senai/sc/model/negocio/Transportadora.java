package br.senai.sc.model.negocio;

public class Transportadora extends PessoaJuridica {
    private String tipoTransporte;
    private double precoFrete;

    public Transportadora(String tipoTransporte, double precoFrete, String cnpj, String razaoSocial, String nomeFantasia, int id, String endereco, String telefone, String dataCadastro) {
        super(cnpj, razaoSocial, nomeFantasia, id, endereco, telefone, dataCadastro);
        this.tipoTransporte = tipoTransporte;
        this.precoFrete = precoFrete;
    }
    
    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getPrecoFrete() {
        return precoFrete;
    }

    public void setPrecoFrete(double precoFrete) {
        this.precoFrete = precoFrete;
    }
    
}