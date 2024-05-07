
package br.unigran.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author andre
 */
public class Pessoa implements Serializable {

    private List<Contato> contatos;

    private Integer id;
    
    private String nome;

    public Pessoa() {
    }

    
    public Pessoa(int id) {
          this.id=id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
    

    @Override
    public String toString() {
        return getNome();
    }
    
}
