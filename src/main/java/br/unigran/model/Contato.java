package br.unigran.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class Contato implements Serializable {

    private Integer id;

    private String informacao;
    
    private Pessoa pessoa;
   
    @Override
    public String toString() {
        return getInformacao();
    }
    
}
