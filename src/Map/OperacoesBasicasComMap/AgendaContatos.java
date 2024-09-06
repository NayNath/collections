package Map.OperacoesBasicasComMap;
import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {

    private Map<String, Integer> agendMap;

    public AgendaContatos() {
        this.agendMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendMap.put(nome, telefone); //put == add
    }
    public void removerContato(String nome){
        if (!agendMap.isEmpty()){
            agendMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendMap.isEmpty()){
            numeroPorNome = agendMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("contato 1", 1111);
        agendaContatos.adicionarContato("contato 2", 2222);
        agendaContatos.adicionarContato("contato 3", 3333);
        agendaContatos.adicionarContato("contato 4", 4444);
        agendaContatos.adicionarContato("ana", 5555);

        agendaContatos.exibirContatos();
 
        System.out.println("____________");
        agendaContatos.pesquisarPorNome("ana");
        agendaContatos.exibirContatos();

        System.out.println("____________");
        agendaContatos.removerContato("contato 2");
        agendaContatos.exibirContatos();
    
    }

}
