

public class Trabalhador {
    private String nome;
    private float salario;
    private String cpf;
    private int idade;
    private char sexo;
    private String endereco;

    //fazendo construtores 
    public Trabalhador() {

    }
    public Trabalhador(String nome, float salario, String cpf, int idade, char sexo, String endereco) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    //fazendo getters e setters
    public String get_nome() {
        return this.nome;
    }
    public float get_salario() {
        return this.salario;
    }
    public String get_cpf() {
        return this.cpf;
    }
    public int get_idade() {
        return this.idade;
    }
    public char get_sexo() {
        return this.sexo;
    }
    public void set_nome(String name) {
        this.nome = name;
    }
    public void set_salario(float salario) {
        this.salario = salario;
    }
    public void set_cpf(String cpf) {
        this.cpf = cpf;
    }
    public void set_endereco() {
        this.endereco = endereco;
    }
    public String get_endereco() {
        return this.endereco;
    }

    //metodos mostrar, calculaSalarioAnual
    public void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("CPF: " + cpf);
        System.out.println("idade: " + idade);
        System.out.println("sexo: " + sexo);
        System.out.println("endereco: " + endereco);
    }
    // retorna o salario considerando o decimo terceiro
    public float calculaSalarioAnual() {
        return this.salario * 13.0f;
    }
}