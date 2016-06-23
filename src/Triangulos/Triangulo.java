/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulos;

/**
 *
 * @author eli
 */
public abstract class Triangulo {

    float[] medidas;
    Perimetro perimetro;
    Area area;

    public Triangulo(float[] medidas) {
        this.medidas = medidas;
    }

    private void mostrar_area() {
        float area_triangulo = area.calcula_area();
        System.out.println("Area es igual: " + area_triangulo);

    }

    private void mostrar_perimetro() {
        float perimetro_triagulo = perimetro.calcula_perimetro();
        System.out.println("Perimetro es igual: " + perimetro_triagulo);
    }

    public void mostrar_medidas() {
        if (medidas.length == 1) {
            System.out.println("Triangulo Equilatero");
            float a = medidas[0];
            System.out.println("Lado A = " + a);
            System.out.println("Lado B = " + a);
            System.out.println("Lado C = " + a);
        }

        if (medidas.length == 2) {
                System.out.println("Triangulo Isosceles");
            float a = medidas[0];
            float b = medidas[1];
            System.out.println("Lado A = " + a);
            System.out.println("Lado B = " + b);
            System.out.println("Lado C = " + b);
        }
        
        if (medidas.length == 3) {
            System.out.println("Triangulo Escaleno");
            float a = medidas[0];
            float b = medidas[1];
            float c = medidas[2];
            System.out.println("Lado A = " + a);
            System.out.println("Lado B = " + b);
            System.out.println("Lado C = " + c);
        }

        mostrar_perimetro();
        mostrar_area();

    }

    public abstract void fijar_solucion();

}
