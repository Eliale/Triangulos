/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulos;

/**
 *
 * @author Eli
 */
public class Main {

    public static void main(String[] args) {
        float[] e = {3};
        System.out.println("Equilatero");

        Triangulo equilatero = new Equilatero(e);
        equilatero.mostrar_medidas();
        System.out.println("Isosceles");
        float[] is = {3, 4};
        Triangulo isosceles = new Isosceles(is);
        isosceles.mostrar_medidas();
        System.out.println("Escaleno");
        float[] es = {32, 30, 24};
        Triangulo escaleno = new Escaleno(es);
        escaleno.mostrar_medidas();

    }
}
