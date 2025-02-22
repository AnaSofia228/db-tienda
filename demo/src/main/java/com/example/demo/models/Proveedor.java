package com.example.demo.models;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "proveedor")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @ManyToMany
    @JoinTable(
        name = "tienda_proveedor",
        joinColumns = @JoinColumn(name = "proveedor_id"),
        inverseJoinColumns = @JoinColumn(name = "tienda_id")
    )
    private List<Tienda> tiendas;

    @ManyToMany
    @JoinTable(
    name = "proveedor_producto",
    joinColumns = @JoinColumn(name = "proveedor_id"),
    inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    private List<Producto> productos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tienda> getTiendas() {
        return tiendas;
    }

    public void setTiendas(List<Tienda> tiendas) {
        this.tiendas = tiendas;
    }

    public List<Producto> getProductos() {
        return productos;
    }
    
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
