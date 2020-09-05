/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_de_oo;

/**
 *
 * @author Matheus VR
 */


import java.io.PrintStream;




public class Vendedor  extends Pessoa implements Comparable {
    private float comisao;
    //private String nome;

    public Vendedor() {
        super();
    }

    public float getComisao() {
        return comisao;
    }

    public void setComisao(float comisao) {
        this.comisao = comisao;
    }
    
    public float calculaComicao(float valorTotaldeVenda){
        float valorComisao = this.comisao*valorTotaldeVenda;
        return valorComisao;  
    }
    public void imprimicadastro(){
        System.out.printf("---------------------\n"
                        + "        Cliente      \n"
                        + "Nome: %s\n"
                        + "Cpf:%s\n"
                        + "Rua:%s\n"
                        + "Numero:%s\n"
                        + "Bairro:%s\n"
                        + "Cidade:%s\n"
                        + "Estado:%s\n"
                        + "CEP:%s"
                        + "comissão:%s\n"
                        +"----------------------\n",this.getNome(),this.getCpf(),this.end.getRua(),this.end.getNumero(),this.end.getBairro(),this.end.getCidade(),this.end.getEstado(),this.end.getCep(),this.getComisao());
    }
    public int compareTo(Object obj) {
        if(obj instanceof Cliente){
            Vendedor em=(Vendedor)obj;
            return em.nome.compareTo(this.nome);
        }
        return 0;
    }
  

    
}

