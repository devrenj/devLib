package aula12;
public final class Cachorro extends Mamifero {

        public Cachorro(float peso, int idade, int membros, String especieAnimal, String nome, String corDoPelo) {
        super(peso, idade, membros, especieAnimal, nome, corDoPelo);
    }
    
    @Override
    public void locomover() {
        usarSuperCondicao(this.getSuperCondicaoNome());
    }
    @Override
    public void emitirSom() {
    System.out.println(nome()+" emite: Au au au");
    }
    
}
