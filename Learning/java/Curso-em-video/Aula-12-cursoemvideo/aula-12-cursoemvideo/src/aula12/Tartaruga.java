package aula12;
public final class Tartaruga extends Reptil {
  
    public Tartaruga(float peso, int idade, int membros, String especieAnimal, String nome, String corDaEscama) {
        super(peso, idade, membros, especieAnimal, nome, corDaEscama);
        this.superCondicaoNome = "movimentando-se";
    }



    @Override
    public void locomover() {
       this.usarSuperCondicao(this.getSuperCondicaoNome());
    }
    
}
