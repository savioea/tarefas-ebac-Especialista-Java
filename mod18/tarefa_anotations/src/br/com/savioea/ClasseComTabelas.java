package br.com.savioea;

@Tabela(nomeTabela = "Tabela1", colunas = {"Coluna1", "Coluna2"}, numColunas = 2)
public class ClasseComTabelas {

    @Tabela(nomeTabela = "Tabela2", colunas = {"Coluna3", "Coluna4"}, numColunas = 2)
    private String nomePropriedade;

}
