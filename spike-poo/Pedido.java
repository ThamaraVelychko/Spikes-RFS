import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException(
                    "O cliente é obrigatório"
            );
        }

        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        if (item == null) {
            throw new IllegalArgumentException(
                    "O item é obrigatório"
            );
        }

        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }
}