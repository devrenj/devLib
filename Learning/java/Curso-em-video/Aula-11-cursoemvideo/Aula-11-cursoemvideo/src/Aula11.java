

public class Aula11 {
    public static void main(String[] args) throws Exception {
        Visitante v1 = new Visitante();
        v1.setIdade(22);
        v1.setNome("Juvenal");
        v1.setSexo("M");
        System.out.println(v1.toString());
trace();
        Aluno a1 = new Aluno();
        a1.setNome("Normandes");
        a1.setCurso("Letras");
        a1.setIdade(22);
        a1.setMatricula(111111);
        a1.setSexo("M");
        a1.pagarMensalidade();
trace();
        Bolsista b1 = new Bolsista();
        b1.setNome("Orlando");
        b1.setMatricula(222222);
        b1.setSexo("M");
        b1.pagarMensalidade();
        print(b1.toString());
        print(b1.nome);
trace();
        Professor p1 = new Professor();
        p1.nome = "Renata";
        p1.idade = 40;
        p1.sexo = "F";
        p1.setSalario(1800f);
        System.out.println("Salário de "+p1.nome+" é de "+p1.getSalario());
        p1.receberAumento(200f);
        print(p1.toString());
        print(p1.toString2());
trace();
        Tecnico t1 = new Tecnico();
        t1.setNome("Jayla");
        t1.setIdade(19);
        t1.setCurso("em vídeo");
        t1.setMatricula(202020);
        t1.setRegistroProfissional(001001);
        print(t1.toString());
        print(t1.nome);
        t1.praticar();
        t1.pagarMensalidade();
    }

    public static void trace() {
        System.out.println("___________________________________________");
    }

    public static void print(String text) {
        System.out.println(text);
    }
}
