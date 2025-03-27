
import javax.sound.sampled.SourceDataLine;

public class ex1DequeGenerics {
    public static void main(String[] args) {
        // construindo o pacote
        Pacote pkg1 = new Pacote();
        Pacote pkg2 = new Pacote();
        Pacote pkg3 = new Pacote();
        Deque canalCompartilhado = new Deque();

        // criando os fluxos 
        Deque fluxo1 = new Deque();
        Deque fluxo2 = new Deque();
        Deque fluxo3 = new Deque();

        for (int i = 0; i < 5; i++) {

            try {
                String pacote1 = pkg1.gerarPacote(1, i+2);
                System.out.println(pacote1);
                canalCompartilhado.enqueueRight(pacote1);
                String pacote2 = pkg2.gerarPacote(2, i+5);
                System.out.println(pacote2);
                canalCompartilhado.enqueueRight(pacote2);
                String pacote3 = pkg3.gerarPacote(3, i+3);
                System.out.println(pacote3);
                canalCompartilhado.enqueueRight(pacote3);
                } catch (Exception e) {
                    System.out.println("Fuck Java!" + e);
            }
        }

        // colocando nos fluxos
        Pacote pacoteAux = new Pacote();
        for (int i = 0; i < 5; i ++) {
            try {
                fluxo1.enqueueRight();
                fluxo2.enqueueRight();
                fluxo3.enqueueRight();
            } catch (Exception e) {
                System.out.println("Fuck Java!" + e);
            }
        }
        System.out.println(fluxo1);
        System.out.println(fluxo2);
        System.out.println(fluxo3);
    }
}