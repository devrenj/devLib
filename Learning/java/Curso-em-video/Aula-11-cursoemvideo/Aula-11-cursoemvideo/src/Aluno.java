public class Aluno extends Pessoa {
    private int matricula;
    protected String curso;
    public void pagarMensalidade() {
         if (alunoMatriculado()) {
        System.out.println("Pagando mensalidade do aluno "+this.nome.toUpperCase()+" do curso: "+this.curso.toUpperCase());
        } else {
        System.out.println("Aluno não matriculado!");
    }
}

    public boolean alunoMatriculado() {
        if (this.matricula != 0){
            return true;
        } else {
        return false;
        }
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", matricula=" + matricula + "]";
    }
    
}
