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
public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco end;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end){
        
        this.end = end;
        
    }
    public abstract void imprimicadastro();
}
