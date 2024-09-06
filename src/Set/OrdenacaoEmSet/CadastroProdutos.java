package Set.OrdenacaoEmSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class CadastroProdutos {
    
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(12, "Produto B", 5.00, 2);
        cadastroProdutos.adicionarProduto(23, "Produto A", 12.00, 3);
        cadastroProdutos.adicionarProduto(15, "Produto J", 53.00, 5);
        cadastroProdutos.adicionarProduto(2, "Produto P", 133.00, 9);
        
        System.out.println("__________Por_nome__________");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println("__________Por_Preço__________");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }

}
