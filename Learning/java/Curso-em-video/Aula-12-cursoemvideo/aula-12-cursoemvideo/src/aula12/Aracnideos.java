package aula12;

public class Aracnideos extends Animal {

    public Aracnideos(float peso, int idade, int membros, String especieAnimal, String nome) {
        super(peso, idade, membros, especieAnimal, nome);
    }

    @Override
    public void alimentar() {
        System.out.println(n()+" está comendo insetos pequenos");
    }

    @Override
    public void emitirSom() {
       System.out.println(n()+ " emite som de aracnídeo"); 
    }

    @Override
    public void locomover() {
    System.out.println(n()+" está movimentando suas "+getMembros()+" patas");    
    }
    
}
