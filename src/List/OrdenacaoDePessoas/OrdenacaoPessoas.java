package List.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {


    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }



    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        
        ordenacaoPessoas.adicionarPessoa("carlos", 25, 1.90);
        ordenacaoPessoas.adicionarPessoa("ana", 21, 1.30);
        ordenacaoPessoas.adicionarPessoa("lia", 65, 1.40);

        System.out.println("--------ALTURA--------");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

        System.out.println("--------IDADE--------");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
    }

}