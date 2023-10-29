package aula12;

public abstract class Peixe extends Animal {

    private String corEscama;

    public void soltarBolhas() {
        System.out.println("Soltando bolhas");
    }
    
    public Peixe(float peso, int idade, int membros, String especieAnimal, String nome, String corEscama) {
        super(peso, idade, membros, especieAnimal, nome);
        this.corEscama = corEscama;
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");    
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de peixe");
    }

    @Override
    public void locomover() {
        System.out.println(nome()+" está nadando");    
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
