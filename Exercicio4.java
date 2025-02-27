public class Exercicio4 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Ryan");
        a1.setNotaA(10);
        a1.setNotaB(8);
        a1.setNotaC(9);
        a1.setNotaD(9);

        System.out.println(a1.calculaMedia());

        System.out.println(a1.avaliaSituacao());
    }
}