

public class Exercicio2Lab4 {
    public static void main(String[] args) {
        
        try {
            PilhaGenerics<Integer> pilha = new PilhaGenerics<Integer> ();
            pilha.push(1);
            pilha.push(2);
            pilha.push(3);
            pilha.push(4);
            pilha.push(5);
            pilha.push(6);

            pilha.remove_n_elements(3);
        
            System.out.println(pilha);
          

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        


    }
}