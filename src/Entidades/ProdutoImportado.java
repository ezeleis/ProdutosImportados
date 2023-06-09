package Entidades;

public class ProdutoImportado extends Produto {
    private double taxa;

    public ProdutoImportado(String nome, double preco, double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    @Override
    public String etiquetaPreco() {
        return super.getNome() + " R$ " + String.format("%.2f", super.getPreco() + taxa) + " (Taxa: R$ " + String.format("%.2f", taxa) + ")";
    }
}
