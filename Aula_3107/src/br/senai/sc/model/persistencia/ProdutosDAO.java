package br.senai.sc.model.persistencia;


import br.senai.sc.model.negocio.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutosDAO {

    private List<Produto> produto = new ArrayList<>();

    public void addProduto(Produto p, List<Produto> produtos) {
        produtos.add(p);
    }

    public void listarProduto(List<Produto> produto) {
        String msg = "";
        for (Produto p : produto) {
            msg = msg + "Codigo: " + p.getCod() + "\nMarca do Produto: " + p.getMarca()
                    + "\nModelo: " + p.getModelo() + "\nPreço: " + p.getPreco() + "\nQuandtidade: ";
        }
        JOptionPane.showMessageDialog(null, msg);
    }

    public void excluirProduto(int cod, List<Produto> produtos) {
        Produto pRemove = null;
        for (Produto p : produtos) {
            if (p.getCod()== cod) {
                pRemove = p;
            }
        }
        produtos.remove(pRemove);
    }

    public Produto buscaProdutoByCod(int cod, List<Produto> produtos) {
        for (Produto pBusca : produtos) {
            if (pBusca.getCod()== cod) {
                return pBusca;
            }
        }
        return null;
    }

    public void alterarProduto(int cod, List<Produto> produtos, Produto pAltera) {
        
        excluirProduto(cod, produtos);
        addProduto(pAltera, produtos);
    }
}