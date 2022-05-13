/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_diego_alvaro;

/**
 *
 * @author dcasc
 */
public class Enemigos extends Personas {
  private String tipo;

    public Enemigos() {
    super();
    }

    public Enemigos(String tipo, String nombre, int ataque, int vida, String nombreuniverso) {
        super(nombre, ataque, vida, nombreuniverso);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Enemigos{" + "tipo=" + tipo + '}';
    }
    public float ataque(){
        if(tipo=="Blindado"){
            return (float) (ataque*0.10);
        }else if(tipo=="Alienigena"){
            return (float)((float)ataque*0.30);
        }
        return ataque;
    }
}
