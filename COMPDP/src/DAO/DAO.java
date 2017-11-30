package DAO;

import java.sql.SQLException;
import java.util.List;

public interface DAO <T> { //Nesse T pode ser qualquer letra. É um parâmetro recebido.
    
    public boolean inserir(T obj,String comando) throws SQLException; //Recebe uma variável obj do tipo T. A princípio "T" não existe.
    public boolean alterar(T obj,String comando) throws SQLException;
    public boolean excluir(T obj,String comando) throws SQLException;
    public T buscar(T obj,String comando) throws SQLException;
    public List<T> listar(String criterio) throws SQLException; //Coleção do tipo T.
    
}