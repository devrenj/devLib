package aula12;
public abstract class Reptil extends Animal {
    
    private String corDaEscama;

    public Reptil(float peso, int idade, int membros, String especieAnimal, String nome, String corDaEscama) {
        super(peso, idade, membros, especieAnimal, nome);
        this.corDaEscama = corDaEscama;
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome()+" emite: Som de reptil");    
    }

    @Override
    public void locomover() {
        System.out.println(nome()+" está rastejando");    
    }

    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }

    
}
