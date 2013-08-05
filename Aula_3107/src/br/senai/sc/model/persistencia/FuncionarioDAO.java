package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public void addFuncionario(Funcionario f, List<Funcionario> funcionarios) {
        funcionarios.add(f);
    }

    public void listarFuncionario() {
        String msg = "";
        for (Funcionario f : funcionarios) {
            msg = msg + "Nome: " + f.getNome() + "\nData de Nascimento: " + f.getDataNascimento()
                    + "\nRg: " + f.getRg() + "\nCpf: " + f.getCpf() + "\nEndereço: " + f.getEndereco() + "\nTelefone: "
                    + f.getTelefone() + "\nData do Cadastro: " + f.getDataCadastro() + "\nSalário: " + f.getSalario()
                    + "\nData da Admissão: " + f.getDataAdmissao() + "\nCtps " + f.getCtps() + "\nCargo: " + f.getCargo();
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public void excluirFuncionario(String nome, List<Funcionario> funcionarios) {
        Funcionario fRemove = null;
        for(Funcionario f : funcionarios){
            if(f.getNome().equals(nome)){
                fRemove = f;
            }
        }
        funcionarios.remove(fRemove);
    }
}