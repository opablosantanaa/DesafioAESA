public class Pedido {
    String descricao;
    double valorUnitario;
    int quantidade;
    double valorTotal;

    public Pedido(String descricao, double valorUnitario, int quantidade){
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    void calcularTotalItem(){
        valorTotal = valorUnitario * quantidade;
    }
}
