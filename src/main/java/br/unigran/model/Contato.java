package br.unigran.model;

import java.io.Serializable;

public class Contato implements Serializable {

    private Integer id;

    private String informacao;
    
    private Pessoa pessoa;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    

    @Override
    public String toString() {
        return getInformacao();
    }
    
}
