package br.fiap.item;

import br.fiap.produto.Produto;

import java.text.DecimalFormat;

public class ItemProduto {
    private Produto produto;
    private int quantidadeComprada;

    public ItemProduto(Produto produto, int quantidadeComprada) {
        this.produto = produto;
        this.quantidadeComprada = quantidadeComprada;
    }

    public double calcularTotal() {
        return 0;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = "";
        aux += "Produto: " + produto.getNome() + "\n";
        aux += "Valor unitário: R$ " + produto.getValorUnitario() + "\n";
        aux += "Quantidade comprada: " + quantidadeComprada + "\n";
        return aux;
    }

    public Produto getProduto() {
        return produto;
    }
}
