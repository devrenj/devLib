package projetolivro;
    //Início da classe
public class Livro implements Publicacao {

    //Atributos
    private String titulo;
    private String autor;
    private Pessoa leitor;
    private Integer totPaginas;
    private Integer pagAtual;
    private Boolean aberto;
    
    //Métodos Principais

/*          public void detalhes() {
            System.out.println(this.getLeitor+" Está lendo no momento");
            System.out.println(this.getAutor+" é o autor deste livro");
            System.out.println("O total de páginas é de "+this.getTotPaginas());
        }
 */

    //Método Construtor
    public Livro(String titulo, String autor, Pessoa leitor, Integer totPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.leitor = leitor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
    }
    
    //Métodos Especiais
    
    public String detalhes() {
        return "Livro [aberto=" + aberto + ", autor=" + autor +  ", pagAtual=" + pagAtual
                + ", titulo=" + titulo + ", totPaginas=" + totPaginas + "\n, leitor=" + leitor.getNome() + ", idade do leitor=" + leitor.getIdade() + ", gênero do leitor=" + leitor.getGenero() + "]" ;
    }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
    

        public String getTitulo() {
            return titulo;
        }
    
        public void setAutor(String autor) {
            this.autor = autor;	
        }
    
        public String getAutor() {
            return autor;
        }
    
        public void setLeitor(Pessoa leitor) {
            this.leitor = leitor;
        }
    
        public Pessoa getLeitor() {
            return leitor;
        }
    
        public void setTotPaginas(Integer totPaginas) {
            this.totPaginas = totPaginas;
        }
    
        public Integer getTotPaginas() {
            return totPaginas;
        }

        @Override
        public void abrir() {
                if (!this.aberto || this.aberto == null) {
                this.aberto = true;
                } else {
                System.err.println("O livro já está aberto.");
                }
        }

        @Override
        public void fechar() {
            if (this.aberto) {
                this.aberto = false;
            } else {
                System.err.println("O livro já está fechado.");
            }
        }
        

        @Override
        public void folhear(int p) {
            if (this.aberto){    
                if (p > totPaginas) {
                    System.err.println("ERRO: Total de páginas excedido.");
                    this.pagAtual = 0;
                } else if (!this.aberto) {
                    System.err.println("ERRO: O livro está fechado, impossível folhear");
                } else {
                    this.pagAtual = p;
                }
            }
        }

        @Override
        public void avancarPag() {
            if (this.aberto && pagAtual < totPaginas) {
                this.pagAtual++;
            } else {
                System.err.println("ERRO: Impossível avançar página");
            }
        }

        @Override
        public void voltarPag() {
            if (this.aberto && pagAtual > 0) {
                this.pagAtual--;    
            } else {
                System.err.println("ERRO: Impossível voltar página");
            }
        }

        @Override
        public void localizarPag() {
            if (pagAtual.equals(totPaginas)) {
                System.err.println("Última página");
                } else if (pagAtual == totPaginas / 2) {
                System.err.println("Metade do livro");
                } else if (pagAtual == 1) {
                System.err.println("Primeira página");
                }
        }

        
    //get/setAberto não será constrúido pois quando instânciado estará fechado
    //get/setPagAtual também não será construído pois estará com 0

    //Fim da classe
}
