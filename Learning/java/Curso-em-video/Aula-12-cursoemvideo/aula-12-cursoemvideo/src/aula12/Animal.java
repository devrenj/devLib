package aula12;
public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    protected int superCondicao;
    protected String superCondicaoNome;
    protected String especieAnimal;
    protected String nome;
       
    
    public Animal(float peso, int idade, int membros, String especieAnimal, String nome) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
        this.especieAnimal = especieAnimal;
        this.nome = nome;
    }

    public String getSuperCondicaoNome() {
        return superCondicaoNome;
    }
    public void setSuperCondicaoNome(String superCondicaoNome) {
        this.superCondicaoNome = superCondicaoNome;
    }

    public void usarSuperCondicao(String nomeSuper) {
        nomeSuper = this.superCondicaoNome;
        if (this.superCondicao > 0) {
            this.setSuperCondicao(this.getSuperCondicao() -1);
        if (this.superCondicao > 2){
            System.out.println(nome()+" está "+nomeSuper+" rapidamente");
        } else if (this.superCondicao > 1 ) {
            System.out.println(nome()+" está "+nomeSuper+" normalmente");
            } else if (this.superCondicao == 1) {
                System.out.println(nome()+" está "+nomeSuper+" lentamente");
            }  else {
                System.out.println(nome()+" está parado");
            }
        } 
    }

    public void descansar() {
        if (this.superCondicao == 0) {
        this.setSuperCondicao(this.getSuperCondicao() +2);
        System.out.println(nome()+" descansado!");
        } else {
            System.out.println(nome()+" não quer descansar agora");
        }
    }

    public void locomover() {
        System.out.println(n()+" está se movimentando com suas "+getMembros()+" patas");
    }

    public abstract void alimentar();
    public abstract void emitirSom();

    public void ficarAnimado(){
        this.setSuperCondicao(6);
        System.out.println(nome()+" ficou muito animado(a)!");
    }

    public String nome(){
    String nome = getClass().getSimpleName();
    return nome;
    }

    public String n() {
        this.getNome();
        return this.nome;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
    public int getSuperCondicao() {
        return superCondicao;
    }
    public void setSuperCondicao(int superCondicao) {
        this.superCondicao = superCondicao;
    }
    public String getEspecieAnimal() {
        return especieAnimal;
    }
    public void setEspecieAnimal(String especieAnimal) {
        this.especieAnimal = especieAnimal;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return n()+" [especieAnimal=" + especieAnimal + ", idade=" + idade + ", membros=" + membros + ", nome=" + nome
                + ", peso=" + peso + "]";
    }

    

}
