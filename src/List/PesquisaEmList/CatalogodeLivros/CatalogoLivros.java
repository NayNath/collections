package List.PesquisaEmList.CatalogodeLivros;
import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {

    
    private List<Livro> livroList;
    
    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

   /*  public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;
        }
    }

   public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();

        if(!livroList.isEmpty()){  // isEmpty: usado para determinar se as variáveis individuais são inicializadas
            fot(Livro l : livroList){
                if(l.getAno()>= anoInicial && l.getAno() <= anoFinal ){ // equalsIgnoreCase: determina se duas cadeias de caráteres possuem o mesmo conteudo
                    livrosPorAno.add(l);
                }
            }
            return livrosPorAno;
        }
    } 

    public List<Livro> pesquisarPorTitulo(String titulo){
        Livro livrosPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo.add(l);
                }
            }
            return livrosPorTitulo;
        }
    }*/

    public static void main(String[] args) {
        
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Lusiadas", "Luís de Camões", 1572);
        catalogoLivros.adicionarLivro("cortiço", "Aluísio Azevedo", 1890);

      //  catalogoLivros.pesquisarPorAutor("Luís de Camões");
    }
}
