package shoplist.lista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shoplist.lista.product.Product;
import shoplist.lista.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")

public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        this.productRepository.save(product);
        return product;
    }


}
