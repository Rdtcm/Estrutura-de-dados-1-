public class Circulo {
    private float raio;
    
    //criando o construtor
    public Circulo(float raio) {
        this.raio = raio;
    }

    //criando getters e setters
    public float get_raio() {
        return this.raio;
    }

    public void set_raio (Float raio) {
        this.raio = raio;
    }

    public float calcula_diametro() {
        return this.raio * 2;
    }

    public float calcular_area() {
        return (float) Math.PI * this.raio * this.raio;
    }
    public void imprima() {
        System.out.println("raio: " + raio);
    }
}