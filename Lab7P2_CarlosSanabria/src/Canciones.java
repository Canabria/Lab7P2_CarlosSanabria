
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
public class Canciones implements Serializable{
    private String nom;
    private int duracion;
    private String nom_compos,nom_distri,exclusivo,nom_produc;
    private ArrayList<String>adi;
    private static final long SerialVersionUID=777L;

    public Canciones(String nom, int duracion, String nom_compos, String nom_distri, String exclusivo, String nom_produc, ArrayList<String> adi) {
        this.nom = nom;
        this.duracion = duracion;
        this.nom_compos = nom_compos;
        this.nom_distri = nom_distri;
        this.exclusivo = exclusivo;
        this.nom_produc = nom_produc;
        this.adi = adi;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNom_compos() {
        return nom_compos;
    }

    public void setNom_compos(String nom_compos) {
        this.nom_compos = nom_compos;
    }

    public String getNom_distri() {
        return nom_distri;
    }

    public void setNom_distri(String nom_distri) {
        this.nom_distri = nom_distri;
    }

    public String getExclusivo() {
        return exclusivo;
    }

    public void setExclusivo(String exclusivo) {
        this.exclusivo = exclusivo;
    }

    public String getNom_produc() {
        return nom_produc;
    }

    public void setNom_produc(String nom_produc) {
        this.nom_produc = nom_produc;
    }

    public ArrayList<String> getAdi() {
        return adi;
    }

    public void setAdi(ArrayList<String> adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        return "Cancion: " + nom + ", Duracion: " + duracion + ", Nombre compositor: " + nom_compos + ", Nombre de distribuidor: " + nom_distri + ", Exclusivo: " + exclusivo + ", Nombre productor: " + nom_produc + ", Artistas adicionales: " + adi;
    }
    
}
