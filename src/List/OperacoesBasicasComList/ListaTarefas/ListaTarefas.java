package List.OperacoesBasicasComList.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    
    public List<Tarefa> tarefaList;

    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa t : tarefaList){
        
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("tarefa 1");
        listaTarefas.adicionarTarefa("tarefa 1");
        listaTarefas.adicionarTarefa("tarefa 2");
        System.out.println("O número total da lista: "+ listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("tarefa 1");
        System.out.println("O número total da lista: "+ listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();


    }

}
