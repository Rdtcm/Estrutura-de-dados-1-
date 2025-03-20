public class exercicio1_labFila {
    //metodo para o menu
    public void menu() {
        System.out.println("Menu:\n Opcao 1.\n Opcao 2.\n Opcao 3.\n Opcao 4.\n");
    }

    // metodo para enfileirar as requisicoes
    


    public static void main(String[] args) {
        // GERANDO FLUXOS
        FilaSequencial<Integer> fluxo1 = new FilaSequencial<Integer>();
        FilaSequencial<Integer> fluxo2 = new FilaSequencial<Integer>();
        FilaSequencial<Integer> fluxo3 = new FilaSequencial<Integer>();

    
       for (int i = 0; i < 5; i++) {
            fluxo1.enqueue(2 + (i * 11));
       }
        


        System.out.println(fluxo1);

        System.out.println(fluxo2);

        System.out.println(fluxo3);


        // tranforando em pacotes e enfileirando
        // Pacote pkg1 = new Pacote();
        // Pacote pkg2 = new Pacote();
        // Pacote pkg3 = new Pacote();

        // FilaSequencial canalCompartilhado = new FilaSequencial();

        // for (int i = 0; i < 3; i++) {
        //     pkg1 = Pacote.gerarPacote(1, fila1.dequeue());

        //     canalCompartilhado.enqueue(pkg1); // enfileirando no canal

        //     pkg2 = Pacote.gerarPacote(2, fila2.dequeue());

        //     canalCompartilhado.enqueue(pkg2);

        //     pkg3 = Pacote.gerarPacote(3, fila3.dequeue());

        //     canalCompartilhado.enqueue(pkg3);
        // }


        // printando a Fila do canal
        // while (!canalCompartilhado.qIsEmpty()) {
        //     System.out.println(canalCompartilhado.dequeue());
        // }
   
    }
}