package br.senai.sc.view;

import br.senai.sc.model.negocio.Produto;
import br.senai.sc.model.persistencia.ProdutosDAO;
import java.util.List;
import javax.swing.JOptionPane;

public class JanelaProduto {

    public void menuProdutos(List<Produto> produtos) {
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada:\n1 - Inserir\n2 - Excluir\n3 - Alterar\n4 - Buscar\n5 - Listar\n6 - Sair"));
            switch (opcao) {
                case 1:
                    adicionaProdutos(produtos);
                    break;
                case 2:
                    removeProdutos(produtos);
                    break;
                case 3:
                    alterarProdutos(produtos);
                    break;
                case 4:
                    buscaProdutos(produtos);
                    break;
                case 5:
                    listaProdutos(produtos);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção não existe");
            }
        } while (opcao != 6);
    }

    public void adicionaProdutos(List<Produto> produtos) {
        Produto p = new Produto();
        
        

        p.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o Codigo do produto: ")));
        p.setMarca(JOptionPane.showInputDialog("Informe a marca do produto: "));
        p.setModelo(JOptionPane.showInputDialog("Informe modelo do produto: "));
        p.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe preço do produto: ")));
        p.setQtd(Integer.parseInt(JOptionPane.showInputDialog("Informe o endereço do funcionário: ")));
        ProdutosDAO dao = new ProdutosDAO();
        dao.addProduto(p, produtos);
    }

    public void listaProdutos(List<Produto> produtos) {
        ProdutosDAO dao = new ProdutosDAO();
        dao.listarProduto(produtos);

    }

    public void removeProdutos(List<Produto> produtos) {
        ProdutosDAO dao = new ProdutosDAO();
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o cod do Produto a ser excluido"));
        dao.excluirProduto(cod, produtos);
    }

    public void alterarProdutos(List<Produto> produtos) {
        ProdutosDAO dao = new ProdutosDAO();




        int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o cod doProduto a ser alterado"));

        Produto pAltera = new Produto();
        pAltera = dao.buscaProdutoByCod(cod, produtos);

        if (pAltera != null) {
 
            Produto p1 = new Produto();

            p1 = dao.buscaProdutoByCod(cod, produtos);
            p1.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o Codigo: ", pAltera.getCod())));
            p1.setMarca(JOptionPane.showInputDialog("Informe a Marca do produto: ", pAltera.getMarca()));
            p1.setModelo(JOptionPane.showInputDialog("Informe o modelo do produto: ", pAltera.getModelo()));
            p1.setQtd(Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade de Produtos: ", pAltera.getQtd())));
            p1.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o Preço do produto: ", pAltera.getPreco())));
            dao.alterarProduto(cod, produtos, p1);
        }
    }
    

    public void buscaProdutos(List<Produto> produtos) {
        ProdutosDAO dao = new ProdutosDAO();
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o coigo do produto a ser buscado"));
        dao.buscaProdutoByCod(cod, produtos);

    }
}
