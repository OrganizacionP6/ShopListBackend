package shoplist.lista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shoplist.lista.product.Product;
import shoplist.lista.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")

public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        this.productRepository.save(product);
        return product;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        this.productRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Product> buscarById(@PathVariable Long id) {
        return this.productRepository.findById(id);
    }

    @GetMapping
    public List<Product> verTodos() {
        return this.productRepository.findAll();
    }


}
