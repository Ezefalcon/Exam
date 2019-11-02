package venta;

import java.time.Month;
import java.util.ArrayList;
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

    public List<Factura> getVentas() {
        return new ArrayList<>(ventas);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Localidad localidad = (Localidad) o;

        if (name != null ? !name.equals(localidad.name) : localidad.name != null) return false;
        if (vendedores != null ? !vendedores.equals(localidad.vendedores) : localidad.vendedores != null) return false;
        return ventas != null ? ventas.equals(localidad.ventas) : localidad.ventas == null;
    }
}
