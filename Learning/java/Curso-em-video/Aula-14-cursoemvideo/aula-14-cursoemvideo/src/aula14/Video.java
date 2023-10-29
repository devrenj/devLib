package aula14;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.setTitulo(titulo);
        // this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }

    @Override
    public String toString() {
        return "Video [titulo=" + titulo + ", reproduzindo=" + reproduzindo+ ", avaliacao=" + avaliacao + ", curtidas=" + curtidas + ", views=" + views + "]";
    }

    @Override
    public void like() {
        this.curtidas++;    
    }

    @Override
    public void pause() {
        if (this.reproduzindo) {
            this.setReproduzindo(false);
        }
    }
    @Override
    public void play() {
        if (!this.reproduzindo) {
            this.setReproduzindo(true);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    

}
