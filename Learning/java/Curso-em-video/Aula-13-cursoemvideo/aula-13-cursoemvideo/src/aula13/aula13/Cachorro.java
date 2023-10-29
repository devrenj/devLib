package aula13;

public class Cachorro extends Lobo {
    private String nome;

    @Override
    public void emitirSom() {
    System.out.println("Au! Au! Au!");
    }

    public String nome() {
        String nome = getClass().getSimpleName();
        return nome;
    }

    public void reagir(String frase) {
        if (frase.equals("toma comida") || frase.equals("oi toto") || frase.equals(nome()) || frase.equals(this.getNome())) {
            System.out.println("Abanar e latir");
        } else if (frase.equals("PEGA")){
            System.err.println("O "+nome()+" mordeu seu vizinho chato, você foi preso!"); 
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }   
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
