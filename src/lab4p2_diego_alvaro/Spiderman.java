/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_diego_alvaro;

import java.util.Random;

/**
 *
 * @author dcasc
 */
public class Spiderman extends Personas {
    private String tipo;
    Random r=new Random();

    public Spiderman() {
        super();
    }

    public Spiderman(String tipo, String nombre, int ataque, int vida, String nombreuniverso) {
        super(nombre, ataque, vida, nombreuniverso);
        this.tipo = tipo;
    }
    public float ataque(){
        if(tipo=="Spider_Punk"){
            return (float) (ataque*0.15);
        }else if(tipo=="Superior-Spiderman"){
            int random;
            random=10+r.nextInt(30);
            random=random/10;
            return (float)ataque*random;
        }
        return ataque;
    }
}
