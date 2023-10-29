package projetolivro;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        p[0] = new Pessoa("Roberto", 30, "M");
        p[1] = new Pessoa("Ana", 17, "F");
        
        l[0] = new Livro("Aprendendo Java", "Guanabarinha", p[0], 300);
        l[1] = new Livro("POO para iniciantes", "Gafanhotos", p[1], 500);
        l[2] = new Livro("Arte de Vencer", "Roberto Nóbrega", p[1], 250);

        //Testes de Comandos
        p[0].fazerAniver();
        l[2].abrir();
        l[2].folhear(10);

        print(l[2].detalhes()); //Mostrar os detalhes de l[0] no console
        trace();

        l[1].abrir();
        l[1].folhear(1);
        l[1].voltarPag();

        l[1].localizarPag();
        p[1].fazerAniver();

        print(l[1].detalhes()); //Mostrar os detalhes de l[4] no console
    }

    public static void trace() {
        System.out.println("=================");
    }

    public static void print(String text) {
        System.out.println(text);
    }
}
