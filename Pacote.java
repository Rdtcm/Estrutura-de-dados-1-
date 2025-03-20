public class Pacote {
    // atributos
    private String pkg;
    private int num1;
    private int num2;

    // fazendo os construtores 
    public Pacote(int num1, int num2) {

    }


    //metodo para retornar o pacote
    public String gerarPacote(int num1, int num2) {
        String num1Str = Integer.toString(this.num1); 
        String num2Str = Integer.toString(this.num2);

        this.pkg = num1Str + num2Str;

        return this.pkg;
    }
}  
