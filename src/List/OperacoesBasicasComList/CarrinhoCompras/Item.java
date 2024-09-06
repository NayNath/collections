package List.OperacoesBasicasComList.CarrinhoCompras;
public class Item {

    String nome;
    double preco;
    int quantidade;

    public  Item(String nome, double preco,int quantidade ){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getnome(){
        return nome;
    }
    
    public double getpreco(){
        return preco;
    }
    public int getquantidade(){
        return quantidade;
    }

    public String toString(){
        return "\nProduto: "+nome + "\n"+
        "Preço: R$ "+preco+ "\n"+
        "Quantidade: "+quantidade;
        
    }
}
