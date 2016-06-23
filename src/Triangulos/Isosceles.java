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
public class Isosceles extends Triangulo {

    public Isosceles(float[] medidas) {
        super(medidas);
        fijar_solucion();
    }

    @Override
    public void fijar_solucion() {
        perimetro = new CalculaPerimetroIsosceles(this.medidas);
        area = new CalculaAreaIsosceles(this.medidas);
        
    }

}
