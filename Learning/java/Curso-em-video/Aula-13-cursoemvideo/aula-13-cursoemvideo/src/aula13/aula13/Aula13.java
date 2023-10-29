package aula13;

import java.util.Scanner;

public class Aula13 {
    public static void main(String[] args) {
        Scanner scint = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        c.setNome("Miles");
        //Lobo é animal selvagem, não recebe nome

        c.emitirSom();
        l.emitirSom();
        c.reagir(false);
        c.reagir(18, 30);
        c.reagir(4, 5f);
        c.reagir(true);

        c.reagir("oi toto");
        c.reagir("Cachorro");
        l.reagir("oi toto");    //Foi apenas uma piadinha :D
        sc.close();
        scint.close();

}
    //Acho muito útil para testes de console
    public static void trace() {
        System.out.println("_____________________________");
    }
}
