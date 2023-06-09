import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Produto;
import Entidades.ProdutoUsado;
import Entidades.ProdutoImportado;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o número de produtos: ");
        int quantidadeProdutos = scanner.nextInt();

        List<Produto> produtos = new ArrayList<>();

        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.println("Dados Produto #" + i + ":");
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char tipo = scanner.next().charAt(0);

            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.print("Preço: ");
            double preco = scanner.nextDouble();

            if (tipo == 'c') {
                produtos.add(new Produto(nome, preco));
            } else if (tipo == 'u') {
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                scanner.nextLine();
                String dataFabricacao = scanner.nextLine();
                produtos.add(new ProdutoUsado(nome, preco, dataFabricacao));
            } else if (tipo == 'i') {
                System.out.print("Taxa: ");
                double taxa = scanner.nextDouble();
                produtos.add(new ProdutoImportado(nome, preco, taxa));
            }
        }

        System.out.println("\nAmostragem de preço dos produtos:");

        for (Produto produto : produtos) {
            System.out.println(produto.etiquetaPreco());
        }
    }
}








