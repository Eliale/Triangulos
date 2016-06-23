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
public class Escaleno extends Triangulo{

    public Escaleno(float[] medidas) {
        super(medidas);
        fijar_solucion();
    }


    @Override
    public void fijar_solucion() {
       perimetro=new CalculaPerimetroEscaleno(this.medidas);
       area =new  CalculaAreaEscaleno(this.medidas);
    }
    
}
