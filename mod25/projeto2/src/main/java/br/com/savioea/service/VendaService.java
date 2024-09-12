package br.com.savioea.service;

import br.com.savioea.dao.IVendaDao;
import br.com.savioea.domain.Venda;
import br.com.savioea.service.generic.GenericService;

public class VendaService extends GenericService<Venda, Long> implements IVendaService {

    private IVendaDao vendaDao;

    public VendaService(IVendaDao vendaDao){
        super(vendaDao);
    }

    @Override
    public Venda buscarId(Long codigoVenda) {
        return this.dao.consultar(codigoVenda);
    }
}
