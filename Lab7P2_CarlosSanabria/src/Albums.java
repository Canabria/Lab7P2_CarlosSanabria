
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
public class Albums implements Serializable{
    private String nombre,fecha_p,generoM,format,Aliasp;
    private static final long SerialVersionUID=777L;
    ArrayList<Canciones>C=new ArrayList();
//Constructor
    public Albums(String nombre, String fecha_p, String generoM, String format, String Aliasp) {
        this.nombre = nombre;
        this.fecha_p = fecha_p;
        this.generoM = generoM;
        this.format = format;
        this.Aliasp = Aliasp;
    }
    
//Mutadores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_p() {
        return fecha_p;
    }

    public void setFecha_p(String fecha_p) {
        this.fecha_p = fecha_p;
    }

    public String getGeneroM() {
        return generoM;
    }

    public void setGeneroM(String generoM) {
        this.generoM = generoM;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getAliasp() {
        return Aliasp;
    }

    public void setAliasp(String Aliasp) {
        this.Aliasp = Aliasp;
    }

    public ArrayList<Canciones> getC() {
        return C;
    }

    public void setC(ArrayList<Canciones> C) {
        this.C = C;
    }
    
//ToString
    @Override
    public String toString() {
        return "Albums: " + nombre + ", fecha publicacion: " + fecha_p + ", genero de Musica: " + generoM + ", Format: " + format + ", Alias productor: " + Aliasp;
    }
    
}
