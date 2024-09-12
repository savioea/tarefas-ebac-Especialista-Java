package br.com.savioea.domain.mock;

import br.com.savioea.domain.Produto;
import br.com.savioea.domain.ProdutoQuantidade;

public class ProdutoQuantidadeMock extends ProdutoQuantidade {

    public ProdutoQuantidadeMock(Produto produto){
         super(
                 produto,
                 1,
                 produto.getValor()
         );
    }
}
