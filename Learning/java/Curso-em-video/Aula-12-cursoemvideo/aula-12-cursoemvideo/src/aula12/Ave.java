package aula12;

public abstract class Ave extends Animal {

    public Ave(float peso, int idade, int membros, String especieAnimal, String nome, String corPena) {
        super(peso, idade, membros, especieAnimal, nome);
        this.corPena = corPena;
    }

    private String corPena;
    
    public void fazerNinho() {
        System.out.println(nome()+" está fazendo ninho");
    }

    @Override
    public void alimentar() {
        System.out.println(n()+" está comendo frutas");    
    }

    @Override
    public void emitirSom() {
        System.out.println(n()+" emite: Som de ave");    
    }

    @Override
    public void locomover() {
        System.out.println(n()+" está voando");    
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
