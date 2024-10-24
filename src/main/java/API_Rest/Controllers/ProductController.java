package API_Rest.Controllers;

import API_Rest.Entities.Producto;
import API_Rest.Repositories.ProductoRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductController {

    @Autowired
    private ProductoRepositorie productoRepositorie;

    @GetMapping
    public List<Producto> getAllProducts() {
        return productoRepositorie.findAll();
    }

    @GetMapping("/{id}")
    public Producto getByProduct(@PathVariable Long id) {
        // Devolvemos el producto con el id seleccionado
        return productoRepositorie.findById(id)
                // Si no es devolvido mostramos un error
                .orElseThrow(() -> new RuntimeException("No se encontro producto con id : " + id));
    }

    @PostMapping
    public Producto postProduct(@RequestBody Producto producto) {
        return productoRepositorie.save(producto);
    }

    @PutMapping("/{id}")
    public Producto putProduct(@PathVariable Long id, @RequestBody Producto producto) {
        // Si encuentra un producto lo guarda en la variable producto1
        Producto producto1 = productoRepositorie.findById(id)
                // Si no es devolvido mostramos un error
                .orElseThrow(() -> new RuntimeException("No se encontro producto con id : " + id));

        //Lo que hacemos aqui es que el nuevo producto guarde los nuevos datos en el producto encontrado
        producto1.setNombre(producto.getNombre());
        producto1.setPrecio(producto.getPrecio());

        //Retornamos el producto actualizado
        return productoRepositorie.save(producto1);
    }

    @DeleteMapping("/{id}")
    public String deletProduct(@PathVariable Long id){
        Producto producto1 = productoRepositorie.findById(id)
                // Si no es devolvido mostramos un error
                .orElseThrow(() -> new RuntimeException("No se encontro producto con id : " + id));

        productoRepositorie.delete(producto1);
        return "Producto" + id + " eliminado";
    }
}
