package br.senai.sc.view;

import javax.swing.JOptionPane;

public class JanelaPrincipal {
    public void mostraMenu() {
        int opcao;
        
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção:\n1-Funcionário\n2-Cliente\n3-Fornecedor\n4-Transportadora\n5-Sair"));
        }
        
        switch(opcao){
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção não existe");
                break;
        }
    }
}