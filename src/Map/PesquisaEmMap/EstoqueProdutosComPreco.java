package Map.PesquisaEmMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutosComPreco {

    private Map<Long, Produto> produtoMap;

    public EstoqueProdutosComPreco() {
        this.produtoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        produtoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(produtoMap);
    }
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0.0;
        if(!produtoMap.isEmpty()){
            for(Produto p : produtoMap.values()){
                valorTotalEstoque += p.getQuantidade()*p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    
    public Produto obterProdutoMaisCaro(){
        Produto valorMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!produtoMap.isEmpty()){
            for(Produto p : produtoMap.values()){
                if(p.getPreco()> maiorPreco){
                    valorMaisCaro = p;
                }
            }
        }    
        return valorMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto valorMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!produtoMap.isEmpty()){
            for(Produto p : produtoMap.values()){
                if(p.getPreco()< menorPreco){
                    valorMaisBarato = p;
                }
            }
        } 
        return valorMaisBarato;   
    }
    
}
/*obterProdutoMaiorQuantidadeValorTotalNoEstoque() */