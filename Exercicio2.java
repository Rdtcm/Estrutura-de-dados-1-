public class Exercicio2 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(5.0f);

        c1.imprima();

        float diametro = c1.calcula_diametro();
        System.out.println(diametro);

        float area = c1.calcular_area();
        System.out.println(area);
    }
}