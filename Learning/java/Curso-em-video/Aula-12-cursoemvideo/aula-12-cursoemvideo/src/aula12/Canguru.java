package aula12;
public final class Canguru extends Mamifero {
    
    
    
    public Canguru(float peso, int idade, int membros, String especieAnimal, String nome, String corDoPelo) {
        super(peso, idade, membros, especieAnimal, nome, corDoPelo);
    }

    @Override
    public void locomover() {
        this.usarSuperCondicao(this.getSuperCondicaoNome());
    }
    
    public void usarBolsa() {
        System.out.println(nome()+" está usando bolsa");
    }
}
