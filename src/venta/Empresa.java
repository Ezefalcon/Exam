package venta;

import java.time.Month;
import java.util.List;

public class Empresa {
    List<Localidad> localidades;
    List<Vendedor> vendedores;
    List<Cliente> clientes;

    public Cliente mayorCantidadDeProductos(Localidad localidad, int month, int year) {
        Localidad location = localidades.stream()
                .filter(x -> x.equals(localidad))
                .findFirst()
                .orElse(null);
        if(location!=null) {
            return location.getVentas().stream()
                    .filter(x -> x.getDate().getMonth().equals(Month.of(month)) && x.getDate().getYear() == year)
                    .max((x, y) -> Integer.compare(x.getProductos().size(),y.getProductos().size()))
                    .map(x -> x.getCliente())
                    .orElse(null);
        }
        return null;
    }

}
