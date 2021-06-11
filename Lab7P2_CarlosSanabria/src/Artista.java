
import java.io.Serializable;
import java.util.ArrayList;
import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP1
 */
public class Artista implements Serializable{
    //aTRIBUTOS
    private String nombre, generoM,nom_disco,alias,tipoM;
     private static final long SerialVersionUID=777L;
     ArrayList<Albums>A=new ArrayList();
//Constructor
    public Artista(String nombre, String generoM, String nom_disco, String alias, String tipoM) {
        this.nombre = nombre;
        this.generoM = generoM;
        this.nom_disco = nom_disco;
        this.alias = alias;
        this.tipoM = tipoM;
    }
//Mutadores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGeneroM() {
        return generoM;
    }

    public void setGeneroM(String generoM) {
        this.generoM = generoM;
    }

    public String getNom_disco() {
        return nom_disco;
    }

    public void setNom_disco(String nom_disco) {
        this.nom_disco = nom_disco;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTipoM() {
        return tipoM;
    }

    public void setTipoM(String tipoM) {
        this.tipoM = tipoM;
    }

    public ArrayList<Albums> getA() {
        return A;
    }

    public void setA(ArrayList<Albums> A) {
        this.A = A;
    }
     
    //ToString

    @Override
    public String toString() {
        return "Artista: " + nombre + ", Genero Musica: " + generoM + ", Alias=" + alias + ", Tipo de Musica: " + tipoM;
    }
    
    
}
