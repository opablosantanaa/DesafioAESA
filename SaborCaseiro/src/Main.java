public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido("Bife", 50, 2);
        Pedido p2 = new Pedido("Filé", 100, 1);
        Pedido p3 = new Pedido("Nugget", 6, 8);
        ContaRestaurante conta1 = new ContaRestaurante();
        Cliente c1 = new Cliente("Ana Julia", 3);
        conta1.cliente = c1;
        conta1.pedido1 = p1;
        conta1.pedido2 = p2;
        conta1.pedido3 = p3;
        conta1.informacoesConta();
    }
}
