package projetopessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Julio");
        p1.setSexo("M");
        p1.setIdade(10);

        p2.setNome("Aurea");
        p2.setSexo("F");
        p2.setIdade(23);

        p3.setNome("Jorge");
        p3.setSexo("M");
        p3.setIdade(17);

        p4.setNome("Natália");
        p4.setSexo("F");
        p4.setIdade(40);

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

/*      p1.receberAum(500f);
        p2.mudarTrabalho();
        p4.cancelarMatr();
 */

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
