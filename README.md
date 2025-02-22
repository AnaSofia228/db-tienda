# db-tienda

- **Tienda**: Es la entidad principal, que tiene relaciones con clientes, personal, proveedores e inventario.
- **Cliente**: Cada cliente pertenece a una tienda (`ManyToOne`).
- **Personal**: Cada empleado está asignado a una tienda (`ManyToOne`).
- **Inventario**: Cada tienda tiene un único inventario (`OneToOne`).
- **Producto**: Se almacena en un inventario (`ManyToOne`) y puede ser provisto por múltiples proveedores (`ManyToMany`).
- **Proveedor**: Puede abastecer múltiples tiendas (`ManyToMany`) y ofrecer múltiples productos (`ManyToMany`).
