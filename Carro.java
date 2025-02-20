

public class Carro {
    private String nome;
    private int ano;
    private String modelo;
    private String categoria;

    //fazendo o construtor
    public Carro(String nome, int ano, String categoria, String modelo) {
        this.nome = nome;
        this.ano = ano;
        this.categoria = categoria;
        this.modelo = modelo;
    }
 
    //fazendo getter e setters 
    public String get_nome() {
        return this.nome;
    }
    public String get_categoria() {
        return this.categoria;
    }
    public String get_modelo() {
        return this.modelo;
    }
    public void set_name(String name) {
        this.nome = name;
    }
    public void set_categoria(String categoria) {
        this.categoria = categoria;
    }
    public void set_modelo(String modelo) {
        this.modelo = modelo;
    }
    public int get_ano() {
        return this.ano;
    }
    public void set_ano(int ano) {
        this.ano = ano;
    }
    public void imprima() {
        System.out.println("Ano: " + ano);
        System.out.println("Modelo: " + modelo);
        System.out.println("Categoria: " + categoria);
        System.out.println("Nome: " + nome);
    }
}