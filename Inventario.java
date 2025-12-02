import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventario {
    private List<Producto> Productos;

    public Inventario(List<Producto> Productos) {
        this.Productos = new ArrayList<>();
    }

    public Iterator<Producto> getIterator() {
        return Productos.iterator();
    }
}
