package venta;

import java.util.List;

public class VendedorJefe extends Vendedor {
    List<Vendedor> vendedores;

    @Override
    public int getCantidadDeVentas() {
        return vendedores.stream().
                map(x -> x.getCantidadDeVentas())
                .reduce(Integer::sum)
                .orElse(0);
    }
}
