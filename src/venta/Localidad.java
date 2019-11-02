package venta;

import java.time.Month;
import java.util.List;

public class Localidad {
    private String name;
    private List<Vendedor> vendedores;
    private List<Factura> ventas;

    public float getTotalDeMes(int monthNumber, int year) {
        return ventas.stream()
                .filter(x -> x.getDate().getMonth().equals(Month.of(monthNumber)) && x.getDate().getYear() == year)
                .map(x -> x.getTotal())
                .reduce((x, y) -> x +y)
                .orElse(0F);
    }
}
