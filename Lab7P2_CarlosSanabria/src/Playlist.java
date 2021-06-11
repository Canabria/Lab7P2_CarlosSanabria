
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP1
 */
public class Playlist implements Serializable{
    private String Nombre;
    private ArrayList<Canciones>C;
    private static final long SerialVersionUID=777L;

    public Playlist(String Nombre, ArrayList<Canciones> C) {
        this.Nombre = Nombre;
        this.C = C;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    

    public ArrayList<Canciones> getC() {
        return C;
    }

    public void setC(ArrayList<Canciones> C) {
        this.C = C;
    }

    @Override
    public String toString() {
        return "Playlist{" + "Nombre=" + Nombre + ", C=" + C + '}';
    }
    
}
