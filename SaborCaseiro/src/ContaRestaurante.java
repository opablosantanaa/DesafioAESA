public class ContaRestaurante {
    Cliente cliente;
    Pedido pedido1;
    Pedido pedido2;
    Pedido pedido3;
    double valorconta;
    double subtotal;
    double desconto;
    double taxa;

    void calcularSubtotal(){
        subtotal = pedido1.valorTotal + pedido2.valorTotal + pedido3.valorTotal;
    }

    void calcularTaxaServico(){
        if (subtotal > 100){
            taxa = (subtotal * 0.1f);
        } else {
            taxa = (subtotal * 0.05f);
        }
    }

    void calcularDesconto(){
        if (this.cliente.nome.substring(0, 1).equalsIgnoreCase("a")){
            desconto = 15;
        } else {
            desconto = 0;
        }
    }

    void calcularValorFinal(){
        calcularSubtotal();
        calcularTaxaServico();
        calcularDesconto();
        valorconta = (subtotal + taxa - desconto);
    }

    void informacoesConta(){
        this.pedido1.calcularTotalItem();
        this.pedido2.calcularTotalItem();
        this.pedido3.calcularTotalItem();
        this.cliente.getPrimeiroNome();
        this.cliente.getNomeMaiusculo();
        calcularValorFinal();
        System.out.println("\n\n======== CONTA | SABOR CASEIRO ========");
        System.out.println("\nCliente: " + this.cliente.nomemaiusculo);
        System.out.println("Primeiro nome: " + this.cliente.primeironome);
        System.out.println("Mesa: " + this.cliente.mesa);
        System.out.println();
        System.out.println("Pedidos:");
        for (int i = 0; i < 3; i++) {
            if (i==0) {
                System.out.println((i + 1) + " - " + this.pedido1.descricao + " | Qtd: " + this.pedido1.quantidade + " | Total: " + this.pedido1.valorTotal);
            } else if (i ==1) {
                System.out.println((i + 1) + " - " + this.pedido2.descricao + " | Qtd: " + this.pedido2.quantidade + " | Total: " + this.pedido2.valorTotal);
            } else {
                System.out.println((i + 1) + " - " + this.pedido3.descricao + " | Qtd: " + this.pedido3.quantidade + " | Total: " + this.pedido3.valorTotal);
            }
        }
        System.out.println();
        System.out.printf("Subtotal: R$ %.2f", subtotal);
        System.out.printf("\nTaxa de serviço: R$ %.2f", taxa);
        System.out.printf("\nDesconto: R$ %.2f", desconto);
        System.out.printf("\nValor final: R$ %.2f", valorconta);
        System.out.println();
        System.out.println("\nDeus é fiel!");
        System.out.println();
        System.out.println("======== CONTA | SABOR CASEIRO ========");
    }

}
