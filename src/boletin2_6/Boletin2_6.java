
package boletin2_6;

import java.util.Scanner;

public class Boletin2_6 {

    public static void main(String[] args) {
  //entrada por teclado
    float prezoTarifa, prezoPagado ;
    Scanner obx = new Scanner(System.in);
    System.out.println("Teclea Prezo Tarifa :");
    prezoTarifa = obx.nextFloat();
    System.out.println("Teclea Prezo Pagado");
    prezoPagado = obx.nextFloat();
    System.out.println("Desconto ="+ (prezoTarifa- prezoPagado)*100/prezoTarifa + "%");
    }
    
}
