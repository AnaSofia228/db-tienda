package com.example.demo.models;

import java.util.List;


import jakarta.persistence.*;

@Entity
@Table(name = "tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @OneToMany(mappedBy = "tienda", cascade = CascadeType.ALL)
    private List<Cliente> clientes;

    @OneToMany(mappedBy = "tienda", cascade = CascadeType.ALL)
    private List<Personal> personal;

    @OneToOne(mappedBy = "tienda", cascade = CascadeType.ALL)
    private Inventario inventario;

    @ManyToMany(mappedBy = "tiendas")
    private List<Proveedor> proveedores;

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Personal> personal) {
        this.personal = personal;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

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
}
