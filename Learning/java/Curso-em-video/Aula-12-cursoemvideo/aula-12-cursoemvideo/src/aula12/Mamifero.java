package aula12;

public abstract class Mamifero extends Animal {

    private String corDoPelo;

    public Mamifero(float peso, int idade, int membros, String especieAnimal, String nome, String corDoPelo) {
        super(peso, idade, membros, especieAnimal, nome);
        this.corDoPelo = corDoPelo;
    }

    @Override
    public void alimentar() {
        System.out.println(nome()+" está mamando");        
    }

    @Override
    public void emitirSom() {
        System.out.println(nome()+" emite: Som de mamífero");    
    }

    @Override
    public void locomover() {
        System.out.println(nome()+" andando");    
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
    
}
