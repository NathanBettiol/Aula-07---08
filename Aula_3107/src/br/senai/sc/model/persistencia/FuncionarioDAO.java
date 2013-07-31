package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
    private List<Funcionario> funcionarios = new ArrayList<>();
    
    public void addFuncionario(Funcionario f){
        funcionarios.add(f);        
    }
}