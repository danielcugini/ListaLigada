package exercicio10;

public class App {
    public static void main(String[] args) throws Exception {
        Lista l = new Lista();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(10);
        l.add(20);
        l.add(30);

        l.show();
        System.out.println();
        System.out.println(l.size());
        System.out.println("Soma dos valores nas posições ímpares: " + l.somaPosImpares());
    }
}
