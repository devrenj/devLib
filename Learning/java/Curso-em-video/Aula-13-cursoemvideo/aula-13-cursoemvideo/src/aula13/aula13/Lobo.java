package aula13;

public class Lobo extends Mamifero {

    @Override
    public void emitirSom() {
    System.out.println("Auuuuuuuuuuu");
    }

    public void reagir(String frase) {
        System.err.println("Você sofreu um ataque feroz e morreu :(");
    }

    public void reagir(boolean dono) {
        System.err.println("Você sofreu um ataque feroz e morreu :(");
    }

    public void reagir(int hora, int min) {
        System.err.println("Você sofreu um ataque feroz e morreu :(");
    }

    public void reagir(int idade, float peso) {
        System.err.println("Você sofreu um ataque feroz e morreu :(");
    }
    
}
