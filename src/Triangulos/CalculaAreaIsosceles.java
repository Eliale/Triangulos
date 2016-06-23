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
public class CalculaAreaIsosceles implements Area {

    float[] lados;

    public CalculaAreaIsosceles(float[] medidas) {
        this.lados = medidas;
    }

    @Override
    public float calcula_area() {
        float a = lados[0];
        float b = lados[1];

        return (float) (b * Math.sqrt((Math.pow(a, 2) - (Math.pow(b, 2) / 4)))) / 2;
    }

}
