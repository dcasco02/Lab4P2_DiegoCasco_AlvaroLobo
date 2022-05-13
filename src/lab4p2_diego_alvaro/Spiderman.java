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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }
    
    public float ataque(){
        if(tipo=="Spider Punk"){
            return (float) (ataque*1.15);
        }else if(tipo=="Superior Spiderman"){
            int random;
            random=10+r.nextInt(30);
            random=random/100+1;
            return (float)ataque*random;
        }
        return ataque;
    }
}
