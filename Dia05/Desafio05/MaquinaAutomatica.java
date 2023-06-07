package Dia05.Desafio05;

import java.util.ArrayList;
import java.util.List;

public class MaquinaAutomatica {
    private List<Produto> produtos = new ArrayList<>();

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void incluirProduto(Produto produto) {
        this.produtos.add(produto);
    }
}
