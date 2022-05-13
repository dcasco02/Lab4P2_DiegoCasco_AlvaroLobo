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
public class Personas {
    private String nombre;
    private int ataque;
    private int vida;
    private String nombreuniverso;

    public Personas() {
    }

    public Personas(String nombre, int ataque, int vida, String nombreuniverso) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        this.nombreuniverso = nombreuniverso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombreuniverso() {
        return nombreuniverso;
    }

    public void setNombreuniverso(String nombreuniverso) {
        this.nombreuniverso = nombreuniverso;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", ataque=" + ataque + ", vida=" + vida + ", nombreuniverso=" + nombreuniverso + '}';
    }
            
}
