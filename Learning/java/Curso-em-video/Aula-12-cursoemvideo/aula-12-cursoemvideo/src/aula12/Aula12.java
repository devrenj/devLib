package aula12;

public class Aula12 {
    public static void main(String[] args) throws Exception {


    // Animal n = new Animal(); //Classe abstrata não pode ser instanciada

    // Mamifero m1 = new Mamifero();
    // Reptil r1 = new Reptil();
    // Ave a1 = new Ave();

    Canguru c = new Canguru(90f, 5, 2, "Mamifero", "Jack", "Marrom");
    Cachorro k = new Cachorro(16f, 7, 4, "Mamifero", "Bill", "Caramelo");
    Cobra j = new Cobra(1f, 13, 0, "Reptil", "Natilus", "Verde");
    Tartaruga t = new Tartaruga(50f, 157, 4, "Reptil", "Mr. Finn", "Verde e amarelo");
    Goldfish g = new Goldfish(0.2f, 0, 2, "Peixe", "Mirian", "Dourado");
    Arara e = new Arara(5.4f, 2, 2, "Ave", "Jorel", "Azul");
    Aranha f = new Aranha(0.1f, 0, 8, "Aracnideo", "Presto");

    print(c.toString());
    print(k.toString());
    print(j.toString());
    print(t.toString());
    print(g.toString());
    print(e.toString());
    print(f.toString());

    // PRÓXIMO EXERCÍCIO: CRIAR ARRAY COM OS ANIMAIS PARA INTERAGIR COM A CLASSE ZOOLÓGICO

    /*
    c.locomover();
    c.emitirSom();
    c.locomover();
    c.emitirSom();
    c.ficarAnimado();
    c.locomover();
    c.locomover();
    c.locomover();
    System.out.println("Empolgação: "+k.getSuperCondicao());
    c.locomover();
    
trace();
        k.nome();
        // k.setSuperCondicaoNome("Força do pulo");
    k.locomover();
    k.emitirSom();
    print(k.superCondicaoNome);
    k.ficarAnimado();
    k.locomover();
    k.locomover();
    k.locomover();
    k.locomover();
    k.descansar();
    k.locomover();
    System.out.println("Empolgação: "+k.getSuperCondicao());
    k.locomover();
    k.descansar();
    k.locomover();
    trace();
        t.nome();
        // t.setSuperCondicaoNome("Velocidade");
    t.locomover();
    t.emitirSom();
    t.ficarAnimado();
    t.locomover();
    t.locomover();
    t.locomover();
    t.locomover();
    System.out.println("Empolgação: "+t.getSuperCondicao());
    t.ficarAnimado();
    t.locomover();
    */
        // print(a1.toString());
    }
    // Métodos complementares do método MAIN
    public static void print(String text) {
        System.out.println(text);
    }
    
    public static void trace() {
        System.out.println("___________________________");
    }    
}

