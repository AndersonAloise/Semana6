public class Retangulo extends Forma implements Imprimivel{

    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public double getArea() {
        return lado1 * lado2;
    }

    @Override
    public double getPerimetro() {
        return (lado1 * 2) + (lado2 * 2);
    }


    @Override
    public void imprimir() {
        System.out.printf("Retangulo - Area: %.2f", getArea());
    }
}
