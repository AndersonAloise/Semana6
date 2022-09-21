import java.util.*;

public class Main {

        public static void imprimir(List<Forma> formas) {
            for (Forma f : formas) {
                System.out.printf("Area: %.2f, Perímetro: %.2f%n", f.getArea(), f.getPerimetro());
            }
        }

    public static void main(String[] args) {
        var formas = new ArrayList<Forma>();
        formas.add(new Retangulo(2,2));
        formas.add(new Circulo(3));
        formas.add(new Retangulo(4,3));
        formas.add((new Circulo(1.5)));
        imprimir(formas);
    }
}

