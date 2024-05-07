
package br.unigran.model;

import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author andre
 */
@Getter @Setter
@NoArgsConstructor

public class Pessoa implements Serializable {

    private List<Contato> contatos;

    private Integer id;
    
    private String nome;

    public Pessoa(Integer id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return getNome();
    }
    
}
