public class Exercicio2Lab3 {
    public static void main(String[] args) {

        String data = "12/02/2021";
        Pilha p1 = new Pilha();

        //tirando as barras
        String dataSemBarras = "";
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) != '/')
                dataSemBarras += data.charAt(i);
        }
        //colocando na pilha
        for (int i = 0; i < dataSemBarras.length(); i++) {
            p1.push(dataSemBarras.charAt(i));
        }

        //tirando da pilha para pegar a data invertida
        String dataInvertida = "";
        for (int i = 0; i < data.length() - 2; i++) {
            dataInvertida += p1.pop();
        }

        // System.out.println(dataSemBarras);
        // System.out.println(dataInvertida);

        if (dataSemBarras.equals(dataInvertida)) 
            System.out.println("e palindromo");
        else 
            System.out.println("Nao e palindromo");

    }
}