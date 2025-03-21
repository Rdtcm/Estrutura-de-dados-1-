public class Pacote {
    // atributos
    private String pkg;
    private int num1;
    private int num2;

    // fazendo os construtores 
    public Pacote(int num1, int num2) {

    }

    public Pacote() {

    }

    // fazendo getter dos valores
    public String getValores() {
        String retorno = Integer.toString(this.num1) + Integer.toString(this.num2);
        return retorno;
    }

    // fazendo setters dos valores\
    public void setValores(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    //metodo para retornar o pacote
    public String gerarPacote(int num1, int num2) {
        //convertendo os pacote para str
        String num1Str = Integer.toString(num1); 
        String num2Str = Integer.toString(num2);

        this.pkg = "(" + num1Str + ", " +  num2Str + ")";

        System.out.println(this.pkg);

        return this.pkg;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("(");
        sb.append(Integer.toString(this.num1));
        sb.append(", ");
        sb.append(Integer.toString(this.num2));
        sb.append(")");

        return sb.toString();
    }
}  
