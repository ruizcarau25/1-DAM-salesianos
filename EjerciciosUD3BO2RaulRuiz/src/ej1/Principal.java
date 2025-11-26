package ej1;

import utilidades.Leer;

public class Principal {
    public static void main(String[] args) {
        int opcion;
        int posicion;
        int cantidad;

        // Creamos tienda con 100 productos
        Producto[] listaProductos = new Producto[100];
        Tienda tienda = new Tienda(listaProductos);

        do {
            System.out.println("\n--- MENÚ TIENDA ---");
            System.out.println("1. Añadir producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Comprobar si un producto es frágil");
            System.out.println("4. Calcular cantidad invertida por un producto");
            System.out.println("5. Calcular PVP de un producto");
            System.out.println("6. Calcular posibles ganancias");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = Leer.datoInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = Leer.dato();
                    System.out.print("Precio: ");
                    double precio = Leer.datoDouble();
                    System.out.print("Cantidad: ");
                    int cant = Leer.datoInt();
                    System.out.print("Categoría: ");
                    String categoria = Leer.dato();
                    System.out.print("¿Es frágil? (true/false): ");
                    boolean fragil = Boolean.parseBoolean(Leer.dato());

                    Producto p = new Producto(nombre, precio, false, categoria, cant, fragil);
                    tienda.agregarProducto(p);
                    System.out.println("Producto añadido.");
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE PRODUCTOS ---");
                    System.out.println(tienda.listarProductos());
                    break;

                case 3:
                    System.out.print("Introduce la posición del producto: ");
                    posicion = Leer.datoInt();
                    if (tienda.esFragil(posicion)) {
                        System.out.println("El producto es frágil.");
                    } else {
                        System.out.println("El producto NO es frágil.");
                    }
                    break;

                case 4:
                    System.out.print("Introduce la posicion: ");
                    cantidad = Leer.datoInt();
                    System.out.println("Cantidad total invertida: " + tienda.calcularCantidad(cantidad-1));
                    break;

                case 5:
                    System.out.print("Introduce la posición del producto: ");
                    posicion = Leer.datoInt();
                    double pvp = tienda.getProducto()[posicion-1].calcularPVP(21); // ejemplo 21% IVA
                    System.out.println("PVP del producto: " + pvp);
                    break;

                case 6:
                    System.out.println("Ganancias posibles: " + tienda.calcularGanancias(25));
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opcion != 0);
    }
}