package Set.AgendaDeContatos;
import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato>  contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("sasa", 55662321);
        agendaContatos.adicionarContato("sese", 5566644);
        agendaContatos.adicionarContato("sisi", 45662321);
        agendaContatos.adicionarContato("soso", 45662321);
        agendaContatos.adicionarContato("sese", 45541361);
        agendaContatos.adicionarContato("soso sisi", 22222222);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("soso"));
    }

}
