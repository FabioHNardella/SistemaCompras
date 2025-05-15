package br.fiap.notafiscal;

import br.fiap.cliente.Cliente;
import br.fiap.item.ItemProduto;
import br.fiap.produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private List<ItemProduto> listaItem;
    private Cliente cliente;
    private boolean status; //true = aberta

    public NotaFiscal(Cliente cliente) {
        this.listaItem = new ArrayList<>();
        this.cliente = cliente;
        this.status = true;
    }

    public void adicionarItem(ItemProduto item) {
        listaItem.add(item);
    }

    public void removerProduto(Produto produto) {
        for(ItemProduto item : listaItem){
            if(item.getProduto().equals(produto)){
                listaItem.remove(item);
            }
        }
    }

    public double calcularTotal(){
        double total = 0;
        for(ItemProduto item : listaItem) {
            total += item.calcularTotal();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
