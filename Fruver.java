/*
Analisis:
*descripcion: vamos a 
*Entradas: dos, la cantidad de manznas y bananos
*Salidas: el subtotal, precio completo, descuento, total con el descuento
*Ejemplo:
            5 manzanas
            3 bananos
            precio manzanas = 1000
            precio bananos = 800
            subtotal M = 5*1000 = 5000
            subtotal B = 3*800 = 2400

            total de la compra = sutotal M + subtotal B = 5000 + 2400 = 7400

            descuento = 7400 * 10% = 740

            precio final con descuento = 6660


*/
import java.util.Scanner; 

public class Fruver { 

    public static void main(String[] args){ 
        
        final double PRECIO_MANZANA = 1000;
        final double PRECIO_BANANO = 800;

        Scanner entrada = new Scanner(System.in);

        double manzanas, bananos;

        System.out.println("Por favor dame la cantidad de manzanas que deseas comprar: ");
        manzanas = entrada.nextDouble();
        entrada.nextLine(); 
        System.out.println("Por favor dame la cantidad de bananos que deseas comprar: ");
        bananos = entrada.nextDouble();
        entrada.nextLine();

        double subtotal1, subtotal2, total, descuento, pago;
        
        subtotal1 = comprar1(manzanas, PRECIO_MANZANA);
        subtotal2 = comprar2(bananos, PRECIO_BANANO);

        System.out.println("El subtotal de tu compra de manzanas es: " + subtotal1);
        System.out.println("El subtotal de tu compra de bananos es: " + subtotal2);

        total = facturar(subtotal1, subtotal2);

        System.out.println("El total de tu compra es: " + total);

        descuento = descontar(total);

        System.out.println("Por tu compra tienes un descuento del 10% y lo que se te descontara es: " + descuento);

        pago = pagar(total, descuento);

        System.out.println("El dinero que debes pagar es: " + pago);
    }

    public static double comprar1(double a, double b){
        return a * b;
    }

    public static double comprar2(double a, double b){
        return a * b;
    }

    public static double facturar(double a, double b){
        return a + b;
    }

    public static double descontar(double a){
        double descuento = a * 0.1;
        return descuento;
    }

    public static double pagar(double a, double b){
        return a - b;
    }
}
