package br.com.savioea.dao;

import br.com.savioea.dao.generic.GenericDAO;
import br.com.savioea.domain.Venda;

public class VendaDao extends GenericDAO<Venda> implements IVendaDao {

    public VendaDao(){
        super();
    }

    @Override
    public Class<Venda> getTipoClasse() {
        return Venda.class;
    }

    @Override
    public void atualiarDados(Venda entity, Venda entityCadastrado) {

    }
}
