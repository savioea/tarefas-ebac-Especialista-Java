package br.com.savioea.domain.mock;

import br.com.savioea.domain.Produto;

import java.math.BigDecimal;

public class ProdutoMock extends Produto {

    public ProdutoMock(){
        super(
                123456L,
                "Porta de Madeira",
                "Uma bela porta de madeira.",
                BigDecimal.valueOf(200.00)
        );
    }

    public ProdutoMock(Long id){
        super(
                id,
                "Porta de Madeira",
                "Uma bela porta de madeira.",
                BigDecimal.valueOf(200.00)
        );
    }
}
