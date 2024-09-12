package br.com.savioea.service;

import br.com.savioea.dao.IProdutoDao;
import br.com.savioea.domain.Produto;
import br.com.savioea.service.generic.GenericService;

public class ProdutoService extends GenericService<Produto, Long> implements IProdutoService {

    private IProdutoDao produtoDao;

    public ProdutoService(IProdutoDao produtoDao) {
        super(produtoDao);
    }

    @Override
    public Produto buscarId(Long codigoProduto) {
        return this.dao.consultar(codigoProduto);
    }
}
