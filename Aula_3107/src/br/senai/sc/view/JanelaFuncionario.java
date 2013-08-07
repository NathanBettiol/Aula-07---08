package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.persistencia.FuncionarioDAO;
import java.util.List;
import javax.swing.JOptionPane;

public class JanelaFuncionario {

    public void menuFuncionario(List<Funcionario> funcionarios) {
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada:\n1 - Inserir\n2 - Excluir\n3 - Alterar\n4 - Buscar\n5 - Listar\n6 - Sair"));
            switch (opcao) {
                case 1:
                    adicionaFuncionarios(funcionarios);
                    break;
                case 2:
                    removeFuncionarios(funcionarios);
                    break;
                case 3:
                    alterarFuncionario(funcionarios);
                    break;
                case 4:
                    buscaFuncionario(funcionarios);
                    break;
                case 5:
                    listaFuncionarios(funcionarios);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção não existe");
            }
        } while (opcao != 6);
    }

    public void adicionaFuncionarios(List<Funcionario> funcionarios) {
        Funcionario f = new Funcionario();

        f.setNome(JOptionPane.showInputDialog("Informe o nome do funcionário: "));
        f.setDataNascimento(JOptionPane.showInputDialog("Informe a data de nascimento do funcionário: "));
        f.setRg(JOptionPane.showInputDialog("Informe o RG do funcionário: "));
        f.setCpf(JOptionPane.showInputDialog("Informe o CPF do funcionário: "));
        f.setEndereco(JOptionPane.showInputDialog("Informe o endereço do funcionário: "));
        f.setTelefone(JOptionPane.showInputDialog("Informe o telefone do funcionário: "));
        f.setDataCadastro(JOptionPane.showInputDialog("Informe a data de cadastro do funcionário: "));
        f.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário: ")));
        f.setDataAdmissao(JOptionPane.showInputDialog("Informe a data de admissão do funcionário: "));
        f.setCtps(JOptionPane.showInputDialog("Informe o CTPS do funcionário: "));
        f.setCargo(JOptionPane.showInputDialog("Informe o cargos do funcionário: "));
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.addFuncionario(f, funcionarios);
    }

    public void listaFuncionarios(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.listarFuncionario(funcionarios);

    }

    public void removeFuncionarios(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        String nome = JOptionPane.showInputDialog("Informe o nome do funcionário a ser excluido");
        dao.excluirFuncionario(nome, funcionarios);
    }

    public void alterarFuncionario(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();




        String nome = JOptionPane.showInputDialog("Informe o nome do funcionário a ser alterado");

        Funcionario fAltera = new Funcionario();
        fAltera = dao.buscaFuncionarioByNome(nome, funcionarios);

        if (fAltera != null) {
            Funcionario f1 = new Funcionario();

            f1 = dao.buscaFuncionarioByNome(nome, funcionarios);
            f1.setNome(JOptionPane.showInputDialog("Informe o nome do funcionário: ", fAltera.getNome()));
            f1.setDataNascimento(JOptionPane.showInputDialog("Informe a data de nascimento do funcionário: ", fAltera.getDataNascimento()));
            f1.setRg(JOptionPane.showInputDialog("Informe o RG do funcionário: ", fAltera.getRg()));
            f1.setCpf(JOptionPane.showInputDialog("Informe o CPF do funcionário: ", fAltera.getCpf()));
            f1.setEndereco(JOptionPane.showInputDialog("Informe o endereço do funcionário: ", fAltera.getEndereco()));
            f1.setTelefone(JOptionPane.showInputDialog("Informe o telefone do funcionário: ", fAltera.getTelefone()));
            f1.setDataCadastro(JOptionPane.showInputDialog("Informe a data de cadastro do funcionário: ", fAltera.getDataCadastro()));
            f1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário: ", fAltera.getSalario())));
            f1.setDataAdmissao(JOptionPane.showInputDialog("Informe a data de admissão do funcionário: ", fAltera.getDataAdmissao()));
            f1.setCtps(JOptionPane.showInputDialog("Informe o CTPS do funcionário: ", fAltera.getCtps()));
            f1.setCargo(JOptionPane.showInputDialog("Informe o cargos do funcionário: ", fAltera.getCargo()));
            dao.alterarFuncionario(nome, funcionarios, f1);
        }
    }
    

    public void buscaFuncionario(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        String nome = JOptionPane.showInputDialog("Informe o nome do funcionário a ser buscado");
        dao.buscaFuncionarioByNome(nome, funcionarios);

    }
}
