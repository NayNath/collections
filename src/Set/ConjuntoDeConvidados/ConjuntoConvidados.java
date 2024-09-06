package Set.ConjuntoDeConvidados;
import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    
    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Exixtem "+conjuntoConvidados.contarConvidados()+" dentro do set de Convidados.");

        conjuntoConvidados.adicionarConvidado("Miguel", 5678);
        conjuntoConvidados.adicionarConvidado("Ana", 4643);
        conjuntoConvidados.adicionarConvidado("Bell", 5678);
        conjuntoConvidados.adicionarConvidado("Valente", 15451);

        System.out.println("Exixtem "+conjuntoConvidados.contarConvidados()+" dentro do set de Convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(15451);

        System.out.println("Exixtem "+conjuntoConvidados.contarConvidados()+" dentro do set de Convidados.");

    }
}
