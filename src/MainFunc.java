import java.util.*;

public class MainFunc {

    public static void main(String[] args) {

        var func = new ArrayList<Funcionario>();

        func.add(new Concursado(4000,5));
        func.add(new Temporario(2000, 12));
        func.add(new Concursado(2400, 34));
        func.add(new Temporario(1200, 10));

        for (Funcionario f : func ) {
            System.out.println("Salário: " + f.getSalarioBase());
        }
    }
}

