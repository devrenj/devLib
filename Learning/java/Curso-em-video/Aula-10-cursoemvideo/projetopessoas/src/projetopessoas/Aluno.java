package projetopessoas;

public class Aluno extends Pessoa {
    
    //Atributos
    private int matricula;
    private String curso;

    //Métodos Principais
    public void cancelarMatr() {
        this.setMatricula(this.getMatricula() -1);
    }

    //Métodos Especiais
    
    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    

}
