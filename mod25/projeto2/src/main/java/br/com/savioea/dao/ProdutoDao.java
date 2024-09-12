package br.com.savioea.dao;

import br.com.savioea.dao.generic.GenericDAO;
import br.com.savioea.domain.Produto;

public class ProdutoDao extends GenericDAO<Produto> implements IProdutoDao {

    public ProdutoDao(){
        super();
    }

    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualiarDados(Produto entity, Produto entityCadastrado) {

    }
}
