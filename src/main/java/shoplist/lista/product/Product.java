package shoplist.lista.product;

import jakarta.persistence.*;

@Entity
@Table (name="Product")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column (name="nameProduct")
    private String nameProduct;

    @Column (name="isBought")
    private boolean isBought;

    public Long getId() {
        return id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public boolean isBought() {
        return isBought;
    }
}


