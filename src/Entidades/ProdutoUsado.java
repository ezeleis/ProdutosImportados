package Entidades;

public class ProdutoUsado extends Produto {
    private String dataFabricacao;

    public ProdutoUsado(String nome, double preco, String dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    @Override
    public String etiquetaPreco() {
        return super.getNome() + " (usado) R$ " + String.format("%.2f", super.getPreco()) + " (Data de fabricação: " + dataFabricacao + ")";
    }
}

