
import java.time.chrono.ThaiBuddhistChronology;

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
    public String get_endereco() {
        return this.endereco;
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
}