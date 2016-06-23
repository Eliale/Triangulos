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
public class CalculaAreaEquilatero implements Area {

    float[] lados;

    public CalculaAreaEquilatero(float[] medidas) {
        this.lados = medidas;
    }

    @Override
    public float calcula_area() {
        float a = lados[0];
        return (float) ((Math.sqrt(3) / 4) * Math.pow(a, 2));
    }

}
