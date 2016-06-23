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
public class CalculaPerimetroIsosceles implements Perimetro {

    float[] lados;

    public CalculaPerimetroIsosceles(float[] medidas) {
        this.lados = medidas;
    }

    @Override
    public float calcula_perimetro() {
        return lados[0] + (lados[1] * 2);
    }

}
