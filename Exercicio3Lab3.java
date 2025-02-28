import java.util.Scanner;

public class Exercicio3Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a String: ");
        String str = scanner.nextLine();

        // String str = "({<>}{)";
        Pilha pilhaCaracteres = new Pilha(20);

        //empilhando os caracteres de abertura
        for (int i = 0; i < str.length(); i++) {
            if (
            str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['
            || str.charAt(i) == '<'
            ) 
                pilhaCaracteres.push(str.charAt(i));
        }

        //verificando se todas as aberturas sao fechadas
        boolean flag = true;
        // se no final da exec a flag for true, todos foram fechados
        for (int i = 0; i < str.length(); i++) {
            if (
            str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']'
            || str.charAt(i) == '>'
            ) 
            {
                // Verificando se o topo da pilha corresponde ao símbolo de fechamento
                if (!pilhaCaracteres.isEmpty() && 
                    (str.charAt(i) == ')' && pilhaCaracteres.topo() == '(' ||
                     str.charAt(i) == '}' && pilhaCaracteres.topo() == '{' ||
                     str.charAt(i) == ']' && pilhaCaracteres.topo() == '[' ||
                     str.charAt(i) == '>' && pilhaCaracteres.topo() == '<')) {
                    pilhaCaracteres.pop(); // desempilha para verificar o proximo
                } else {
                    flag = false; // Se não for correspondência, marca como erro
                    break; // sai pois nao foi fechado corretamente
                }
            }
        }

        if (pilhaCaracteres.isEmpty() && flag)
            System.out.println("Todos foram fechados");
        else
            System.out.println("Nao foi fechado todos os caracteres");
    }
}

// so funciona se os caracteres forem todos abertos e depois todos fechados
// por exemplo ({}). Se for assim: {()<>} nao funciona
// mudar a logica para funcionar em todos os casos