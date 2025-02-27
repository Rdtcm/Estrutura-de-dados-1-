

public class Exercicio1Lab3 {
    public static void main(String[] args) {

        Pilha pilha1 = new Pilha();
        String str = "ryan";

        //colocando os caracteres na pilha 
        for (int i=0; i < str.length(); i++) {
            pilha1.push(str.charAt(i));
        }

        //tirando os caractesres da pilha
        String novaString = "";

        for (int i=0; i < str.length(); i++) {
            novaString += pilha1.pop();
        }

        if (str.equals(novaString)) 
            System.out.println("é palindromo");
        else 
            System.out.println("Não é palíndromo");
    
    }
}