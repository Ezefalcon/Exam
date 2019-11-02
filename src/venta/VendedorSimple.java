package venta;

import java.util.List;

public class VendedorSimple extends Vendedor {
    private List<Factura> facturas;

    @Override
    public int getCantidadDeVentas() {
        return facturas.size();
    }
}
