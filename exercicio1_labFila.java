import java.util.Scanner;


public class exercicio1_labFila {
    //metodo para o menu
    public void menu() {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Menu: ");
            System.out.println("Opcao 1. Entrada Fluxo 1");
            System.out.println("Opcao 2. Entrada Fluxo 2");
            System.out.println("Opcao 3. Entrada Fluxo 3");
            System.out.println("Opcao 4. Imprimir os Fluxos");
            System.out.println("Opcao 5. Enfileirar o canal Compartilhado");
            System.out.println("Opcao 6. Imprimir o cancal Compartilhado");
            System.out.println("Opcao 7. Sair");

            System.out.println("Digite a opcao desejda: ");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
        

    // metodo para enfileirar as requisicoes
    


    public static void main(String[] args) {
        // GERANDO FLUXOS
        FilaCircular fluxo1 = new FilaCircular();
        FilaCircular fluxo2 = new FilaCircular();
        FilaCircular fluxo3 = new FilaCircular();

    
       for (int i = 0; i < 3; i++) {
            fluxo1.enqueue(2 + (i * 11));
            fluxo2.enqueue(10 + (i * 5));
            fluxo3.enqueue(5 + (i * 2));
       }
        


        System.out.println("Fluxo 1: " + fluxo1);

        System.out.println("Fluxo 2: " + fluxo2);

        System.out.println("Fluxo 3: " + fluxo3);


        // transformando em pacotes e enfileirando
        Pacote pkg1 = new Pacote();
        Pacote pkg2 = new Pacote();
        Pacote pkg3 = new Pacote();

        FilaCircularPacote canalCompartilhado = new FilaCircularPacote();

        for (int i = 0; i < 3; i++) {
            
            String pacote1 = pkg1.gerarPacote(1, fluxo1.dequeue());

            canalCompartilhado.enqueue(pacote1); // enfileirando no canal

            String pacote2 = pkg2.gerarPacote(2, fluxo2.dequeue());
           
            canalCompartilhado.enqueue(pacote2);

            String pacote3 = pkg3.gerarPacote(3, fluxo3.dequeue());

            canalCompartilhado.enqueue(pacote3);
        }


        // // printando a Fila do canal
        System.out.println("canal compartilhado: " + canalCompartilhado);
   
    }
}