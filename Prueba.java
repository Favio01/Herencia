
public class Prueba {

    public static void main(String[] args) {
        
        Fresco ProductoFresco1 = new Fresco("chile",2017, 7,01, 23489, 2017, 10, 01);
        Fresco ProductoFresco2 = new Fresco("chile",2018, 10,03, 17489, 2018, 12, 03);
        Refrigerado ProductoRefrigerado1 = new Refrigerado("colombia", 856798, 2, 2017, 9, 01, 39897, 2017, 10, 01);
        Refrigerado ProductoRefrigerado2 = new Refrigerado("venezuela", 567423, 3,2017, 8, 07, 56745, 2017, 12, 07);
        Refrigerado ProductoRefrigerado3 = new Refrigerado("ecuador", 897567, 1, 2018, 2, 05, 78935, 2018, 5, 10);
        CongeladoAgua CongPorAgua1 = new CongeladoAgua(0.1, "brazil", 3, 2016, 7, 10, 67809, 2016, 10, 06);
        CongeladoAgua CongPorAgua2 = new CongeladoAgua(0.7, "chile", 2 , 2010, 2, 05, 98568, 2010, 6, 10);
        CongeladoAire CongPorAire1 = new CongeladoAire(9, 11, 3, 7, "ee.uu", 5 , 2012, 5, 22, 23109, 2012, 10, 28);
        CongeladoAire CongPorAire2 = new CongeladoAire(3, 2, 10, 5, "mexico", 3 , 2019, 12, 1, 56701, 2020, 3, 2);
        CongeladoNitrogeno CongPorNitrogeno1 = new CongeladoNitrogeno("congelacion con nitrogeno liquido", 50, "brazil", 7, 2015, 9, 10, 16549, 2015, 12, 20);
        
        System.out.println("Productos:");
        System.out.println("Producto Fresco N°1: " + ProductoFresco1.mostrarDatos());
        System.out.println("Producto Fresco N°2: " + ProductoFresco2.mostrarDatos());
        System.out.println("Producto Refrigerado N°1: " + ProductoRefrigerado1.mostrarDatos());
        System.out.println("Producto Refrigerado N°2: " + ProductoRefrigerado2.mostrarDatos());
        System.out.println("Producto Refrigerado N°3: " + ProductoRefrigerado3.mostrarDatos());
        System.out.println("Producto Congelado por Agua N°1: " + CongPorAgua1.mostrarDatos());
        System.out.println("Producto Congelado por Agua N°2: " + CongPorAgua2.mostrarDatos());
        System.out.println("Producto Congelado por Aire N°1: " + CongPorAire1.mostrarDatos());
        System.out.println("Producto Congelado por Aire N°2: " + CongPorAire2.mostrarDatos());
        System.out.println("Producto Congelado por Nitrogeno: " + CongPorNitrogeno1.mostrarDatos());

    }

}
