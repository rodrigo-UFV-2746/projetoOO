/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_de_oo;
/**
 *
 * @author RODRIGO
 */
public class Venda{
     private Cliente cliente;
     private Vendedor vendedor;
     private Produto_Informatica produto;
     private float valor_Total;
     private int quantidade;

    public Venda() {
        
    }

    public Venda(Cliente cliente, Vendedor vendedor, Produto_Informatica produto,int quantidade) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Produto_Informatica getProduto() {
        return produto;
    }

    public void setProduto(Produto_Informatica produto) {
        this.produto = produto;
    }

    public float getValor_Total() {
        return valor_Total;
    }

    public void setValor_Total(float valor_Total) {
        this.valor_Total = valor_Total;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    
  
    
}
