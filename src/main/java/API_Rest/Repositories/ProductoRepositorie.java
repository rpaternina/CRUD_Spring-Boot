package API_Rest.Repositories;

import API_Rest.Entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/* JpaRepository --> roporcionar un conjunto completo de métodos predefinidos para realizar
 operaciones comunes de acceso a datos (CRUD) en la base de datos, sin necesidad
 de escribir consultas SQL manualmente */
public interface ProductoRepositorie extends JpaRepository<Producto, Long> {
}
