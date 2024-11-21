package shoplist.lista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shoplist.lista.product.Product;

public interface ProductRepository extends JpaRepository <Product, Long> {


}
