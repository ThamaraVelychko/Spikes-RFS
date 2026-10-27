public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        if (produto == null) {
            throw new IllegalArgumentException(
                    "O produto é obrigatório"
            );
        }

        if (quantidade <= 0) {
            throw new IllegalArgumentException(
                    "A quantidade deve ser positiva"
            );
        }

        if (quantidade > produto.getEstoque()) {
            throw new IllegalArgumentException(
                    "Estoque insuficiente"
            );
        }

        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }
}
