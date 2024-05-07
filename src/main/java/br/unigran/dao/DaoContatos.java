package br.unigran.dao;

import br.unigran.model.Contato;
import br.unigran.model.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class DaoContatos extends Dao{
    private DaoContatos(){
        
    }
   public static void save(Contato contato) throws SQLException{
    String sql = "INSERT INTO public.contato ( informacao,pessoa_id) " +
        "VALUES(?,?);";
        PreparedStatement prepareStatement = getConn().prepareStatement(sql);
        prepareStatement.setString(1, contato.getInformacao());
        prepareStatement.setInt(2,  contato.getPessoa().getId());
        prepareStatement.execute();
        getConn().close();
   } 
   public static List getContatos() throws SQLException{
         String sql= "select * from public.contato ";
        PreparedStatement prepareStatement = getPreStatement(sql);
        List retorno = new LinkedList();
      
        ResultSet res = prepareStatement.executeQuery();
        
        while (res.next()){
            Contato c = new Contato();
            c.setId(res.getInt(1));//indice
            c.setInformacao(res.getString(2));//nome da coluna
            c.setPessoa(new Pessoa(res.getInt(3)));
            retorno.add(c);
       }
        getConn().close();
        return retorno;
    }
}
