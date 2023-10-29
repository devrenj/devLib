public class Tecnico extends Aluno {
    private int registroProfissional;
    
    public void praticar() {
        System.out.println(this.nome+" Está praticando exercícios do curso de: "+this.curso);
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

}
