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
public class CalculaAreaEscaleno implements Area {

    float lados[];

    public CalculaAreaEscaleno(float[] medidas) {
        this.lados = medidas;
    }

    @Override
    public float calcula_area() {
        //System.out.println(Arrays.toString(lados));
        float a = lados[0];
        float b = lados[1];
        float c = lados[2];
        float s = (a + b + c) / 2;
        float sa = s - a;
        float sb = s - b;
        float sc = s - c;
        float ss = (s * (sa) * (sb) * (sc));
 
        return (float) Math.sqrt(ss);

    }

}
