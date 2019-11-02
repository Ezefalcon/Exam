package venta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private List<Producto> productos;
    private LocalDate date;
    private Cliente cliente;

    public float getTotal() {
        return productos.stream()
                .map(x -> x.getPrecio())
                .reduce(0F,(x,y) -> x + y);
    }

    public List<Producto> getProductos() {
        return new ArrayList<>(productos);
    }

    public LocalDate getDate() {
        return date;
    }
}
