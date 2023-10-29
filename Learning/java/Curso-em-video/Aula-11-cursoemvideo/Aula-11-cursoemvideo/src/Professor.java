public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAumento(Float aum) {
        salario += aum;
        System.out.println(this.nome+" recebeu um aumento de "+aum+", salário atual é de: "+this.salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String toString2() {
        return "Professor [especialidade=" + especialidade + ", salario=" + salario + "]";
    }
    
}
