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
import java.util.Date;
public class Cliente extends Pessoa implements Comparable { 
    private  String dados_adicionais;

    public Cliente() {
       super();
    }
    public Cliente(String rua,String bairro,String cidade,String cep,String estado){
        super();
 
        
    }
    public Cliente(String dados_adicionais) {
        this.dados_adicionais = dados_adicionais;
    }

    public String getDados_adicionais() {
        return dados_adicionais;
    }

    public void setDados_adicionais(String dados_adicionais) {
        this.dados_adicionais = dados_adicionais;
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
                        + "CEP:%s\n"
                        + "Dados adicionais:%s\n"
                        +"----------------------\n",this.getNome(),this.getCpf(),this.end.getRua(),this.end.getNumero(),this.end.getBairro(),this.end.getCidade(),this.end.getEstado(),this.end.getCep(),this.getDados_adicionais());
    }
    @Override
    public int compareTo(Object obj) {
        
        if(obj instanceof Cliente){
            Cliente em=(Cliente)obj;
            return em.nome.compareTo(this.nome);
        }
        return 0;
    }
    
}
