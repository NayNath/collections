package List.OperacoesBasicasComList.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoCompras;

    public CarrinhoDeCompras(){
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
       this.carrinhoCompras.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensRemover = new ArrayList<>();
        for(Item i : carrinhoCompras){
            if(i.getnome().equalsIgnoreCase(nome))
            itensRemover.add(i);
        }
        carrinhoCompras.removeAll(itensRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;
        for(Item item : carrinhoCompras){
            double valorItem = item.getpreco() * item.getquantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinhoCompras);
    }


    public String toString(){
        return "Carrinho de compras{"+
        "itens = "+carrinhoCompras+
        '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("celular", 1000.0, 1);
        carrinho.adicionarItem("geladeira", 5000.0, 2);
        
        carrinho.exibirItens();

        carrinho.adicionarItem("cama", 1300.0, 1);
        carrinho.removerItem("cama");


        System.out.println("Valor total da compra: "+ carrinho.calcularValorTotal());

    }
}
