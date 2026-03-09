import java.util.Scanner;

class Produto {

    String nome;
    double preco;
    int quantidade;

    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("-----------------------");
    }

    double valorEstoque() {
        return preco * quantidade;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto[] produtos = new Produto[5];
        double totalEstoque = 0;

        for (int i = 0; i < produtos.length; i++) {

            produtos[i] = new Produto();

            System.out.println("Digite o nome do Produto " + (i + 1) + ":");
            produtos[i].nome = sc.nextLine();

            System.out.println("Digite o preço do Produto " + (i + 1) + ":");
            produtos[i].preco = sc.nextDouble();

            System.out.println("Digite a quantidade do Produto " + (i + 1) + ":");
            produtos[i].quantidade = sc.nextInt();

            sc.nextLine(); // limpa buffer

            totalEstoque += produtos[i].valorEstoque();

            System.out.println();
        }

        System.out.println("===== Produtos Cadastrados =====");

        for (Produto p : produtos) {
            p.mostrarDados();
        }

        System.out.println("Valor do Estoque: " + totalEstoque);

        sc.close();
    }
}