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
public class Produto_Informatica implements Produto,Comparable{

    private String unidade; 
    private String descricaoproduto;
    private float precounitario;
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Produto_Informatica() {
        
    }
    
    public Produto_Informatica(String unidade, String descricaoproduto, float precounitario, String cod) {
        this.unidade = unidade;
        this.descricaoproduto = descricaoproduto;
        this.precounitario = precounitario;
        this.codigo = cod;
        
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getDescricaoproduto() {
        return descricaoproduto;
    }

    public void setDescricaoproduto(String descricaoproduto) {
        this.descricaoproduto = descricaoproduto;
    }

    public float getPrecounitario() {
        return precounitario;
    }

    public void setPrecounitario(float precounitario) {
        this.precounitario = precounitario;
    }
    public void consultapreco(){
        System.out.printf("%s - %.2f",this.getDescricaoproduto(),this.getPrecounitario());
    }
    public int compareTo(Object obj) {
        if(obj instanceof Produto_Informatica){
            Produto_Informatica em =(Produto_Informatica)obj;
            return em.codigo.compareTo(this.codigo);
        }
        return 0;
    }

   
            
}
