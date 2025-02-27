public class Exercicio2Lab3 {
    public static void main(String[] args) {

        String data = "29/08/2000";
        Pilha p1 = new Pilha();

        //colocando na pilha
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) != "/") {
                p1.push(data.charAt(i));
            }
        }




    }
}