
public class Aluno {
    private String nome;
    private String rgm;
    private char sexo;
    private float notaA;
    private float notaB;
    private float notaC;
    private float notaD;
    private float media;

    //fazendo os construtores
    public Aluno(String nome, float notaA, float notaB,float notaC, float notaD) 
    {
            this.nome = nome;
            this. notaA = notaA;
            this.notaB = notaB;
            this.notaC = notaC;
            this.notaD = notaD;
    }
    public Aluno() {

    }
    public Aluno(String rgm, String nome) {
        this.rgm = rgm;
        this.nome = nome;
    }

    //fazendo getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRgm(String rgm) {
        this.rgm = rgm;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setNotaA(float notaA) {
        this.notaA = notaA;
    }
    public void setNotaB(float notaB) {
        this.notaB = notaB;
    }
    public void setNotaC(float notaC) {
        this.notaC = notaC;
    }
    public void setNotaD(float notaD) {
        this.notaD = notaD;
    }
    public String getNome() {
        return this.nome;
    }
    public String getRgm() {
        return this.rgm;
    }
    public char getSexo() {
        return this.sexo;
    }
    public float getNotaA() {
        return this.notaA;
    }
    public float getNotaB() {
        return this.notaB;
    }
    public float getNotaC() {
        return this.notaC;
    }
    public float getNotaD() {
        return this.notaD;
    }
    public float getMedia() {
        return this.media;
    }

    //fazendo os metodos
    public float calculaMedia() {
        media = this.notaA + this.notaB + this.notaC + this.notaD ;

        return media / 4.0f;
    }

    public void mostraDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Rgm: " + rgm);
        System.out.println("sexo: " + sexo);
        System.out.println("Nota A: " + notaA);
        System.out.println("Nota B: " + notaB);
        System.out.println("Nota C: " + notaC);
        System.out.println("Nota D: " + notaD);
    }

    public boolean avaliaSituacao() {
        return this.media >= 6.0f;
    }

}