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
public class Equilatero extends Triangulo{

    public Equilatero(float[] medidas) {
        super(medidas);
        fijar_solucion();
    }


    @Override
    public void fijar_solucion() {
       perimetro = new CalculaPerimetroEquilatero(this.medidas);
       area = new CalculaAreaEquilatero(this.medidas);
       
    }
    
}
